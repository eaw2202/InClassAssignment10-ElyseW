package com.elysewarren.officehours2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by elysewarren on 4/12/17.
 */

public class DogViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView dogNameView;
    private TextView dogInfoView;
    private ImageView dogPhotoView;
    private Context context;

    public DogViewHolder(View itemView, Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        dogNameView = (TextView) itemView.findViewById(R.id.dog_name);
        dogInfoView = (TextView) itemView.findViewById(R.id.dog_info);
        dogPhotoView = (ImageView) itemView.findViewById(R.id.dog_photo);
        this.context = context;
    }

    public void bind(final
                     Dog dog) {
        dogNameView.setText(dog.name);
        dogInfoView.setText(dog.info);
        dogPhotoView.setImageResource(dog.photoId);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, dogNameView.getText(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, SecondActivity.class);
                intent.putExtra(Key.DOG_KEY, dog);
                context.startActivity(intent);
            }
        });
    }
}
