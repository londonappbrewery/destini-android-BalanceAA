package com.londonappbrewery.destini;

public class StorySection {
    private int mStoryText;
    private int mChoiceAText;
    private int mChoiceBText;
    private StorySection mChoiceA;
    private StorySection mChoiceB;

    public StorySection(int storyText) {
        mStoryText = storyText;
    }

    public StorySection(int storyText,int choiceAText,int choiceBText,StorySection choiceA,StorySection choiceB){
        mStoryText=storyText;
        mChoiceAText = choiceAText;
        mChoiceBText = choiceBText;
        mChoiceB = choiceB;
        mChoiceA = choiceA;
    }

    public int getStoryText() {
        return mStoryText;
    }

    public int getChoiceAText() {
        return mChoiceAText;
    }

    public void setChoiceAText(int choiceAText) {
        mChoiceAText = choiceAText;
    }

    public int getChoiceBText() {
        return mChoiceBText;
    }

    public void setChoiceBText(int choiceBText) {
        mChoiceBText = choiceBText;
    }

    public StorySection getChoiceA() {
        return mChoiceA;
    }

    public void setChoiceA(StorySection choiceA) {
        mChoiceA = choiceA;
    }

    public StorySection getChoiceB() {
        return mChoiceB;
    }

    public void setChoiceB(StorySection choiceB) {
        mChoiceB = choiceB;
    }

    public boolean isEnd(){
        return mChoiceA==null;
    }
}
