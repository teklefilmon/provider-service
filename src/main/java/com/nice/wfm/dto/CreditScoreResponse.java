package com.nice.wfm.dto;

/**
 * Created on 8/16/18.
 * Author: filmon
 * Apple Inc.
 */

public class CreditScoreResponse {
    private CreditScore creditScore;

    public CreditScoreResponse(CreditScore creditScore){
        this.creditScore = creditScore;
    }

    public CreditScore getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(CreditScore creditScore) {
        this.creditScore = creditScore;
    }

    public enum CreditScore {
        HIGH, LOW
    }
}
