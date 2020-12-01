package com.fh.user.entity;

import java.time.LocalDate;
import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class TUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("用户名")
    private String name;
    @ApiModelProperty("性别")
    private Integer sex;
    @ApiModelProperty("生日")
    private LocalDate birthday;
    @ApiModelProperty("地区")
    private String area;
}
