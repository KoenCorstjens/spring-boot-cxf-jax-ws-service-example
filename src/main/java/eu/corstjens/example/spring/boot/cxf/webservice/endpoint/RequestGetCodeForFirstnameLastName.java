package eu.corstjens.example.spring.boot.cxf.webservice.endpoint;

import java.util.List;

/**
 * Created by koencorstjens on 22/02/17.
 */
public class RequestGetCodeForFirstnameLastName {
    List<String> firstNames;
    List<String> lastNames;
    String key;


    public List<String> getFirstNames() {
        return firstNames;
    }

    public void setFirstNames(List<String> firstNames) {
        this.firstNames = firstNames;
    }

    public List<String> getLastNames() {
        return lastNames;
    }

    public void setLastNames(List<String> lastNames) {
        this.lastNames = lastNames;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
