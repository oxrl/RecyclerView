package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.recyclerview.dummy.DummyContent;

public class MainActivity extends AppCompatActivity implements RestauranteFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
