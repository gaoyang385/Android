package com.test;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    /**
     * Called when the activity is first created.
     */
    private RadioGroup rgs;
    public List<Fragment> fragments = new ArrayList<Fragment>();

    public String hello = "hello ";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        fragments.add(new TabAFm());
        fragments.add(new TabBFm());
        fragments.add(new TabCFm());


        rgs = (RadioGroup) findViewById(R.id.tabs_rg);

        FragmentTabAdapter tabAdapter;
        tabAdapter = new FragmentTabAdapter(this, fragments, R.id.tab_content, rgs);
        tabAdapter.setOnRgsExtraCheckedChangedListener(new FragmentTabAdapter.OnRgsExtraCheckedChangedListener(){
            @Override
            public void OnRgsExtraCheckedChanged(RadioGroup radioGroup, int checkedId, int index) {
                System.out.println("Extra---- " + index + " checked!!! ");
            }
        });

    }








}


