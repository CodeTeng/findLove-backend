package com.lt.findlove.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lt.findlove.mapper.SearchHistoryMapper;
import com.lt.findlove.model.entity.SearchHistory;
import com.lt.findlove.service.SearchHistoryService;
import org.springframework.stereotype.Service;

/**
* @author teng
* @description 针对表【search_history(搜索记录)】的数据库操作Service实现
* @createDate 2022-10-23 15:24:10
*/
@Service
public class SearchHistoryServiceImpl extends ServiceImpl<SearchHistoryMapper, SearchHistory>
    implements SearchHistoryService {

}




