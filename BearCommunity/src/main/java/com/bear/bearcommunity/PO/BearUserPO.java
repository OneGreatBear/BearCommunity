package com.bear.bearcommunity.PO;

import lombok.Data;

import java.util.Date;


/**
 * @title: BearUserPO
 * @Author Hmh
 * @Date: 2021/12/28 17:24
 * @Version 1.0
 */

@Data
public class BearUserPO {

    //用户id
    private String id;
    //用户昵称
    private String userName;
    //用户密码
    private String password;
    //年龄
    private int age;
    //性别
    private int sex;
    //出生日期
    private Date birthday;
    //入库时间
    private Date createTime;
    //修改时间
    private Date updateTime;
    //真实姓名
    private String realName;
}

