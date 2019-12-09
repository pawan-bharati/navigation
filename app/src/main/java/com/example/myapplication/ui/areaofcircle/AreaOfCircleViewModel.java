package com.example.myapplication.ui.areaofcircle;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AreaOfCircleViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public AreaOfCircleViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is area of circle fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
