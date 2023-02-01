package com;

import com.jsk.pojo.userMoney;
import com.jsk.service.userMoneyService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        ApplicationContext a=new ClassPathXmlApplicationContext("Spring.xml");
        userMoneyService userMoneyService = a.getBean("user", userMoneyService.class);
        int transfuse = userMoneyService.transfuse("jiesenkai", "jack", 4.22);
        System.out.println(transfuse);
    }
}
