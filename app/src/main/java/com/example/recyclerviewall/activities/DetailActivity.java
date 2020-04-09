package com.example.recyclerviewall.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.recyclerviewall.R;
import com.example.recyclerviewall.models.Resort;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_RESORT = "extra_resort";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.img_detail);
        TextView name = findViewById(R.id.tv_name_detail);
        TextView description = findViewById(R.id.tv_desc_detail);
        TextView elevation = findViewById(R.id.tv_elevation_detail);
        TextView country = findViewById(R.id.tv_country_detail);

        Resort resort = getIntent().getParcelableExtra(EXTRA_RESORT);

        Glide.with(this).load(resort.getPhoto()).into(imageView);
        name.setText(resort.getName());
        description.setText(resort.getDescription());
        elevation.setText(resort.getElevation());
        country.setText(resort.getLocation());
    }
}
