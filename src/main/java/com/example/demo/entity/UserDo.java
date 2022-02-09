package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: UserDo
 * @Description:
 * @Author:
 * @Date: 2021/9/23 14:34
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDo implements Serializable {
    private static final long serialVersionUID = 6110524897651597826L;

    private int id;

    private String name;

    private int age;

    private String address;

    private String role;

    private Date createDate;

    private Date updateDate;

    private String createUser;

    private String updateUser;



    private String brother;

    private UserExetend userExetend;
}
