package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName: UserExetend
 * @Date: 2021/9/23 16:54
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserExetend implements Serializable {
    private static final long serialVersionUID = 913087680691286398L;

    private String fatherName;

    private String motherName;
}
