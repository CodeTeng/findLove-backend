package com.lt.findlove.model.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: 用户视图
 * @author: ~Teng~
 * @date: 2022/10/23 16:50
 */
@Data
@ApiModel("用户视图")
public class UserVO implements Serializable {
    /**
     * id
     */
    @ApiModelProperty("用户ID")
    private Long id;

    /**
     * 用户昵称
     */
    @ApiModelProperty("用户昵称")
    private String userName;

    /**
     * 用户头像
     */
    @ApiModelProperty("用户头像")
    private String userAvatar;

    /**
     * 性别
     */
    @ApiModelProperty("用户性别 1-男 2-女")
    private Integer gender;

    /**
     * 用户角色：user / admin
     */
    @ApiModelProperty("用户角色：user / admin")
    private String userRole;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}
