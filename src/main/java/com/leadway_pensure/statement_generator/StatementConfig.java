package com.leadway_pensure.statement_generator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class StatementConfig {
      @Bean
  public Jaxb2Marshaller marshaller() {
    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
    // this package must match the package in the <generatePackage> specified in
    // pom.xml
    marshaller.setContextPath("com.leadway_pensure.wsdl");
    return marshaller;
  }
  @Bean
  public StatementClient statementClient(Jaxb2Marshaller marshaller) {
    StatementClient client = new StatementClient();
    client.setDefaultUri("http://camundasvr/WebStatement/Statement.?wsdl");
    client.setMarshaller(marshaller);
    client.setUnmarshaller(marshaller);
    return client;
  }
}
