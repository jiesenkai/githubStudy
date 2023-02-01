package com.jsk.service.impl;

import com.jsk.mappers.moneyMapper;
import com.jsk.pojo.userMoney;
import com.jsk.service.userMoneyService;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * userMoney业务层的实现类
 * @author jiesenkai
 * @date 2023/1/30 14:09
 */

@Service("user")
public class userMoneyServiceImpl implements userMoneyService {
    @Autowired
    public moneyMapper moneyMapper;
    //查询所有用户的数据
    public List<userMoney> queryAll(){
        return moneyMapper.getAllUserMoneyMessage();
    };
    //根据ID查询用户数据
    public userMoney queryById(Integer id){
        return moneyMapper.getUserMoneyById(id);
    }

    @Override
    public int updateUser(userMoney usermoney) {
        return moneyMapper.alter(usermoney);
    }

    //转账
    @Override
    public int transfuse(String sender, String payee, Double money) {
        userMoney userSender = moneyMapper.getUserMoneyByUsername(sender);
        userMoney userPayee = moneyMapper.getUserMoneyByUsername(payee);
        /* 判断收款和付款用户是否存在 不存在转账失败*/
        if(userSender == null || userPayee ==null){
            return 0;
        }

        /*  判断付款人的钱是否小于0 是的话就转账失败*/
        Double senderMoney = userSender.getMoney();
        if(senderMoney<=0 || senderMoney < money){
            return 0;
        }

        Double payeeMoney = userPayee.getMoney();
        userSender.setMoney(senderMoney-=money);
        userPayee.setMoney(payeeMoney+=money);
        moneyMapper.alter(userSender);
        moneyMapper.alter(userPayee);
        return 1;
    }


}
