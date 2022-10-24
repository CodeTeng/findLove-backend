package com.lt.findlove.model.dto;

import com.lt.findlove.common.PageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: 用户查询请求
 * @author: ~Teng~
 * @date: 2022/10/23 17:46
 */
@Data
@ApiModel("用户查询请求")
@EqualsAndHashCode(callSuper = true)
public class UserQueryRequest extends PageRequest implements Serializable {

    private static final long serialVersionUID = 5804824509827739524L;

    @ApiModelProperty("用户id")
    private Long id;

    @ApiModelProperty("用户昵称")
    private String userName;

    @ApiModelProperty("用户账号")
    private String userAccount;

    @ApiModelProperty("用户头像")
    private String userAvatar;

    @ApiModelProperty("性别 1-男 2-女")
    private Integer gender;

    @ApiModelProperty("用户角色: user, admin")
    private String userRole;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;
}
