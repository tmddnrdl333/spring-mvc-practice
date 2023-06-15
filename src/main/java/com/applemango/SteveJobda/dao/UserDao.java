package com.applemango.SteveJobda.dao;

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

    /**
     * 아이디로 유저 조회
     *
     * @param id
     * @return 아이디가 일치하는 유저
     * @설명 아이디가 일치하는 유저 조회
     */
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

    /**
     * 아이디로 유저가 있는지 조회
     *
     * @param id
     * @return 아이디 존재여부
     * @설명 아이디 존재여부 검사 (탈퇴한 계정도 아이디 중복 비허용)
     */
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

    /**
     * 아이디와 패스워드로 탈퇴하지 않은 계정이 있는지
     *
     * @param id
     * @param password
     * @return 아이디와 비밀번호가 일치하며 탈퇴하지 않은 계정 존재여부
     * @설명 로그인 가능 여부 검사
     */
    public boolean isExistByIdAndPassword(String id, String password) {

        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id).andPasswordEqualTo(password).andDeleteYnEqualTo(false);
        List<User> users = userMapper.selectByExample(example);

        if (users.size() == 0) {
            return false;
        }
        return true;
    }

}
