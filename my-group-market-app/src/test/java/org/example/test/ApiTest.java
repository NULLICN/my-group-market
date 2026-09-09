package org.example.test;

import lombok.extern.slf4j.Slf4j;
import org.example.domain.activity.model.valobj.DiscountTypeEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiTest {

    @Test
    public void test() {
        log.info("测试完成");
    }

    @Test
    public void enumTest() {
        Integer i = 0;
        DiscountTypeEnum discountTypeEnum = DiscountTypeEnum.TAG;
        System.out.println(DiscountTypeEnum.TAG.equals(discountTypeEnum));
        System.out.println(DiscountTypeEnum.BASE);
        System.out.println(DiscountTypeEnum.get(i));
    }

}
