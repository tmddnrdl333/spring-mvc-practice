package com.applemango.SteveJobda.db.generate.model;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_sn
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    private Integer userSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.team
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    private String team;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phone
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.created_datetime
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    private Date createdDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.updated_datetime
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    private Date updatedDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.delete_yn
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    private Boolean deleteYn;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_sn
     *
     * @return the value of user.user_sn
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public Integer getUserSn() {
        return userSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public User withUserSn(Integer userSn) {
        this.setUserSn(userSn);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_sn
     *
     * @param userSn the value for user.user_sn
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public void setUserSn(Integer userSn) {
        this.userSn = userSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public User withId(String id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public User withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public User withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.team
     *
     * @return the value of user.team
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public String getTeam() {
        return team;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public User withTeam(String team) {
        this.setTeam(team);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.team
     *
     * @param team the value for user.team
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public void setTeam(String team) {
        this.team = team == null ? null : team.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phone
     *
     * @return the value of user.phone
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public User withPhone(String phone) {
        this.setPhone(phone);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phone
     *
     * @param phone the value for user.phone
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.created_datetime
     *
     * @return the value of user.created_datetime
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public Date getCreatedDatetime() {
        return createdDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public User withCreatedDatetime(Date createdDatetime) {
        this.setCreatedDatetime(createdDatetime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.created_datetime
     *
     * @param createdDatetime the value for user.created_datetime
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.updated_datetime
     *
     * @return the value of user.updated_datetime
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public Date getUpdatedDatetime() {
        return updatedDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public User withUpdatedDatetime(Date updatedDatetime) {
        this.setUpdatedDatetime(updatedDatetime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.updated_datetime
     *
     * @param updatedDatetime the value for user.updated_datetime
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public void setUpdatedDatetime(Date updatedDatetime) {
        this.updatedDatetime = updatedDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.delete_yn
     *
     * @return the value of user.delete_yn
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public Boolean getDeleteYn() {
        return deleteYn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public User withDeleteYn(Boolean deleteYn) {
        this.setDeleteYn(deleteYn);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.delete_yn
     *
     * @param deleteYn the value for user.delete_yn
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    public void setDeleteYn(Boolean deleteYn) {
        this.deleteYn = deleteYn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Jun 15 15:29:13 KST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userSn=").append(userSn);
        sb.append(", id=").append(id);
        sb.append(", password=").append(password);
        sb.append(", name=").append(name);
        sb.append(", team=").append(team);
        sb.append(", phone=").append(phone);
        sb.append(", createdDatetime=").append(createdDatetime);
        sb.append(", updatedDatetime=").append(updatedDatetime);
        sb.append(", deleteYn=").append(deleteYn);
        sb.append("]");
        return sb.toString();
    }
}