package com.example.digit_recognition;

public class Result {

    private final int nNumber;
    private final float nProbability;
    private final long mtimeCost;

    public Result(float [] probs, long timeCost) {

        this.nNumber = argmax(probs);
        this.nProbability =  probs[nNumber];
        this.mtimeCost = timeCost;
    }

    public int getnNumber(){
        return nNumber;
    }

    public float getProbability(){
        return nProbability;
    }

    public long getTimeCost(){
        return mtimeCost;
    }

    private static int argmax(float [] probs){

        int MaxIdx = -1;
        float maxProb = 0.0f;
        for (int i=0;i<probs.length;i++){

            if(probs[i]>maxProb){
                maxProb = probs[i];
                MaxIdx = i;
            }
        }
        return MaxIdx;
    }
}
