package com.applemango.SteveJobda.dao;

import com.applemango.SteveJobda.domain.Admin;
import com.applemango.SteveJobda.domain.AdminExample;
import com.applemango.SteveJobda.persistence.mapper.AdminMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AdminDaoImpl implements AdminDao {

    private AdminMapper adminMapper;

    @Autowired
    private SqlSession sqlSession;

    @PostConstruct
    public void init() {
        adminMapper = sqlSession.getMapper(AdminMapper.class);
    }

    @Override
    public List<Admin> getAllAdmins() {
        System.out.println("DAO");

        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andAdminSnEqualTo(1);
        System.out.println(example);
        List<Admin> admins = adminMapper.selectByExample(example);
        System.out.println(admins);

        return admins;
    }
}
