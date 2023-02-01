package com.jsk.mappers;


import com.jsk.pojo.userMoney;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 查询用户money的信息Mapper接口
 * @author jiesenkai
 * @date 2023/1/30 13:40
 */
public interface moneyMapper {
    //查询所有用户的money
    List<userMoney> getAllUserMoneyMessage();

    //根据用户名查找用户moeny
    userMoney getUserMoneyByUsername(@Param("username") String username);

    //根据用户ID查找用户moeny
    userMoney getUserMoneyById(@Param("id") Integer id);

    //添加用户
    int add(userMoney usermoney);

    //删除用户
    int delete(userMoney usermoney);

    //修改用户
    int alter(userMoney usermoney);

}
