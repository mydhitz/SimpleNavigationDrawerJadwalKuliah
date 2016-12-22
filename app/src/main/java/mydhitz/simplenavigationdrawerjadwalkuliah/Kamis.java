package mydhitz.simplenavigationdrawerjadwalkuliah;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by dhitz on 14/12/2016.
 */

public class Kamis extends Fragment {


    public Kamis() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.content_kamis, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getActivity().setTitle("Kamis");

        ListView listView = (ListView) getActivity().findViewById(R.id.listkamis);
        SimpleArrayAdapter adapter;

        ArrayList<String> arrayList = new ArrayList<>();
        String[] jkamis = new String[]{
            "Praktikum Pengantar Multimedia 08.00 - 10.00",
            "Perancangan Antar Muka Mobile 10.00 - 11.45",
            "Teknologi Mobile 15.00 - 16.45"
        };

        Collections.addAll(arrayList, jkamis);
        adapter = new SimpleArrayAdapter(getContext(), android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
    }
}

