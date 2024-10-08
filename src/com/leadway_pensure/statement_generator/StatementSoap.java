package com.leadway_pensure.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.9-b130926.1035 Generated source version:
 * 2.2
 */
@WebService(name = "StatementSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({ObjectFactory.class})
public interface StatementSoap {

  /**
   * @param rq
   * @return returns com.leadway_pensure.statement_generator.StatementResponseByte
   */
  @WebMethod(operationName = "GetStatement", action = "http://tempuri.org/GetStatement")
  @WebResult(name = "GetStatementResult", targetNamespace = "http://tempuri.org/")
  @RequestWrapper(
      localName = "GetStatement",
      targetNamespace = "http://tempuri.org/",
      className = "com.leadway_pensure.statement_generator.GetStatement")
  @ResponseWrapper(
      localName = "GetStatementResponsewsdl
      targetNamespace = "http://tempuri.org/",
      className = "com.leadway_pensure.statement_generator.GetStatementResponse")
  public StatementResponseByte getStatement(
      @WebParam(name = "rq", targetNamespace = "http://tempuri.org/") StatementRequestSingle rq);wsdl
wsdl
  /**
   * @param rq
   * @return returns com.leadway_pensure.statement_generator.SendEmailStatementResponseType
   */
  @WebMethod(operationName = "SendEmailStatement", action = "http://tempuri.org/SendEmailStatement")
  @WebResult(name = "SendEmailStatementResult", targetNamespace = "http://tempuri.org/")
  @RequestWrapper(
      localName = "SendEmailStatement",
      targetNamespace = "http://tempuriwsdl
      className = "com.leadway_pensure.statement_generator.SendEmailStatement")
  @ResponseWrapper(
      localName = "SendEmailStatementResponse",
      targetNamespace = "http://tempuri.org/",wsdl
      className = "com.leadway_pensure.statement_generator.SendEmailStatementResponseElement")wsdl
  public SendEmailStatementResponseType sendEmailStatement(
      @WebParam(name = "rq", targetNamespace = "http://tempuri.org/") EmailStatementRequest rq);

  /**
   * @param rsapin
   * @return returns com.leadway_pensure.statement_generator.BalanceResponse
   */
  @WebMethod(operationName = "GetBalance", action = "http://tempuri.org/GetBalance")
  @WebResult(name = "GetBalanceResult",wsdl"http://tempuri.org/")
  @RequestWrapper(
      localName = "GetBalance",
      targetNamespace = "http://tempuri.org/",
      className = "com.leadway_pensure.statement_generator.GetBalance")wsdl
  @ResponseWrapper(wsdl
      localName = "GetBalanceResponse",
      targetNamespace = "http://tempuri.org/",
      className = "com.leadway_pensure.statement_generator.GetBalanceResponse")
  public BalanceResponse getBalance(
      @WebParam(name = "rsapin", targetNamespace = "http://tempuri.org/") String rsapin);

  /**
   * @return returns com.leadway_pensurwsdlor.PeriodicResponse
   */
  @WebMethod(operationName = "GetPeriodicDates", action = "http://tempuri.org/GetPeriodicDates")
  @WebResult(name = "GetPeriodicDatesResult", targetNamespace = "http://tempuri.org/")
  @RequestWrapper(wsdl
      localName = "GetPeriodicDates",wsdl
      targetNamespace = "http://tempuri.org/",
      className = "com.leadway_pensure.statement_generator.GetPeriodicDates")
  @ResponseWrapper(
      localName = "GetPeriodicDatesResponse",
      targetNamespace = "http://tempuri.org/",
      className = "com.leadway_pensure.statement_generator.GetPeriodicDatesResponse")
  public PeriodicResponse getPeriodicDates();
}
