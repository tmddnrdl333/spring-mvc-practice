package com.applemango.SteveJobda.db.generate.dao;

import com.applemango.SteveJobda.db.generate.model.Admin;
import com.applemango.SteveJobda.db.generate.model.AdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    long countByExample(AdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    int deleteByExample(AdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    int deleteByPrimaryKey(Integer adminSn);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    int insert(Admin row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    int insertSelective(Admin row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    List<Admin> selectByExample(AdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    Admin selectByPrimaryKey(Integer adminSn);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    int updateByExampleSelective(@Param("row") Admin row, @Param("example") AdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    int updateByExample(@Param("row") Admin row, @Param("example") AdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    int updateByPrimaryKeySelective(Admin row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Jun 13 08:52:40 KST 2023
     */
    int updateByPrimaryKey(Admin row);
}