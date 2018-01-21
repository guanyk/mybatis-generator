package com.hxy.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by HUANGXIYAO on 2017/11/23.
 */
@Setter
@Getter
@ToString
public class BaseModel implements Serializable{
    private static final long serialVersionUID = -3665540730986053048L;
    /**
     * 主键id，自增长
     */
    private String id;
    /**
     * 创建人
     */
    private String createdBy;
    /**
     * 创建时间
     */
    private Date createdAt;
    /**
     * 更新人
     */
    private String updatedBy;
    /**
     * 更新时间
     */
    private Date updatedAt;
}
