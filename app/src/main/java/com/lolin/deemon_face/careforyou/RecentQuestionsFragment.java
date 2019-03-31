package com.lolin.deemon_face.careforyou;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
                "Third question",
        "fs",
        "sfs",
        "fsf",
        "ss","dgjogn","dkgbhgb"};

        ListView listView = view.findViewById (R.id.questionList);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String> (
                getActivity (),
                android.R.layout.simple_list_item_1,
                RecentQuestions

        );

        listView.setAdapter (listViewAdapter);

        FloatingActionButton fab = view.findViewById (R.id.addQuestion);
        fab.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getActivity (),ThirdActivity.class);
                startActivity (intent);
            }
        });

        return view;





    }
}
