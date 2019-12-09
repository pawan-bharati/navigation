package com.example.myapplication.ui.simpleintrest;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SimpleIntrestViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public SimpleIntrestViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is simple intrest fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
