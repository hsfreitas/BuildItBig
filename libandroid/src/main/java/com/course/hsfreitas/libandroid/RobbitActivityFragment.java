package com.course.hsfreitas.libandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class RobbitActivityFragment extends Fragment {

    private TextView jokeview;

    public RobbitActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_robbit, container, false);

        jokeview = (TextView) root.findViewById(com.course.hsfreitas.libandroid.R.id.joke_txt);

        Intent intent = getActivity().getIntent();
        if(intent != null){
            String joke = intent.getStringExtra(intent.EXTRA_TEXT);
            jokeview.setText(joke);
        }else{

            jokeview.setText("No joke available");
        }





        return root;
    }



}
