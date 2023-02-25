package com.example.fragmentexample1updated;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private boolean isFragmentDisplayed = false;
    private View fragment1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.button1);
        fragment1 = findViewById(R.id.fragment);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isFragmentDisplayed) {
                    displayFragment();
                } else {
                    closeFragment();
                }
            }
        });
    }

    public void displayFragment() {
        SimpleFragment2 simpleFragment = SimpleFragment2.newInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();

        fragmentTransaction.add(R.id.fragment_container, simpleFragment).addToBackStack(null).commit();
        fragment1.setVisibility(View.GONE);
        mButton.setText(R.string.button2);
        isFragmentDisplayed = true;
    }

    public void closeFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        SimpleFragment2 simpleFragment = (SimpleFragment2) fragmentManager
                .findFragmentById(R.id.fragment_container);
        if (simpleFragment != null) {
                    FragmentTransaction fragmentTransaction =
                    fragmentManager.beginTransaction();
            fragmentTransaction.remove(simpleFragment).commit();
        }
        fragment1.setVisibility(View.VISIBLE);
        mButton.setText(R.string.button1);
        isFragmentDisplayed = false;
    }



}