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

public class Rabu extends Fragment {


    public Rabu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.content_rabu, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getActivity().setTitle("Rabu");

        ListView listView = (ListView) getActivity().findViewById(R.id.listrabu);
        SimpleArrayAdapter adapter;

        ArrayList<String> arrayList = new ArrayList<>();
        String[] jrabu = new String[]{
            "Otomata dan Bahasa Formal 08.00 - 09.45",
            "Praktikum Struktur Data 10.00 - 11.45",
            "Pra Skripsi 13.00 - 14.45"
        };

        Collections.addAll(arrayList, jrabu);
        adapter = new SimpleArrayAdapter(getContext(), android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
    }
}

