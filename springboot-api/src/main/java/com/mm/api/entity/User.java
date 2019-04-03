package com.mm.api.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Accessors(chain = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(required = true, value = "用户ID", name = "id")
    private Long id;

    @ApiModelProperty(value = "用户帐号", name = "username")
    private String username;

    @ApiModelProperty(value = "用户密码", name = "password")
    private String password;

    @ApiModelProperty(value = "用户昵称", name = "nickName")
    private String nickName;

    @ApiModelProperty(value = "用户性别", name = "gender")
    private Gender gender;

    public enum Gender {
        //男
        MALE,
        //女
        FEMALE
    }

    @ApiModelProperty(value = "用户年龄", name = "age")
    private Integer age;

    @ApiModelProperty(value = "创建时间", name = "gmtCreate")
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间", name = "gmtModified")
    private Date gmtModified;

}
