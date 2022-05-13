package com.example.yourroom;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.example.yourroom.databinding.ActivityMainBinding;

public class FavoritesActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

    }

    public void onClickSearchNavigation(MenuItem item) {
        Intent intent = new Intent(FavoritesActivity.this, SearchActivity.class);
        startActivity(intent);
    }
    public void onClickFavoritesNavigation(MenuItem item) {
    }
    public void onClickAddNavigation(MenuItem item) {
        Intent intent = new Intent(FavoritesActivity.this, AddActivity.class);
        startActivity(intent);
    }
    public void onClickNotificationsNavigation(MenuItem item) {
        Intent intent = new Intent(FavoritesActivity.this, NotificationsActivity.class);
        startActivity(intent);
    }
    public void onClickProfileNavigation(MenuItem item) {
        Intent intent = new Intent(FavoritesActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}
