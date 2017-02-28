package eu.corstjens.example.spring.boot.cxf.webservice.config;

import eu.corstjens.example.spring.boot.cxf.webservice.endpoint.impl.ExempleEndpointImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.xml.ws.Endpoint;

/**
 * Created by koencorstjens on 27/02/17.
 */
@Configuration
public class ServiceConfiguration {
    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new ExempleEndpointImpl());
        endpoint.publish("/testExample");
        return endpoint;
    }
}
