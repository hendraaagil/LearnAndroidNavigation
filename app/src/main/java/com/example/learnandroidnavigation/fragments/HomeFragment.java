package com.example.learnandroidnavigation.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.learnandroidnavigation.OtherActivity;
import com.example.learnandroidnavigation.R;
import com.example.learnandroidnavigation.TabbedActivity;

public class HomeFragment extends Fragment {
    private Button btnOpenOther, btnOpenTabbed;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnOpenOther = getView().findViewById(R.id.btnOpenOther);
        btnOpenOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOtherActivity();
            }
        });

        btnOpenTabbed = getView().findViewById(R.id.btnOpenTabbed);
        btnOpenTabbed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTabbedActivity();
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    private void openTabbedActivity() {
        startActivity(new Intent(HomeFragment.this.getActivity(), TabbedActivity.class));
    }

    private void openOtherActivity() {
        Intent intent = new Intent(HomeFragment.this.getActivity(), OtherActivity.class);
        startActivity(intent);
    }
}
