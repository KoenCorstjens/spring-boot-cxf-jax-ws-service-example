package eu.corstjens.example.spring.boot.cxf.webservice.service;

import org.springframework.stereotype.Service;

/**
 * Created by koencorstjens on 23/02/17.
 */
@Service
public class MessagesServiceImpl implements MessagesService {

    public String getHallo() {
        return "hello";
    }
}
