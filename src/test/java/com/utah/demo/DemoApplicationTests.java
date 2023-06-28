package com.utah.demo;

import cn.hutool.core.util.ObjectUtil;
import com.utah.common.Constants;
import com.utah.dto.UserWithInterface;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootTest
public class DemoApplicationTests {


  public static void main(String[] args) {
    Boolean a = null;
    Boolean b = null;
    System.out.println(ObjectUtil.equals(a, b));
    System.out.println(Boolean.compare(a, false));
//    calculateTaxAmount();

  }

  private static void calculateTaxAmount() {
    BigDecimal price = new BigDecimal(71.34676);
    BigDecimal quantity = new BigDecimal(824);
    BigDecimal taxRate = new BigDecimal(13);
    BigDecimal originTaxAmount = new BigDecimal(7642.67);
    BigDecimal amount = null;
    BigDecimal taxAmountByAmount = null;
    BigDecimal taxAmountByPriceQuantity = null;

    if (price != null && quantity != null) {
      amount = price.multiply(quantity)
          .setScale(Constants.AMOUNT_ROUNDING_SCALE, RoundingMode.HALF_UP);
    }

    if (amount != null && taxRate != null) {
      taxAmountByAmount = amount.multiply(taxRate)
          .divide(Constants.HUNDRED, RoundingMode.HALF_UP)
          .setScale(Constants.AMOUNT_ROUNDING_SCALE, RoundingMode.HALF_UP);
      taxAmountByPriceQuantity = price.multiply(quantity)
          .multiply(taxRate)
          .divide(Constants.HUNDRED, RoundingMode.HALF_UP)
          .setScale(Constants.AMOUNT_ROUNDING_SCALE, RoundingMode.HALF_UP);
    }

    if (taxAmountByAmount != null && originTaxAmount != null &&
        !(taxAmountByAmount.compareTo(originTaxAmount) == 0 ||
            taxAmountByPriceQuantity.compareTo(originTaxAmount) == 0)) {
      System.out.println(String.format("TaxAmount %s, price %s, quantity %s, taxRate %s:",
          taxAmountByAmount, price, quantity, taxRate));
    }
  }

  @Test
  public void testInitBean() {
    GenericApplicationContext genericApplicationContext = new GenericXmlApplicationContext(
        "classpath:user-init-context.xml");
    UserWithInterface userOne = genericApplicationContext.getBean("userOne",
        UserWithInterface.class);
    UserWithInterface userTwo = genericApplicationContext.getBean("userTwo",
        UserWithInterface.class);
    System.out.println("userOne:" + userOne);
    System.out.println("userTwo:" + userTwo);
    UserWithInterface userThree = genericApplicationContext.getBean("userThree",
        UserWithInterface.class);
    System.out.println("userThree:" + userThree);
  }


}
