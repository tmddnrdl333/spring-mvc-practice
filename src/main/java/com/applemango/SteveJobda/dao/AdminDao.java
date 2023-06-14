package com.applemango.SteveJobda.dao;

import com.applemango.SteveJobda.controller.response.AdminResponse;
import com.applemango.SteveJobda.db.generate.dao.AdminMapper;
import com.applemango.SteveJobda.db.generate.model.Admin;
import com.applemango.SteveJobda.db.generate.model.AdminExample;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class AdminDao implements BaseDao<Admin> {

    private AdminMapper adminMapper;

    private final SqlSession sqlSession;

    @PostConstruct
    public void init() {
        adminMapper = sqlSession.getMapper(AdminMapper.class);
    }

    @Override
    public boolean create(Admin admin) {
        return adminMapper.insertSelective(admin) > 0;
    }

    @Override
    public boolean update(Admin admin) {
        return adminMapper.updateByPrimaryKey(admin) > 0;
    }

    @Override
    public boolean delete(int key) {
        return adminMapper.deleteByPrimaryKey(key) > 0;
    }

    @Override
    public Admin find(int key) {
        return adminMapper.selectByPrimaryKey(key);
    }

    public Admin findById(String id) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<Admin> admins = adminMapper.selectByExample(example);

        /* 조회되지 않는 경우 */
        if (admins.size() == 0) {
            /* TODO: exception */
            return null;
        }
        return admins.get(0);
    }

    /* 탈퇴한 계정도 검사 */
    public boolean isExistById(String id) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<Admin> admins = adminMapper.selectByExample(example);

        if (admins.size() == 0) {
            return false;
        }
        return true;
    }

    /* 로그인 가능 여부를 알기 위함(탈퇴하지 않은 계정만) */
    public boolean isExistByIdAndPw(String id, String pw) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id).andPwEqualTo(pw);
        List<Admin> admins = adminMapper.selectByExample(example);

        /* 조회되지 않는 경우 */
        if (admins.size() == 0) {
            return false;
        }
        Admin admin = admins.get(0);
        /* 조회되었으나 탈퇴한 계정인 경우 */
        if (admin.getDeleteYn()) {
            return false;
        }
        /* 로그인 가능한 계정 (조회되며 탈퇴하지 않은 계정) */
        return true;
    }

    public AdminResponse.DetailResponse test(Integer admin_sn) {
        Admin admin = adminMapper.selectByPrimaryKey(admin_sn);
        return AdminResponse.DetailResponse.builder()
                .id(admin.getId())
                .name(admin.getName())
                .team(admin.getTeam())
                .phone(admin.getPhone())
                .build();
    }

}
