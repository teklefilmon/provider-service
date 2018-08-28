package com.nice.wfm.service;

import com.nice.wfm.dto.CreditScoreResponse;
import org.springframework.stereotype.Service;

/**
 * Created on 8/16/18.
 * Author: filmon
 * Nice Systems Ltd
 */

@Service
public class CreditCheckService {

    public CreditScoreResponse doCreditCheck(String ssn) {
        //Contract testing doesn't care about internal functioning
        //This is going to be mocked in the test
        return null;
    }

}
