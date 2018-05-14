package io.vertx.starter;

import io.vertx.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {

  @Override
  public void start() {
    System.out.println(String.format("deploy port %s",config().getInteger("port")));
    System.out.println(String.format("machineId %s",config().getInteger("mid")));
    vertx.createHttpServer()
        .requestHandler(req -> req.response().end("Hello Vert.x! from " + config().getInteger("mid")))
        .listen(config().getInteger("port",8888));
  }

}
