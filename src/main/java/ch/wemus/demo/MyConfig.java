package ch.wemus.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

//@Component
public class MyConfig extends ResourceConfig {

    public MyConfig() {
      register(MyContextFilter.class);
    }
}
