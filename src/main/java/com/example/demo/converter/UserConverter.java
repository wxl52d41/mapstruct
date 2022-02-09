package com.example.demo.converter;

import com.example.demo.entity.UserDo;
import com.example.demo.po.UserPo;
import com.example.demo.utils.BaseMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

/**
 * @Description: do和po互相转换报告集合之前互相转换
 * @Author: wang xiao le
 * @Date: 2021/9/23 14:49
 **/
@Mapper(componentModel = "spring")
public interface UserConverter extends BaseMapping<UserDo, UserPo> {

    @Mapping(target = "fatherName", source = "userExetend.fatherName")
    @Mapping(target = "motherName", source = "userExetend.motherName")
    @Mapping(target = "xiongDi", source = "brother")
    @Override
    UserPo sourceToTarget(UserDo var1);
}
