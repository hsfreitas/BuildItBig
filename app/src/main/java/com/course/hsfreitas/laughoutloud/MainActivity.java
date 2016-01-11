package com.course.hsfreitas.laughoutloud;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.course.hsfreitas.libandroid.RobbitActivity;
import com.example.JokeLib;

import java.util.concurrent.CountDownLatch;

public class MainActivity extends AppCompatActivity {

    private TextView jokeview;
    private EndpointsAsyncTask tellJoke = new EndpointsAsyncTask();

    private JokeLib joke;
    private String mJsonString = null;
    private Exception mError = null;
    private CountDownLatch signal = new CountDownLatch(1);
    private String jokeresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        joke = new JokeLib();
        tellJoke.execute(new Pair<Context, String>(getBaseContext(), joke.jokeA()));


    }


    public void launchAndroidLib(View view){

        Intent intentJoke = new Intent(getBaseContext(), RobbitActivity.class);
        intentJoke.putExtra(intentJoke.EXTRA_TEXT, tellJoke.getJokeresult());
        startActivity(intentJoke);

    }

}
