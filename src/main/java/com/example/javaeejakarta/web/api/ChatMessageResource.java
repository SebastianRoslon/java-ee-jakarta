package com.example.javaeejakarta.web.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.logging.Logger;

@Path("/chats/messages")
public class ChatMessageResource {
    private static final Logger LOGGER = Logger.getLogger(ChatMessageResource.class.getName());

    @GET
    @Produces("text/plain")
    public String create(@QueryParam("message") String message) {
        LOGGER.info("create(" + message + ")");
        return "Hello, World!";
    }
}
