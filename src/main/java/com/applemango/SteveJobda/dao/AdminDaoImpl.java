package com.applemango.SteveJobda.dao;

import com.applemango.SteveJobda.domain.Admin;
import com.applemango.SteveJobda.persistence.mapper.AdminMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDaoImpl implements AdminDao {

    private static String namespace = "com.applemango.SteveJobda.persistence.mapper.AdminMapper";
    SqlSession sqlSession;

    @Autowired
    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public Admin getAdminByAdminSn(Integer adminSn) {
        System.out.println("DAO");
//        Admin admin = sqlSession.selectOne(namespace + ".selectByPrimaryKey", 1);
        Admin admin = sqlSession.getMapper(AdminMapper.class).selectByPrimaryKey(1);
        System.out.println(admin);
        return admin;
    }
}
