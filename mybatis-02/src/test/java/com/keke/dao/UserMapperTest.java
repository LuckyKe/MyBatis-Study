package com.keke.dao;

import com.keke.pojo.User;
import com.keke.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void getUserList() {
        // 1.获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 方式一：2.执行SQL
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();

        // 方式二：
//        List<User> userList = sqlSession.selectList("com.keke.dao.UserDao.getUserList");

        for (User user : userList) {
            System.out.println(user);
        }

        //关闭SqlSession
        sqlSession.close();
    }
}
