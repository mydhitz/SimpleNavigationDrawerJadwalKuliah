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

public class Selasa extends Fragment {


    public Selasa() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.content_selasa, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getActivity().setTitle("Selasa");

        ListView listView = (ListView) getActivity().findViewById(R.id.listselasa);
        SimpleArrayAdapter adapter;

        ArrayList<String> arrayList = new ArrayList<>();
        String[] jselasa = new String[]{
            "Pengantar Multimedia 10.00 - 11.45",
            "Keamanan Jaringan 13.00 - 12.45",
            "Praktikum Teknologi Animasi 15.00 - 16.45"
        };

        Collections.addAll(arrayList, jselasa);
        adapter = new SimpleArrayAdapter(getContext(), android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
    }
}

