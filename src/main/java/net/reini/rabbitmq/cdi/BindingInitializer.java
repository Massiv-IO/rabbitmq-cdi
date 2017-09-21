package net.reini.rabbitmq.cdi;

import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.IOException;

/**
 *
 */
@Singleton
public class BindingInitializer {
  @Inject
  private RabbitBinder binder;

  @PostConstruct
  public void initialize() {
    try {
      binder.configuration().setHost("somehost.somedomain").setUsername("myuser").setPassword("mypassword");
      binder.initialize();
    } catch (IOException e) {
      LoggerFactory.getLogger(getClass()).error("Unable to initialize", e);
    }
  }
}
