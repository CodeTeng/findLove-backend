package com.lt.findlove.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: 用户登录请求体
 * @author: ~Teng~
 * @date: 2022/10/23 16:35
 */
@Data
@ApiModel("用户登录请求体")
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -8540879947469305890L;

    @ApiModelProperty("用户账号")
    private String userAccount;

    @ApiModelProperty("用户密码")
    private String userPassword;
}
