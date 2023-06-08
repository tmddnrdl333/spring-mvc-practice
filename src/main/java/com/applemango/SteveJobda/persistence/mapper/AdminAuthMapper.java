package com.applemango.SteveJobda.persistence.mapper;

import com.applemango.SteveJobda.domain.AdminAuth;
import java.util.List;

public interface AdminAuthMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_auth
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    int deleteByPrimaryKey(Integer adminAuthSn);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_auth
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    int insert(AdminAuth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_auth
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    AdminAuth selectByPrimaryKey(Integer adminAuthSn);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_auth
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    List<AdminAuth> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_auth
     *
     * @mbg.generated Thu Jun 08 12:05:30 KST 2023
     */
    int updateByPrimaryKey(AdminAuth record);
}