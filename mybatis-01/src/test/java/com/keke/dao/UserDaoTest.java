package com.keke.dao;

import com.keke.pojo.User;
import com.keke.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test() {
        // 1.获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 方式一：2.执行SQL
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        //关闭SqlSession
        sqlSession.close();
    }
}
