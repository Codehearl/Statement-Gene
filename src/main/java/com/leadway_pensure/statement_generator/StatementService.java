package com.leadway_pensure.statement_generator;

import com.leadway_pensure.wsdl.GetStatement;
import com.leadway_pensure.wsdl.GetStatementResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatementService {

    @Autowired
    private StatementClient statementClient;

    public GetStatementResponse getStatement(StatementForm statementForm) {
        return statementClient.getStatement(
            statementForm.getPin(),
            statementForm.getStartDate(),
            statementForm.getEndDate(),
            statementForm.getFundType(),
            false,
            statementForm.getStatementType(),
            true
        );
    }
}
