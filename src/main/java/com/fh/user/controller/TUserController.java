package com.fh.user.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fh.commons.result.CommonsReturn;
import com.fh.user.entity.TUser;
import com.fh.user.service.ITUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Api(tags = "TUserController", description = "用户管理")
@RestController
@RequestMapping("/user")
public class TUserController {

    @Autowired
    private ITUserService userService;
    @ApiOperation("获取所有用户列表")
    @GetMapping

    public CommonsReturn queryList(Page<TUser> page){
        userService.page(page);
        return CommonsReturn.success(page);
    }
    @ApiOperation("根据用户名称查询用户信息")
    @GetMapping("/{name}")
    public CommonsReturn queryList(@ApiParam(value = "用户名",required =true,type="String") @PathVariable("name") String name){
        List<TUser> userList = userService.list(new QueryWrapper<TUser>().like("name",name));
        return CommonsReturn.success(userList);
    }
}
