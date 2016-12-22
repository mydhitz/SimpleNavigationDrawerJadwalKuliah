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

import static java.security.AccessController.getContext;

/**
 * Created by dhitz on 14/12/2016.
 */

public class Senin extends Fragment {

    public Senin() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.content_senin, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getActivity().setTitle("Senin");

        ListView listView = (ListView) getActivity().findViewById(R.id.listsenin);
        SimpleArrayAdapter adapter;

        ArrayList<String> arrayList = new ArrayList<>();
        String[] jsenin = new String[]{
            "Teknologi Animasi 15.00 - 17.00",
            "Etika Profesi 17.00 - 18.30",
        };

        Collections.addAll(arrayList, jsenin);
        adapter = new SimpleArrayAdapter(getContext(), android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
    }
}

