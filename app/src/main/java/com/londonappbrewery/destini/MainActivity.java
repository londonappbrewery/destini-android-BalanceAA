package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryText;
    private Button mBtnChoiceA;
    private Button mBtnChoiceB;
    private StorySection mCurrentSection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryText = findViewById(R.id.storyTextView);
        mBtnChoiceA = findViewById(R.id.buttonTop);
        mBtnChoiceB = findViewById(R.id.buttonBottom);

        StorySection t6 = new StorySection(R.string.T6_End);
        StorySection t5 = new StorySection(R.string.T5_End);
        StorySection t4 = new StorySection(R.string.T4_End);
        StorySection t3 = new StorySection(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2,t6,t5);
        StorySection t2 = new StorySection(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2,t3,t4);
        StorySection t1 = new StorySection(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2,t3,t2);

        mCurrentSection = t1;

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mBtnChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCurrentSection = mCurrentSection.getChoiceA();
                updateStory();
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBtnChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCurrentSection = mCurrentSection.getChoiceB();
                updateStory();
            }
        });

    }

    private void updateStory(){
        mStoryText.setText(mCurrentSection.getStoryText());
        if(mCurrentSection.isEnd()){
            mBtnChoiceA.setVisibility(View.GONE);
            mBtnChoiceB.setVisibility(View.GONE);
        }else {
            mBtnChoiceA.setText(mCurrentSection.getChoiceAText());
            mBtnChoiceB.setText(mCurrentSection.getChoiceBText());
        }
    }
}
