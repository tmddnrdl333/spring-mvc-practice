package com.applemango.SteveJobda.db.generate.model;

public class PostingWithBLOBs extends Posting {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posting.detail
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    private String detail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posting.qualification
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    private String qualification;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posting.detail
     *
     * @return the value of posting.detail
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
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
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
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
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
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
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    public void setQualification(String qualification) {
        this.qualification = qualification == null ? null : qualification.trim();
    }
}