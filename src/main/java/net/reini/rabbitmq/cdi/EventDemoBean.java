package net.reini.rabbitmq.cdi;

import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

/**
 *
 */
public class EventDemoBean {
  @Inject
  private Event<EventOne> eventOnes;

  public void submitEvent(boolean enabled) {
    EventOne eventOne = new EventOne();
    eventOne.setEnabled(enabled);
    eventOnes.fire(eventOne);
  }

  public void reveiveEvent(@Observes EventTwo eventTwo) {
    // do some work
  }
}