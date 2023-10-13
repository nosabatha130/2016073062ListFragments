/* Madayizana NSM
   2016073062
   ListFragment class
   19 April 2023
   CSIP 6853 */

package com.example.a2016073062listfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Fragment1 extends ListFragment {

    String[] codeName = {"Froyo", "GingerBread", "HoneyComb", "IceCream Sandwich", "JellyBean", "KitKat", "Lollipop", "Marshmallow"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstaceState){
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(),
                android.R.layout.simple_list_item_1, codeName);
        setListAdapter(adapter);
        return view;
    }

    @Override
    public void onListItemClick (ListView listView, View view, int position, long id){
        Toast.makeText(getActivity().getBaseContext(), codeName[position], Toast.LENGTH_SHORT).show();
    }
}