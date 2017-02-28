package eu.corstjens.example.spring.boot.cxf.webservice.endpoint;

/**
 * Created by koencorstjens on 22/02/17.
 */
public class Request {
    String parameter;
    String code;

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
