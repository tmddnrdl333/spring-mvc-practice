package com.applemango.SteveJobda.dao;

import com.applemango.SteveJobda.domain.Admin;
import com.applemango.SteveJobda.domain.AdminExample;
import com.applemango.SteveJobda.persistence.mapper.AdminMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
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
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
//        criteria.andAdminSnEqualTo(1);
        List<Admin> admins = adminMapper.selectByExample(example);

        return admins;
    }

    @Override
    public Admin getAdminByIdPw(String id, String pw) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id).andPwEqualTo(pw);
        Admin admin = adminMapper.selectByExample(example).get(0);
        return admin;
    }
}
