package com.utah.demo;

import com.ng.commons.core.operator.Operator;
import com.ng.commons.core.operator.OperatorContext;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringRunner.class)
@ActiveProfiles("local")
@SpringBootTest
@WebAppConfiguration
@AutoConfigureMockMvc
@Slf4j
public abstract class BaseTests {

  @Autowired
  protected OperatorContext operatorContext;

  @Before
  public void setUp() {
    String companyId = "1300005350921";
    String operatorId = "1300001457264";
    String tenantId = "1300000632840";
    String language = "zh_CN";

    Operator targetOperator = Operator.builder()
        .companyId(companyId)
        .operatorId(operatorId)
        .tenantId(tenantId)
        .language(language)
        .build();
    operatorContext.setOperator(targetOperator);

    //初始化测试数据
    init();
  }


  protected void init() {
  }
}
