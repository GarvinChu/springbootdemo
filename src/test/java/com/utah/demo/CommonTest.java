package com.utah.demo;

import com.ng.udc.application.service.CommonService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhuyin
 * @title CommonTest
 * @description TODO
 * @date 2023/2/6 16:54
 */
public class CommonTest extends BaseTests {

  @Autowired
  private CommonService commonService;

  @Override
  protected void init() {
    super.init();
  }

  @Test
  public void test() {
    ExecutorService executorService = Executors.newCachedThreadPool();

    for (int i = 0; i < 3; i++) {

      executorService.submit(new Runnable() {
        @Override
        public void run() {
          commonService.test();

        }
      });
    }
    executorService.shutdown();
  }

}
