/* Madayizana NSM
   2016073062
   ListFragment class
   19 April 2023
   CSIP 6853 */

package com.example.a2016073062listfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment1 fragment1 = new Fragment1();
        getSupportFragmentManager().beginTransaction().replace(R.id.fmLayout, fragment1).commit();
    }
}