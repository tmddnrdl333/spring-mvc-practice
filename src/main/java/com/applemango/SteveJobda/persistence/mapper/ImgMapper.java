package com.applemango.SteveJobda.persistence.mapper;

import com.applemango.SteveJobda.domain.Img;
import com.applemango.SteveJobda.domain.ImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ImgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Thu Jun 08 16:45:53 KST 2023
     */
    long countByExample(ImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Thu Jun 08 16:45:53 KST 2023
     */
    int deleteByExample(ImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Thu Jun 08 16:45:53 KST 2023
     */
    int deleteByPrimaryKey(Integer imgSn);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Thu Jun 08 16:45:53 KST 2023
     */
    int insert(Img row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Thu Jun 08 16:45:53 KST 2023
     */
    int insertSelective(Img row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Thu Jun 08 16:45:53 KST 2023
     */
    List<Img> selectByExampleWithRowbounds(ImgExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Thu Jun 08 16:45:53 KST 2023
     */
    List<Img> selectByExample(ImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Thu Jun 08 16:45:53 KST 2023
     */
    Img selectByPrimaryKey(Integer imgSn);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Thu Jun 08 16:45:53 KST 2023
     */
    int updateByExampleSelective(@Param("row") Img row, @Param("example") ImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Thu Jun 08 16:45:53 KST 2023
     */
    int updateByExample(@Param("row") Img row, @Param("example") ImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Thu Jun 08 16:45:53 KST 2023
     */
    int updateByPrimaryKeySelective(Img row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img
     *
     * @mbg.generated Thu Jun 08 16:45:53 KST 2023
     */
    int updateByPrimaryKey(Img row);
}