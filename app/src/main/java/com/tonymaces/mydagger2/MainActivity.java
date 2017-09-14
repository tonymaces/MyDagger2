package com.tonymaces.mydagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    CapAmerica mHero;

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView= (TextView)findViewById(R.id.txtValueSearch);
        ((MainApp) getApplicationContext()).getWeaponComponent().inject(this);
    }

    @Override
    protected void onResume(){
        super.onResume();

        mTextView.setText(mHero.getWeaponName());
    }
}
