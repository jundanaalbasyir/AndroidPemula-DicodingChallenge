package com.jundana.dicodingchallenge_jundana;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jundana.dicodingchallenge_jundana.Adapters.AnimalsAdapters;
import com.jundana.dicodingchallenge_jundana.Models.Animals;

import java.util.ArrayList;

public class AnimalFragment extends Fragment {
    private RecyclerView rvAnimals;
    private ArrayList<Animals> list = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedIntanceState){
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);

        rvAnimals = view.findViewById(R.id.rv_animals);
        rvAnimals.setHasFixedSize(true);

        list.addAll(AnimalsData.getListData());
        showRecyclerList();

        return view;
    }

    private void showRecyclerList() {
        rvAnimals.setLayoutManager(new LinearLayoutManager(getActivity()));

        AnimalsAdapters listAnimalAdapter = new AnimalsAdapters(getActivity(), list);
        rvAnimals.setAdapter(listAnimalAdapter);
    }
}
