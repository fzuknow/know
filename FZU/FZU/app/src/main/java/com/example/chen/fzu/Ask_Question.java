package com.example.chen.fzu;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Ask_Question extends Fragment {

    ListView list;
    private String[] mName = {"这只是个例子1","这只是个例子2"};
    private String[] mNum = {"1", "2"};
    private ArrayList<Map<String, Object>> mData = new ArrayList<Map<String, Object>>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ask__question, null);
        list = (ListView) view.findViewById(R.id.listView);
        for (int i = 0; i < mNum.length; i++) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("name", mName[i]);
            item.put("num", mNum[i]);
            mData.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(getActivity(), mData, android.R.layout.simple_expandable_list_item_2,
                new String[]{"name", "num"}, new int[]{android.R.id.text1, android.R.id.text2});
        list.setAdapter(adapter);
        return view;
    }
}


