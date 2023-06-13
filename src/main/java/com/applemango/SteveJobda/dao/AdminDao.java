package com.applemango.SteveJobda.dao;

import com.applemango.SteveJobda.controller.response.AdminResponse;
import com.applemango.SteveJobda.db.generate.dao.AdminMapper;
import com.applemango.SteveJobda.db.generate.model.Admin;
import com.applemango.SteveJobda.db.generate.model.AdminExample;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;

@Repository
public class AdminDao implements BaseDao<Admin> {

    private AdminMapper adminMapper;

    @Autowired
    private SqlSession sqlSession;

    @PostConstruct
    public void init() {
        adminMapper = sqlSession.getMapper(AdminMapper.class);
    }

    @Override
    public boolean create(Admin admin) {
        return adminMapper.insert(admin) > 0;
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
            return null;
        }
        /* 조회되었음. (삭제되었어도 ID 중복되지 않아야 함.) */
        return admins.get(0);
    }

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
