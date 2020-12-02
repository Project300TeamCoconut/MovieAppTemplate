package com.example.movieapptemplate.ui.moviecards;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import com.example.movieapptemplate.R;

public class MovieCardsFragment extends Fragment {

    private MovieCardsViewModel movieCardsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        movieCardsViewModel =
                ViewModelProviders.of(this).get(MovieCardsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_moviecards, container, false);
        final TextView textView = root.findViewById(R.id.text_moviecards);
        movieCardsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}