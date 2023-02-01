package com.jsk.pojo;

import lombok.Data;

@Data
public class userMoney {
    Integer id;
    String username;
    Double money;

    public userMoney() {
    }

    @Override
    public String toString() {
        return "userMoney{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", money=" + money +
                '}';
    }

    public userMoney(Integer id, String username, Double money) {
        this.id = id;
        this.username = username;
        this.money = money;
    }
}
