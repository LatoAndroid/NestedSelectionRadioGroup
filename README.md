# NestedSelectionVideoGroup
## 可无限嵌套选择的radiogroup，radiogroup内部的控件选择状态完全跟随外部一起变化，可嵌套viewgroup

### 项目来源
之前在做一个需求的时候，产品经理要求在不同的列，不同的行的一些控件全部联动单选，而且每一个控件的样式都不一样，另外，在这些控件内部，子控件也要跟随变化。所以就有了这个库

这个库的很大一部分代码来自RadioGroup、RadioButton和CompoundLayout，在他的基础上进行了一些修改与适配

### 项目效果
![Image preview](https://github.com/LatoAndroid/NestedSelectionVideoGroup/blob/master/pic/2cb77acf3c89dce000c35297b3c391f.png)
![Image preview2](https://github.com/LatoAndroid/NestedSelectionVideoGroup/blob/master/pic/4082d6c1899b08595851e302e565411.png)

### 项目用法
1.NestedRadioGroup继承LinearLayout，必须作为整体的父控件

2.如果子控件需要被选中，放入NestedRadioLayout中就可以了，其他不用处理

3.其他用法和radiogroup类似，每个NestedRadioLayout都有自己的setOnCheckedChangeListener方法

4.暂未上传jcenter，目前只能复制过去使用，待续

在布局中
```
<com.kyle.radiogrouplib.NestedRadioGroup
        android:id="@+id/nestedGroup"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        >

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="不进行选择的text头部"/>

        <!--extends Relativelayout-->
        <com.kyle.radiogrouplib.NestedRadioLayout
            android:layout_width="match_parent"
            android:layout_height="50dp"
            android:background="@drawable/selector_solid_f5f5f9_corner_1dp_solod_ebf1ff_corner_1dp">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_centerVertical="true"
                android:text="test"
                android:textColor="@color/selector_47aefe_3f3f3f"/>
        </com.kyle.radiogrouplib.NestedRadioLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical">

            <com.kyle.radiogrouplib.NestedRadioLayout
                android:layout_width="match_parent"
                android:layout_height="50dp"
                android:background="@drawable/selector_solid_f5f5f9_corner_1dp_solod_ebf1ff_corner_1dp">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_centerVertical="true"
                    android:text="test"
                    android:textColor="@color/selector_47aefe_3f3f3f"/>
            </com.kyle.radiogrouplib.NestedRadioLayout>
        </LinearLayout>

    </com.kyle.radiogrouplib.NestedRadioGroup>

```


如果需要选择效果，需要写带selected的drawble文件
```
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:drawable="@drawable/pop_type_selected" android:state_selected="true"/>
    <item android:drawable="@drawable/pop_type_not_selected"/>
</selector>
```

监听事件
```
group.setOnCheckedChangeListener(new NestedRadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(NestedRadioGroup group, int checkedId) {
                Log.d("MainActivity", checkedId + "");
            }
        });

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
```
> 主要思路来自：https://github.com/Jaouan/CompoundLayout

