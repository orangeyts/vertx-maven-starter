package io.vertx.starter;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import lombok.extern.slf4j.Slf4j;

/**
 * Runner vertx
 *
 */
@Slf4j
public class VertXRunner {


  public static void main( String[] args ) {
    final Vertx vertx = Vertx.vertx();

//    DeploymentOptions options = new DeploymentOptions().setWorker(false).setMultiThreaded(false).setInstances(4).setWorkerPoolSize(360).setWorkerPoolName("spring-service-work");
    DeploymentOptions options = new DeploymentOptions().setWorker(false).setMultiThreaded(false).setInstances(1).setWorkerPoolSize(360).setWorkerPoolName("spring-service-work");
    vertx.deployVerticle(MainVerticle.class.getName(), options);
    log.info("Deployment done");
  }

}
