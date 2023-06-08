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

    private static String namespace = "com.applemango.SteveJobda.persistence.mapper.AdminMapper";

    @Autowired
    private SqlSession sqlSession;

    private AdminMapper adminMapper;

    @PostConstruct
    public void init(){
        adminMapper = sqlSession.getMapper(AdminMapper.class);
    }

    @Override
    public List<Admin> getAllAdmins() {
        System.out.println("DAO");
        //System.out.println(sqlSession.selectList(namespace+".selectAll"));

        AdminExample example = new AdminExample();
        example.createCriteria()
                .andAdminSnEqualTo(1);
        List<Admin> admins = adminMapper.selectByExample(example);

        //List<Admin> list = sqlSession.selectList(namespace + ".selectAll");
        //System.out.println(list);
        return new ArrayList<>();
    }
}
