package com.applemango.SteveJobda.controller.rqrs;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@Builder
public class UserDetailRs {
    private String id;
    private String name;
    private String team;
    private String phone;
}
