package eu.corstjens.example.spring.boot.cxf.webservice.endpoint.impl;


import eu.corstjens.example.spring.boot.cxf.webservice.endpoint.ExempleEndpoint;
import eu.corstjens.example.spring.boot.cxf.webservice.endpoint.Request;
import eu.corstjens.example.spring.boot.cxf.webservice.endpoint.RequestGetCodeForFirstnameLastName;
import eu.corstjens.example.spring.boot.cxf.webservice.endpoint.Response;
import eu.corstjens.example.spring.boot.cxf.webservice.service.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by koencorstjens on 22/02/17.
 */
@WebService(endpointInterface = "eu.corstjens.example.spring.boot.cxf.webservice.endpoint.ExempleEndpoint")
public class ExempleEndpointImpl implements ExempleEndpoint {

    @Autowired
    private MessagesService messagesService;

    @Override
    public Response sendMessages(Request request) {
        Response response = new Response();
        response.setMessages(messagesService.getHallo());
        return response;
    }

    @Override
    public Response getCodeForFirstnameLastName(RequestGetCodeForFirstnameLastName requestGetCodeForFirstnameLastName) {
        Response response = new Response();
        response.setMessages(messagesService.getHallo());
        return response;
    }
}
