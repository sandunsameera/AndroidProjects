package com.lolin.deemon_face.careforyou;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RecentQuestionsFragment extends Fragment {

    private static final String TAG = "Recent Questions";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate (R.layout.recent_questions_fragment,container,false);
        return view;
    }
}
