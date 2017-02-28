package eu.corstjens.example.spring.boot.cxf.webservice.endpoint;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by koencorstjens on 22/02/17.
 */
@WebService(name = "testExample", targetNamespace = "http://eu.corstjens.eu")


public interface ExempleEndpoint {

    Response sendMessages(@WebParam(name = "request") Request request);

    Response getCodeForFirstnameLastName(@WebParam(name = "request") RequestGetCodeForFirstnameLastName request);

}
