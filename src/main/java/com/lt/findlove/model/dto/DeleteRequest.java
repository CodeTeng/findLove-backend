package com.lt.findlove.model.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: 删除请求
 * @author: ~Teng~
 * @date: 2022/10/23 17:31
 */
@Data
@ApiModel("删除请求")
public class DeleteRequest implements Serializable {

    private static final long serialVersionUID = 1994523428120919352L;

    private Long id;
}
