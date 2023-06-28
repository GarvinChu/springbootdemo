package com.utah.service;

import com.ng.spring.boot.lock.annotation.DistributedLock;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author zhuyin
 * @title CommonService
 * @description TODO
 * @date 2023/2/6 16:56
 */
@Service
@Slf4j
public class CommonService {

  public void test() {

    log.info("[" + Thread.currentThread().getName() + "] processing start================");
    String id = "12345678";

    this.temp(id);
    log.info("[" + Thread.currentThread().getName() + "] processing stop================");
  }

  @DistributedLock(
      identifier = "#id",
      unless = "#id == null",
      tryLock = true,
      waitTime = 1L,
      leaseTime = 5L
  )
  public void temp(String id) {
    log.info(id + " [" + Thread.currentThread().getName() + "] processing================");
  }
}
