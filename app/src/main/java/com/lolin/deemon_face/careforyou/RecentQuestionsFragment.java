package com.lolin.deemon_face.careforyou;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RecentQuestionsFragment extends Fragment {

    private static final String TAG = "Recent Questions";

    public RecentQuestionsFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate (R.layout.recent_questions_fragment,container,false);

        String[] RecentQuestions = {"First Question",
                "Second question",
                "Third question"};

        ListView listView = view.findViewById (R.id.Question_listView);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String> (
                getActivity (),
                android.R.layout.simple_list_item_1,
                RecentQuestions

        );

        listView.setAdapter (listViewAdapter);
        return view;
    }
}
