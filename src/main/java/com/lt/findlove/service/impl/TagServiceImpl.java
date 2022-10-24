package com.lt.findlove.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lt.findlove.mapper.TagMapper;
import com.lt.findlove.model.entity.Tag;
import com.lt.findlove.service.TagService;
import org.springframework.stereotype.Service;

/**
* @author teng
* @description 针对表【tag(标签)】的数据库操作Service实现
* @createDate 2022-10-23 15:24:10
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




