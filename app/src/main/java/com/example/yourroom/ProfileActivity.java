package com.example.yourroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void onClickSearchNavigation(MenuItem item) {
        Intent intent = new Intent(ProfileActivity.this, SearchActivity.class);
        startActivity(intent);
    }
    public void onClickFavoritesNavigation(MenuItem item) {
        Intent intent = new Intent(ProfileActivity.this, FavoritesActivity.class);
        startActivity(intent);
    }
    public void onClickAddNavigation(MenuItem item) {
        Intent intent = new Intent(ProfileActivity.this, AddActivity.class);
        startActivity(intent);
    }
    public void onClickNotificationsNavigation(MenuItem item) {
        Intent intent = new Intent(ProfileActivity.this, NotificationsActivity.class);
        startActivity(intent);
    }
}