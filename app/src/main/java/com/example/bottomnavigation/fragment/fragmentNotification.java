package com.example.bottomnavigation.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomnavigation.R;
import com.example.bottomnavigation.adapter.MessageAdapter;
import com.example.bottomnavigation.model.Messaage;

import java.util.ArrayList;
import java.util.List;

public class fragmentNotification extends Fragment {
    MessageAdapter messageAdapter;
    RecyclerView recyclerView;
    List<Messaage> list;

    public fragmentNotification() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_noti, container, false);
        list = new ArrayList<>();
        list.add(new Messaage(R.drawable.ic_cat, "Thach", "Em an com chua?", "10:00"));
        list.add(new Messaage(R.drawable.ic_chub, "Quang", "Em an com chua?", "12:00"));
        list.add(new Messaage(R.drawable.ic_cat, "Thach", "Em an com chua?", "14:00"));
        list.add(new Messaage(R.drawable.ic_chub, "Quynh", "Em an com chua?", "16:00"));
        list.add(new Messaage(R.drawable.ic_cat, "Manh", "Em an com chua?", "15:00"));
        list.add(new Messaage(R.drawable.ic_chub, "Quang", "Em an com chua?", "1:00"));
        recyclerView = view.findViewById(R.id.recycleView);
        LinearLayoutManager manager = new LinearLayoutManager(view.getContext(), RecyclerView.VERTICAL, false);
        messageAdapter = new MessageAdapter(view.getContext(), list);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(messageAdapter);
        return view;
    }
}
