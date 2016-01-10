package com.course.hsfreitas.laughoutloud;

import android.app.Application;
import android.content.Context;
import android.support.v4.util.Pair;
import android.test.ApplicationTestCase;

import com.example.JokeLib;

import java.util.concurrent.CountDownLatch;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    String mJsonString = null;
    Exception mError = null;
    CountDownLatch signal = null;


    public ApplicationTest() {
        super(Application.class);
    }

    @Override
    protected void setUp() throws Exception{
        signal = new CountDownLatch(1);
    }

    @Override
    protected void tearDown() throws Exception{
        signal.countDown();

    }



    public void testEndpointAsyncTask() throws InterruptedException{
        Context context = getContext();
        JokeLib joke = new JokeLib();
        EndpointsAsyncTask endpoint = new EndpointsAsyncTask();
        endpoint.setListener(new EndpointsAsyncTask.JsonGetTaskListener() {
            @Override
            public void onComplete(String jsonString, Exception e) {
                mJsonString = jsonString;
                mError = e;
                signal.countDown();
            }
        }).execute(new Pair<Context, String>(context, joke.jokeA()));
        signal.await();
        assertTrue(mJsonString, !mJsonString.isEmpty());
        //assertTrue(!mJsonString.isEmpty());
    }
}