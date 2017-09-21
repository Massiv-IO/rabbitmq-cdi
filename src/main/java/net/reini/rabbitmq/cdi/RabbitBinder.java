package net.reini.rabbitmq.cdi;

/**
 *
 */
public class RabbitBinder extends EventBinder {
  @Override
  protected void bindEvents() {
    bind(EventOne.class).toExchange("test.from").withRoutingKey("test.key");
    bind(EventOne.class).toExchange("test.from").withRoutingKey("test.key");
    bind(EventTwo.class).toQueue("test.queue");
    bind(EventTwo.class).toQueue("test.queue");
  }
}