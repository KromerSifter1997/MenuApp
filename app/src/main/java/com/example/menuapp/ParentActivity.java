package com.example.menuapp;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.menuapp.MainActivity;
import com.example.menuapp.MainActivity2;
import com.example.menuapp.R;

public class ParentActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.fdsfd, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_add)
        {
            // code here for the add icon
            return true;
        }
        else if (item.getItemId() == R.id.action_logout)
        {
            // code here for the add icon
            return true;
        }
        else if (item.getItemId() == R.id.action_about)
        {
            Intent intent = new Intent (ParentActivity.this, MainActivity2.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
