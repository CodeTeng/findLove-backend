package com.lt.findlove.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lt.findlove.mapper.PostMapper;
import com.lt.findlove.model.entity.Post;
import com.lt.findlove.service.PostService;
import org.springframework.stereotype.Service;

/**
* @author teng
* @description 针对表【post(帖子)】的数据库操作Service实现
* @createDate 2022-10-23 15:24:09
*/
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post>
    implements PostService {

}




