package com.lt.findlove.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: 用户注册请求体
 * @author: ~Teng~
 * @date: 2022/10/23 15:44
 */
@Data
@ApiModel("用户注册请求体")
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -660154887252243677L;

    /**
     * 用户账号
     */
    @ApiModelProperty("用户账号")
    private String userAccount;

    /**
     * 用户密码
     */
    @ApiModelProperty("用户密码")
    private String userPassword;

    /**
     * 确认密码
     */
    @ApiModelProperty("确认密码")
    private String checkPassword;
}
