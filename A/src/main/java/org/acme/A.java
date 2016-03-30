package org.acme;

import io.vertx.core.AbstractVerticle;

import java.util.Random;

/**
 * @author <a href="http://escoffier.me">Clement Escoffier</a>
 */
public class A extends AbstractVerticle {

  @Override
  public void start() throws Exception {
    Random random = new Random();
    System.out.println("Starting publisher");
    vertx.setPeriodic(5000, l -> {
      vertx.eventBus().publish("foo", random.nextInt());
    });
  }
}
