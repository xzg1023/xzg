package com.fh.user.service.impl;

import com.fh.user.entity.TUser;
import com.fh.user.mapper.TUserMapper;
import com.fh.user.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
