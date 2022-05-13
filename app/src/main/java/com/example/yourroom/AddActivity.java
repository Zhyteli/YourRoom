package com.example.yourroom;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class AddActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

    }

    public void onClickSearchNavigation(MenuItem item) {
        Intent intent = new Intent(AddActivity.this, SearchActivity.class);
        startActivity(intent);
    }
    public void onClickFavoritesNavigation(MenuItem item) {
        Intent intent = new Intent(AddActivity.this, FavoritesActivity.class);
        startActivity(intent);
    }
    public void onClickAddNavigation(MenuItem item) {
    }
    public void onClickNotificationsNavigation(MenuItem item) {
        Intent intent = new Intent(AddActivity.this, NotificationsActivity.class);
        startActivity(intent);
    }
    public void onClickProfileNavigation(MenuItem item) {
        Intent intent = new Intent(AddActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}
