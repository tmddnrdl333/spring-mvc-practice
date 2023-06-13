package com.applemango.SteveJobda.controller.response;

import lombok.Builder;
import lombok.Getter;

public class AdminResponse {

    @Getter /* Getter가 있어야 ResponseBody에 json으로 보여주던데 */
    @Builder
    public static class DetailResponse {
        private String id;
        private String name;
        private String team;
        private String phone;
    }

}
