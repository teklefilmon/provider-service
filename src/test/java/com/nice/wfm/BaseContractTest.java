package com.nice.wfm;

import com.nice.wfm.controller.CreditCheckController;
import com.nice.wfm.dto.CreditScoreResponse;
import com.nice.wfm.service.CreditCheckService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

import static com.nice.wfm.dto.CreditScoreResponse.CreditScore.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created on 8/16/18.
 * Author: filmon
 * Nice Systems Ltd
 */

public abstract class BaseContractTest {

    @Before
    public void setup(){
        final CreditCheckService creditCheckService = mock(CreditCheckService.class);

        when(creditCheckService.doCreditCheck("12-34-5678"))
                .thenReturn(new CreditScoreResponse(HIGH));
        when(creditCheckService.doCreditCheck("12-34-5679"))
                .thenReturn(new CreditScoreResponse(LOW));

        RestAssuredMockMvc.standaloneSetup(new CreditCheckController(creditCheckService));
    }
}
