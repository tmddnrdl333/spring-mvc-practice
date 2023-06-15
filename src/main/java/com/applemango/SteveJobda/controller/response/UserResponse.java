package com.applemango.SteveJobda.controller.response;

import lombok.Builder;
import lombok.Getter;

public class UserResponse {

    @Getter
    @Builder
    public static class DetailResponse {
        private String id;
        private String name;
        private String team;
        private String phone;
    }

}
