package com.kyle.nestedselectionradiogroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.kyle.radiogrouplib.BaseRadioLayout;
import com.kyle.radiogrouplib.NestedRadioGroup;
import com.kyle.radiogrouplib.NestedRadioLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NestedRadioGroup group = findViewById(R.id.nestedGroup);

        group.setOnCheckedChangeListener(new NestedRadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(NestedRadioGroup group, int checkedId) {
                Log.d("MainActivity", checkedId + "");
            }
        });


    }

    private void bindListener(final NestedRadioLayout compoundLayout) {
        compoundLayout.setOnCheckedChangeListener(new NestedRadioLayout.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(BaseRadioLayout baseRadioLayout, boolean checked) {
                if (checked) {
                    if (compoundLayout.getId() == R.id.rl_start_time) {




                    } else if (compoundLayout.getId() == R.id.rl_end_time) {

                    } else if (compoundLayout.getId() == R.id.rl_week) {


                    } else if (compoundLayout.getId() == R.id.rl_month) {

                    } else if (compoundLayout.getId() == R.id.rl_three_month) {

                    }
                }
            }


        });
    }
}
