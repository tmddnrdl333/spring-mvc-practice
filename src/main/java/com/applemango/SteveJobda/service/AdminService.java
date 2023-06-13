package com.applemango.SteveJobda.service;

import com.applemango.SteveJobda.controller.request.AdminRequest;
import com.applemango.SteveJobda.db.generate.dao.AdminMapper;
import com.applemango.SteveJobda.db.generate.model.Admin;
import com.applemango.SteveJobda.db.generate.model.AdminExample;
import com.applemango.SteveJobda.exception.DuplicateIdException;
import com.applemango.SteveJobda.exception.PwNotMatchException;
import com.applemango.SteveJobda.util.encrypter;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

@Service
public class AdminService {

    private AdminMapper adminMapper;

    @Autowired
    private SqlSession sqlSession;

    @PostConstruct
    public void init() {
        adminMapper = sqlSession.getMapper(AdminMapper.class);
    }

    public void signup(AdminRequest.SignupRequest request) throws PwNotMatchException, NoSuchAlgorithmException {

//        if (condition) {
//        }

        // ID 중복인 경우
        if (getAdminById(request.getId()) != null) {
            throw new DuplicateIdException();
        }

        // PW 중복인 경우
        if (request.getPw() == null || request.getPw().equals(request.getPwCheck()) == false) {
            throw new PwNotMatchException();
        }

        // builder 사용 가능한지?
        Admin admin = new Admin();
        admin.setId(request.getId());
        String pwEncrypted = encrypter.encrypt(request.getPw());
        admin.setPw(pwEncrypted);
        admin.setName(request.getName());
        admin.setTeam(request.getTeam());
        admin.setPhone(request.getPhone());
        admin.setCreateDatetime(new Date());
        admin.setDeleteYn(false);
        adminMapper.insert(admin);
    }

    public Admin getAdminById(String id) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        Admin admin = adminMapper.selectByExample(example).get(0);
        return admin;
    }
}
