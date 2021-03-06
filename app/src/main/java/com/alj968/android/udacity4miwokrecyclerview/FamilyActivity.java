package com.alj968.android.udacity4miwokrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    private RecyclerView mFamilyRecyclerView;
    private WordAdapter mFamilyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        mFamilyRecyclerView = (RecyclerView) findViewById(R.id.familyRecyclerView);
        mFamilyRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        updateUI();
    }

    private void updateUI() {
        List<Word> familyMembers = new ArrayList<>();
        familyMembers.add(new Word("father","әpә", R.drawable.family_father,R.raw.family_father));
        familyMembers.add(new Word("mother","әṭa",R.drawable.family_mother,R.raw.family_mother));
        familyMembers.add(new Word("son","angsi", R.drawable.family_son,R.raw.family_son));
        familyMembers.add(new Word("daughter","tune", R.drawable.family_daughter,R.raw.family_daughter));
        familyMembers.add(new Word("older brother","taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        familyMembers.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        familyMembers.add(new Word("older sister","teṭe",R.drawable.family_older_sister,R.raw.family_older_sister));
        familyMembers.add(new Word("younger sister","kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        familyMembers.add(new Word("grandmother","ama",R.drawable.family_grandmother,R.raw.family_grandmother));
        familyMembers.add(new Word("grandfather","paapa",R.drawable.family_grandfather,R.raw.family_grandfather));

        mFamilyAdapter = new WordAdapter(familyMembers,R.color.category_family);
        mFamilyRecyclerView.setAdapter(mFamilyAdapter);
    }
}
