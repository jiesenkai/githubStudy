package com.jsk.service;

import com.jsk.pojo.userMoney;

import java.util.List;

/**
 * userMoney业务层的接口
 * @author jack
 * @date 2023/1/30 14:11
 */

public interface userMoneyService {
    //查询所有用户信息
    List<userMoney> queryAll();

    //根据用户Id进行查找
    userMoney queryById(Integer id);

    //更新用户信息
    int updateUser(userMoney usermoney);
    //转钱
    int transfuse(String sender,String payee,Double money);

}
