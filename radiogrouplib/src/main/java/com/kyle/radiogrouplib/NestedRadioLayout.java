package com.kyle.radiogrouplib;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by Jiang on 2018/8/2. 11:56
 * mail:jiangwei_android@163.com
 */

public class NestedRadioLayout extends BaseRadioLayout {

    public NestedRadioLayout(Context context) {
        super(context);
    }

    public NestedRadioLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NestedRadioLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public NestedRadioLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void toggle() {
        if (!isChecked()) {
            super.toggle();
        }
    }

}

