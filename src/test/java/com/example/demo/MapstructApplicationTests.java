package com.example.demo;

import com.example.demo.converter.UserConverter;
import com.example.demo.entity.UserDo;
import com.example.demo.po.UserPo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.lang.model.SourceVersion;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class MapstructApplicationTests {
    /**
     * 注入转换
     */
    @Autowired
    private UserConverter userConverter;
    /**
     * 实现Do映射Po，使用sourceToTarget
     */
    @Test
    void DoConverterPo() {
        UserDo userDo = new UserDo();
        userDo.setId(1);
        userDo.setName("小明");
        userDo.setAge(18);
        userDo.setRole("学生");
        userDo.setCreateDate(new Date());
        userDo.setCreateUser("李白");
        userDo.setBrother("大明");
        UserPo userPo = userConverter.sourceToTarget(userDo);
        System.out.println("userPo = " + userPo);
        //userPo = UserPo(id=1, name=小明, age=18, address=null, role=学生, createDate=Thu Sep 23 16:28:59 CST 2021, updateDate=null, createUser=李白, updateUser=null)
    }
    /**
     * 实现Po映射Do，使用targetToSource
     */
    @Test
    void PoConverterDo() {
        UserPo userPo = new UserPo();
        userPo.setId(1);
        userPo.setName("大明");
        userPo.setAge(18);
        userPo.setRole("学生");
        userPo.setCreateDate(new Date());
        userPo.setCreateUser("李白");
        userPo.setXiongDi("小明");
        UserDo userDo = userConverter.targetToSource(userPo);
        System.out.println("userDo = " + userDo);
        //userDo = UserDo(id=1, name=小明, age=18, address=null, role=学生, createDate=Thu Sep 23 16:31:25 CST 2021, updateDate=null, createUser=李白, updateUser=null)
    }
    /**
     * 实现Dos映射Pos，使用sourceToTarget
     */
    @Test
    void DoListConverterPoList() {
        List<UserDo> userDos = new ArrayList<>();
        UserDo userDo = new UserDo();
        userDo.setId(1);
        userDo.setName("小明");
        userDo.setAge(18);
        userDo.setRole("学生");
        userDo.setCreateDate(new Date());
        userDo.setCreateUser("李白");

        UserDo userDo2 = new UserDo();
        userDo2.setId(2);
        userDo2.setName("大明");
        userDo2.setAge(18);
        userDo2.setRole("学生");
        userDo2.setCreateDate(new Date());
        userDo2.setCreateUser("李白");

        userDos.add(userDo);
        userDos.add(userDo2);
        List<UserPo> userPos = userConverter.sourceToTarget(userDos);
        System.out.println("userPos = " + userPos);
        //userPos =
        // [UserPo(id=1, name=小明, age=18, address=null, role=学生, createDate=Thu Sep 23 16:41:27 CST 2021, updateDate=null, createUser=李白, updateUser=null),
        // UserPo(id=2, name=大明, age=18, address=null, role=学生, createDate=Thu Sep 23 16:41:27 CST 2021, updateDate=null, createUser=李白, updateUser=null)]
    }
}
