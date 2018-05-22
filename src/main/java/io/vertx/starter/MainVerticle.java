package io.vertx.starter;

import io.vertx.core.AbstractVerticle;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class MainVerticle extends AbstractVerticle {

  @Override
  public void start() {
    log.info("deploy port {}",config().getInteger("port"));
    log.info("machineId {}",config().getInteger("mid"));
    vertx.createHttpServer()
        .requestHandler(req -> req.response().end("Hello Vert.x! from " + config().getInteger("mid")))
        .listen(config().getInteger("port",8888));

    log.trace("logback 成功了");
    log.debug("logback 成功了");
    log.info("logback 成功了");
    log.warn("logback 成功了");
    log.error("logback 成功了");
  }

}
