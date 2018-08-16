package com.nice.wfm.controller;

import com.nice.wfm.dto.CreditScoreRequest;
import com.nice.wfm.dto.CreditScoreResponse;
import com.nice.wfm.service.CreditCheckService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 8/16/18.
 * Author: filmon
 * Nice System Ltd.
 */

@RestController
public class CreditCheckController {

    private final CreditCheckService creditCheckService;

    public CreditCheckController(CreditCheckService creditCheckService) {
        this.creditCheckService = creditCheckService;
    }

    @PostMapping(value = "/credit-scores", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CreditScoreResponse doCreditCheck(@RequestBody CreditScoreRequest creditScoreRequest){
        return creditCheckService.doCreditCheck(creditScoreRequest.getSsn());
    }
}
