package com.lt.findlove.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lt.findlove.model.entity.User;
import com.lt.findlove.service.UserService;
import com.lt.findlove.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author teng
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2022-10-23 15:24:10
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




