package com.applemango.SteveJobda.domain;

public class Img {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img.img_sn
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    private Integer imgSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img.path
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    private String path;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img.file_name
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    private String fileName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img.width
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    private Integer width;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img.height
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    private Integer height;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img.img_sn
     *
     * @return the value of img.img_sn
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public Integer getImgSn() {
        return imgSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img.img_sn
     *
     * @param imgSn the value for img.img_sn
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public void setImgSn(Integer imgSn) {
        this.imgSn = imgSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img.path
     *
     * @return the value of img.path
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img.path
     *
     * @param path the value for img.path
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img.file_name
     *
     * @return the value of img.file_name
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img.file_name
     *
     * @param fileName the value for img.file_name
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img.width
     *
     * @return the value of img.width
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img.width
     *
     * @param width the value for img.width
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img.height
     *
     * @return the value of img.height
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img.height
     *
     * @param height the value for img.height
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    public void setHeight(Integer height) {
        this.height = height;
    }
}