package com.example.movieapptemplate.ui.moviecards;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MovieCardsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MovieCardsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Movie Cards fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}