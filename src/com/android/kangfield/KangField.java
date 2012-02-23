package com.android.kangfield;

import android.app.Activity;
import android.os.Bundle;

public class KangField extends Activity {

    private KangFieldView mView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = new KangFieldView(this);
        setContentView(mView);
    }
}
