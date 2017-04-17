package com.elysewarren.officehours2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView dogName;
    private ImageView dogPhoto;
    private TextView dogInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        dogName = (TextView) findViewById(R.id.dog_name);
        dogPhoto = (ImageView) findViewById(R.id.dog_photo);
        dogInfo = (TextView) findViewById(R.id.dog_info);

        Intent intent = getIntent();
        Dog dog = (Dog) intent.getSerializableExtra(Key.DOG_KEY);

        dogName.setText(dog.name);
        dogPhoto.setImageResource(dog.photoId);
        dogInfo.setText(dog.info);


    }
}
