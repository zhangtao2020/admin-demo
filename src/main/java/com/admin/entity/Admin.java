package com.admin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;
    import java.util.Date;

/**
* @author tao on 2020-04-16 16:58:51
*/
@Data
@Accessors(chain = true)
public class Admin {

/**
* 主键
*/
@TableId(type = IdType.AUTO)
private Integer id;


    /**
    * 登录名称
    */
    private String loginname;

    /**
     * 用户名称
     */
    private String username;

    /**
    * 手机号
    */
    private String telphone;

    /**
    * 邮箱
    */
    private String email;

    /**
    * 状态
    */
    private Integer status;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 修改时间
    */
    private Date modifyTime;

}