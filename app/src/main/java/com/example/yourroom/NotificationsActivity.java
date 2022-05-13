package com.example.yourroom;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class NotificationsActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

    }

    public void onClickSearchNavigation(MenuItem item) {
        Intent intent = new Intent(NotificationsActivity.this, SearchActivity.class);
        startActivity(intent);
    }
    public void onClickFavoritesNavigation(MenuItem item) {
        Intent intent = new Intent(NotificationsActivity.this, FavoritesActivity.class);
        startActivity(intent);
    }
    public void onClickAddNavigation(MenuItem item) {
        Intent intent = new Intent(NotificationsActivity.this, AddActivity.class);
        startActivity(intent);
    }
    public void onClickNotificationsNavigation(MenuItem item) {
    }
    public void onClickProfileNavigation(MenuItem item) {
        Intent intent = new Intent(NotificationsActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}
