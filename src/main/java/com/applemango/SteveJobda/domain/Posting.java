package com.applemango.SteveJobda.domain;

import java.util.Date;

public class Posting {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posting.posting_sn
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    private Integer postingSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posting.admin_sn
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    private Integer adminSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posting.img_sn
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    private Integer imgSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posting.title
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posting.start_datetime
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    private Date startDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posting.end_datetime
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    private Date endDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posting.created_datetime
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    private Date createdDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posting.updated_datetime
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    private Date updatedDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posting.delete_yn
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    private Boolean deleteYn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posting.detail
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    private String detail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posting.qualification
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    private String qualification;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posting.posting_sn
     *
     * @return the value of posting.posting_sn
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public Integer getPostingSn() {
        return postingSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posting.posting_sn
     *
     * @param postingSn the value for posting.posting_sn
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public void setPostingSn(Integer postingSn) {
        this.postingSn = postingSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posting.admin_sn
     *
     * @return the value of posting.admin_sn
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public Integer getAdminSn() {
        return adminSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posting.admin_sn
     *
     * @param adminSn the value for posting.admin_sn
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public void setAdminSn(Integer adminSn) {
        this.adminSn = adminSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posting.img_sn
     *
     * @return the value of posting.img_sn
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public Integer getImgSn() {
        return imgSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posting.img_sn
     *
     * @param imgSn the value for posting.img_sn
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public void setImgSn(Integer imgSn) {
        this.imgSn = imgSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posting.title
     *
     * @return the value of posting.title
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posting.title
     *
     * @param title the value for posting.title
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posting.start_datetime
     *
     * @return the value of posting.start_datetime
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public Date getStartDatetime() {
        return startDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posting.start_datetime
     *
     * @param startDatetime the value for posting.start_datetime
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public void setStartDatetime(Date startDatetime) {
        this.startDatetime = startDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posting.end_datetime
     *
     * @return the value of posting.end_datetime
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public Date getEndDatetime() {
        return endDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posting.end_datetime
     *
     * @param endDatetime the value for posting.end_datetime
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public void setEndDatetime(Date endDatetime) {
        this.endDatetime = endDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posting.created_datetime
     *
     * @return the value of posting.created_datetime
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public Date getCreatedDatetime() {
        return createdDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posting.created_datetime
     *
     * @param createdDatetime the value for posting.created_datetime
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posting.updated_datetime
     *
     * @return the value of posting.updated_datetime
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public Date getUpdatedDatetime() {
        return updatedDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posting.updated_datetime
     *
     * @param updatedDatetime the value for posting.updated_datetime
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public void setUpdatedDatetime(Date updatedDatetime) {
        this.updatedDatetime = updatedDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posting.delete_yn
     *
     * @return the value of posting.delete_yn
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public Boolean getDeleteYn() {
        return deleteYn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posting.delete_yn
     *
     * @param deleteYn the value for posting.delete_yn
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public void setDeleteYn(Boolean deleteYn) {
        this.deleteYn = deleteYn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posting.detail
     *
     * @return the value of posting.detail
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posting.detail
     *
     * @param detail the value for posting.detail
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posting.qualification
     *
     * @return the value of posting.qualification
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public String getQualification() {
        return qualification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posting.qualification
     *
     * @param qualification the value for posting.qualification
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public void setQualification(String qualification) {
        this.qualification = qualification == null ? null : qualification.trim();
    }
}