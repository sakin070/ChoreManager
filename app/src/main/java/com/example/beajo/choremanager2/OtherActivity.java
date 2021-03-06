package com.example.beajo.choremanager2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
    }

    public void shoppingButtonClick(View view){//Starts Shopping activity
        Intent shoppingIntent = new Intent(getApplicationContext(), ShoppingActivity.class);
        startActivity(shoppingIntent);

    }

    public void peopleButtonClick(View view){//Starts people_list activity
        Intent peopleIntent = new Intent(getApplicationContext(), activity_people_list.class);
        startActivity(peopleIntent);

    }

    public void tasksButtonClick(View view){//Starts ChoreList activity
        Intent tasksIntent = new Intent(getApplicationContext(), ActivityChoreList.class);
        startActivity(tasksIntent);
    }

    public void cupFriButtonClick(View view){//Starts ChoreList activity
        Intent cupFriIntent = new Intent(getApplicationContext(), CupboardFridgeActivity.class);
        startActivity(cupFriIntent);
    }

    public void toolButtonClick(View view){//Starts ChoreList activity
        Intent toolsIntent = new Intent(getApplicationContext(), ToolsActivity.class);
        startActivity(toolsIntent);
    }
}
