package com.hy.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

/***
 * <p>
 * 客户实体
 * </p>
 * @author hy
 * @date 2021/2/19 14:24
 **/
@TableName("h_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer age;

    private String email;

    @TableField(fill = FieldFill.INSERT)
    private Timestamp createDate;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Timestamp updateDate;

    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;

}
