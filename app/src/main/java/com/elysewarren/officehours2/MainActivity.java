package com.elysewarren.officehours2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Dog> dogs;
    private DogsAdapter dogsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dogsAdapter = new DogsAdapter(dogs, this);
        recyclerView.setAdapter(dogsAdapter);
    }

    public void addRandomDog(View view) {
        dogs.add(getRandomDog());
        dogsAdapter.notifyDataSetChanged();
    }

    private void initialData() {
        dogs = new ArrayList<>();
        dogs.add(new Dog("Cute Puppy", "1 years old", R.drawable.puppy));
        dogs.add(new Dog("Cute puppy 2", "2 years old", R.drawable.impossiblycutepuppy));
        dogs.add(new Dog("Cute puppy 3", "6 months old", R.drawable.adorable));
    }

    private Dog getRandomDog() {
        int num = (int) (Math.random() * 3);
        if (num == 0)
            return new Dog("Cute Puppy", "1 years old", R.drawable.puppy);
        else if (num == 1)
            return new Dog("Cute puppy 2", "2 years old", R.drawable.impossiblycutepuppy);
        else
            return new Dog("Cute puppy 3", "6 months old", R.drawable.adorable);
    }


}