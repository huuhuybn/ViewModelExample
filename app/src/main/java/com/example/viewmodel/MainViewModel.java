package com.example.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {


    MutableLiveData<Integer> count =
            new MutableLiveData<>();
    int number = 0;

    void add(){
        count.postValue(++number);
    }
    //  dc goi khi clear data
    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
