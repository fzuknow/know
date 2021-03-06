package com.example.chen.fzu;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Hot_Topic.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Hot_Topic#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Hot_Topic extends Fragment {
    private View mView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //注意View对象的重复使用，以便节省资源
        if (mView == null) {
            mView = inflater.inflate(R.layout.fragment_hot__topic,container, false);
        }

        return mView;

    }
}
