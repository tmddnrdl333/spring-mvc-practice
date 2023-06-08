package com.applemango.SteveJobda.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;


@Getter
@Setter
@ToString
public class AdminDto {
    private Integer adminSn;
    private String id;
    private String pw;
    private String name;
    private String team;
    private String phone;
    private Date createDatetime;
    private Date updatedDatetime;
    private Boolean deleteYn;

}
