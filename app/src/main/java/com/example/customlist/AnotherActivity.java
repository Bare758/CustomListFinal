package com.example.customlist;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    ImageView imageView;
    TextView name, description;
    int position;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);


        }

        imageView = findViewById(R.id.another_imageView);
        name = findViewById(R.id.nameText);
        description = findViewById(R.id.descriptionText);

        if (position == 0) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aName = intent.getStringExtra("NAME");
            String aDescription = intent.getStringExtra("DESCRIPTIONS");

            imageView.setImageResource(pic);
            name.setText(aName);
            description.setText(aDescription);

            actionBar.setTitle(aName);


        }
        if (position == 1) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aName = intent.getStringExtra("NAME");
            String aDescription = intent.getStringExtra("DESCRIPTIONS");

            imageView.setImageResource(pic);
            name.setText(aName);
            description.setText(aDescription);

            actionBar.setTitle(aName);
        }
        if (position == 2) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aName = intent.getStringExtra("NAME");
            String aDescription = intent.getStringExtra("DESCRIPTIONS");

            imageView.setImageResource(pic);
            name.setText(aName);
            description.setText(aDescription);

            actionBar.setTitle(aName);

        }
        if (position == 3) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aName = intent.getStringExtra("NAME");
            String aDescription = intent.getStringExtra("DESCRIPTIONS");

            imageView.setImageResource(pic);
            name.setText(aName);
            description.setText(aDescription);

            actionBar.setTitle(aName);
        }

        if (position == 4) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aName = intent.getStringExtra("NAME");
            String aDescription = intent.getStringExtra("DESCRIPTIONS");

            imageView.setImageResource(pic);
            name.setText(aName);
            description.setText(aDescription);

            actionBar.setTitle(aName);

        }

        if (position == 5) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aName = intent.getStringExtra("NAME");
            String aDescription = intent.getStringExtra("DESCRIPTIONS");

            imageView.setImageResource(pic);
            name.setText(aName);
            description.setText(aDescription);

            actionBar.setTitle(aName);


        }
        if (position == 6) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aName = intent.getStringExtra("NAME");
            String aDescription = intent.getStringExtra("DESCRIPTIONS");

            imageView.setImageResource(pic);
            name.setText(aName);
            description.setText(aDescription);

            actionBar.setTitle(aName);
        }

    }

}