package com.applemango.SteveJobda.domain;

public class Auth {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth.auth_sn
     *
     * @mbg.generated Thu Jun 08 13:58:32 KST 2023
     */
    private Integer authSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth.type
     *
     * @mbg.generated Thu Jun 08 13:58:32 KST 2023
     */
    private String type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth.auth_sn
     *
     * @return the value of auth.auth_sn
     *
     * @mbg.generated Thu Jun 08 13:58:32 KST 2023
     */
    public Integer getAuthSn() {
        return authSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth.auth_sn
     *
     * @param authSn the value for auth.auth_sn
     *
     * @mbg.generated Thu Jun 08 13:58:32 KST 2023
     */
    public void setAuthSn(Integer authSn) {
        this.authSn = authSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth.type
     *
     * @return the value of auth.type
     *
     * @mbg.generated Thu Jun 08 13:58:32 KST 2023
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth.type
     *
     * @param type the value for auth.type
     *
     * @mbg.generated Thu Jun 08 13:58:32 KST 2023
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}