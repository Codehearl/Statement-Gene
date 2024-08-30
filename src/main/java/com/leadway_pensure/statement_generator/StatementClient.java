package com.leadway_pensure.statement_generator;




import java.lang.Thread.State;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import com.leadway_pensure.wsdl.StatementRequestSingle;
import com.leadway_pensure.wsdl.StatementType;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;


import com.leadway_pensure.wsdl.GetStatementResponse;
public class StatementClient extends WebServiceGatewaySupport {
    private static final Logger log = LoggerFactory.getLogger(StatementClient.class);
    public GetStatementResponse getStatement(String pin, String startDateString, String endDateString, int fundType, boolean isPassworded , String statementType , boolean includeLogo) {
       

        try {
            // Create the service and port

            // Create and populate the request object
            StatementRequestSingle request = new StatementRequestSingle();
            request.setRSAPIN(pin);
            
            GregorianCalendar startDate = new GregorianCalendar();
            startDate.set(2023, 0, 1); // January 1, 2023
            XMLGregorianCalendar xmlStartDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(startDate);
            request.setStartDate(xmlStartDate);

            GregorianCalendar endDate = new GregorianCalendar();
            endDate.set(2023, 11, 31); // December 31, 2023
            XMLGregorianCalendar xmlEndDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(endDate);
            request.setEndDate(xmlEndDate);

            request.setFundId(fundType);
            request.setStatementType(StatementType.fromValue(statementType)); // Assuming StatementType is an enum
            request.setIncludeLogo(true);
            request.setPasswordFile(false);

            log.info("requesting for statement");
            // Send the request and handle the response
            // Assuming the response type is StatementResponse
            GetStatementResponse response = (GetStatementResponse) getWebServiceTemplate().marshalSendAndReceive("http://camundasvr/WebStatement/Statement.asmx", request);
            return response;
          

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}