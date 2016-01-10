package com.course.hsfreitas.laughoutloud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.course.hsfreitas.libandroid.RobbitActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchAndroidLib(View view){
        // JokeLib playit = new JokeLib();
        // Toast.makeText(this, playit.jokeA(), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(getBaseContext(), RobbitActivity.class);
        startActivity(intent);
    }

}
