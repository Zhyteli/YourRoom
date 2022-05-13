package com.example.yourroom;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import com.example.yourroom.databinding.ActivityMainBinding;

public class SearchActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
    public void onClickSearchNavigation(MenuItem item) {

    }
    public void onClickFavoritesNavigation(MenuItem item) {
        Intent intent = new Intent(SearchActivity.this, FavoritesActivity.class);
        startActivity(intent);
    }
    public void onClickAddNavigation(MenuItem item) {
        Intent intent = new Intent(SearchActivity.this, AddActivity.class);
        startActivity(intent);
    }
    public void onClickNotificationsNavigation(MenuItem item) {
        Intent intent = new Intent(SearchActivity.this, NotificationsActivity.class);
        startActivity(intent);
    }
    public void onClickProfileNavigation(MenuItem item) {
        Intent intent = new Intent(SearchActivity.this, ProfileActivity.class);
        startActivity(intent);
    }


}
