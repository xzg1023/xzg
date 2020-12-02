package com.fh.user.entity;

import java.time.LocalDate;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@EqualsAndHashCode(callSuper = false)
public class TUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("用户名")
    private String name;
    @ApiModelProperty("性别")
    private Integer sex;
    @ApiModelProperty("生日")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    @ApiModelProperty("地区")
    private String area;
}
