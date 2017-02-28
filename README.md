    # spring-boot-cxf-jax-ws-service-example
Example for cxf web services with JAX-WS on spring boot 

- First step add dependency cxf-spring-boot-starter-jaxws
- Second step create end point: see eu.corstjens.example.spring.boot.cxf.webservice.endpoint.ExempleEndpoint and ExempleEndpointImpl
- Third step configure the endpoint, see eu.corstjens.example.spring.boot.cxf.webservice.config.ServiceConfiguration


**Remarks:**
cxf-spring-boot-starter-jaxws is not working with spring-boot 1.5.1, it will be fixed in 
cxf-spring-boot-starter-jaxws version 3.2.0 and 3.1.11 see: https://issues.apache.org/jira/browse/CXF-7198.
For this reason I use the older spring boot older version 1.4.4.
