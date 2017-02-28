package eu.corstjens.example.spring.boot.cxf.webservice.endpoint;

/**
 * Created by koencorstjens on 22/02/17.
 */
public class Response {

    private String result;
    private String error;
    private String messages;

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }
}
