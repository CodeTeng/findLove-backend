package com.lt.findlove.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: 用户更新请求
 * @author: ~Teng~
 * @date: 2022/10/23 17:34
 */
@Data
@ApiModel("用户更新请求")
public class UserUpdateRequest implements Serializable {

    private static final long serialVersionUID = 3120381614247397706L;

    /**
     * id
     */
    @ApiModelProperty("用户id")
    private Long id;

    /**
     * 用户昵称
     */
    @ApiModelProperty("用户昵称")
    private String userName;

    /**
     * 账号
     */
    @ApiModelProperty("用户账号")
    private String userAccount;

    /**
     * 用户头像
     */
    @ApiModelProperty("用户头像")
    private String userAvatar;

    /**
     * 性别 1-男 2-女
     */
    @ApiModelProperty("性别 1-男 2-女")
    private Integer gender;

    /**
     * 用户角色: user, admin
     */
    @ApiModelProperty("用户角色: user, admin")
    private String userRole;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    private String userPassword;
}
