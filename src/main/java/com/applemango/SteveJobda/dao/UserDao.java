package com.applemango.SteveJobda.dao;

import com.applemango.SteveJobda.controller.rqrs.UserDetailRs;
import com.applemango.SteveJobda.db.generate.dao.UserMapper;
import com.applemango.SteveJobda.db.generate.model.User;
import com.applemango.SteveJobda.db.generate.model.UserExample;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class UserDao implements BaseDao<User> {

    private UserMapper userMapper;

    private final SqlSession sqlSession;

    @PostConstruct
    public void init() {
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Override
    public boolean create(User user) {
        return userMapper.insertSelective(user) > 0;
    }

    @Override
    public boolean update(User user) {
        return userMapper.updateByPrimaryKey(user) > 0;
    }

    @Override
    public boolean delete(int key) {
        return userMapper.deleteByPrimaryKey(key) > 0;
    }

    @Override
    public User find(int key) {
        return userMapper.selectByPrimaryKey(key);
    }

    public User findById(String id) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<User> users = userMapper.selectByExample(example);

        if (users.size() == 0) {
            return null;
        }
        return users.get(0);
    }

    /* 탈퇴한 계정도 검사 */
    public boolean isExistById(String id) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<User> users = userMapper.selectByExample(example);

        if (users.size() == 0) {
            return false;
        }
        return true;
    }

    /* 로그인 가능 여부를 알기 위함(탈퇴하지 않은 계정만) */
    public boolean isExistByIdAndPassword(String id, String password) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id).andPasswordEqualTo(password);
        List<User> users = userMapper.selectByExample(example);

        /* 조회되지 않는 경우 */
        if (users.size() == 0) {
            return false;
        }
        User user = users.get(0);
        /* 조회되었으나 탈퇴한 계정인 경우 */
        if (user.getDeleteYn()) {
            return false;
        }
        /* 로그인 가능한 계정 (조회되며 탈퇴하지 않은 계정) */
        return true;
    }

    public UserDetailRs test(Integer user_sn) {
        User user = userMapper.selectByPrimaryKey(user_sn);
        return UserDetailRs.builder()
                .id(user.getId())
                .name(user.getName())
                .team(user.getTeam())
                .phone(user.getPhone())
                .build();
    }

}
