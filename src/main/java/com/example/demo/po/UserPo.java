package com.example.demo.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: userPo
 * @Description: TODO
 * @Author: wang xiao le
 * @Date: 2021/9/23 14:23
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPo implements Serializable {
    private static final long serialVersionUID = -3055967092435722132L;

    private int id;

    private String name;

    private int age;

    private String address;

    private String role;

    private Date createDate;

    private Date updateDate;

    private String createUser;

    private String updateUser;


    private String xiongDi;

    private String fatherName;

    private String motherName;
}
