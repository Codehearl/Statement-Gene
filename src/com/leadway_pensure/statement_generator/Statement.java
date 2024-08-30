package com.leadway_pensure.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.9-b130926.1035 Generated source version:
 * 2.2
 */
@WebServiceClient(
    name = "Statement",
    targetNamespace = "http://tempuri.org/",
    wsdlLocation = "http://camundasvr/WebStatement/Statement.asmx?wsdl")
public class Statement extends Service {

  private static final URL STATEMENT_WSDL_LOCATION;
  private static final WebServiceException STATEMENT_EXCEPTION;
  private static final QName STATEMENT_QNAME = new QName("http://tempuri.org/", "Statement");

  static {
    URL url = null;
    WebServiceException e = null;
    try {
      url = new URL("http://camundasvr/WebStatement/Statement.asmx?wsdl");
    } catch (MalformedURLException ex) {
      e = new WebServiceException(ex);
    }
    STATEMENT_WSDL_LOCATION = url;
    STATEMENT_EXCEPTION = e;
  }

  public Statement() {
    super(__getWsdlLocation(), STATEMENT_QNAME);
  }

  public Statement(WebServiceFeature... features) {
    super(__getWsdlLocation(), STATEMENT_QNAME, features);
  }

  public Statement(URL wsdlLocation) {
    super(wsdlLocation, STATEMENT_QNAME);
  }

  public Statement(URL wsdlLocation, WebServiceFeature... features) {
    super(wsdlLocation, STATEMENT_QNAME, features);
  }

  public Statement(URL wsdlLocation, QName serviceName) {
    super(wsdlLocation, serviceName);
  }

  public Statement(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
    super(wsdlLocation, serviceName, features);
  }

  /**
   * @return returns StatementSoap
   */
  @WebEndpoint(name = "StatementSoap")
  public StatementSoap getStatementSoap() {
    return super.getPort(new QName("http://tempuri.org/", "StatementSoap"), StatementSoap.class);
  }

  /**
   * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.
   *     Supported features not in the <code>features</code> parameter will have their default
   *     values.
   * @return returns StatementSoap
   */
  @WebEndpoint(name = "StatementSoap")
  public StatementSoap getStatementSoap(WebServiceFeature... features) {
    return super.getPort(
        new QName("http://tempuri.org/", "StatementSoap"), StatementSoap.class, features);
  }

  private static URL __getWsdlLocation() {
    if (STATEMENT_EXCEPTION != null) {
      throw STATEMENT_EXCEPTION;
    }
    return STATEMENT_WSDL_LOCATION;
  }
}
