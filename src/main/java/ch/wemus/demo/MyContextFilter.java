package ch.wemus.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

import javax.ws.rs.container.*;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
// @PreMatching
@Order(3)
public class MyContextFilter implements ContainerRequestFilter, ContainerResponseFilter {
    private final static Logger LOG = LoggerFactory.getLogger(MyContextFilter.class);

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        LOG.info("ContainerRequestFilter");
    }

    @Override
    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException {
        LOG.info("ContainerResponseFilter");
    }
}
