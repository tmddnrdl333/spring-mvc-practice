package com.applemango.SteveJobda.db.generate.model;

public class Img {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img.img_sn
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    private Integer imgSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img.path
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    private String path;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img.file_name
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    private String fileName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img.size
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    private Integer size;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img.img_sn
     *
     * @return the value of img.img_sn
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
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
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
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
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
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
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
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
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
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
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img.size
     *
     * @return the value of img.size
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    public Integer getSize() {
        return size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img.size
     *
     * @param size the value for img.size
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    public void setSize(Integer size) {
        this.size = size;
    }
}