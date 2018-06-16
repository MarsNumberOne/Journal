package com.mach.journal.dao;

import com.alibaba.fastjson.JSON;
import com.mach.journal.dao.bean.Users;
import com.mach.journal.dao.mapper.UsersDao;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext.xml"})
@Slf4j
public class DaoTest {
    @Autowired
    private UsersDao usersDao;
    @Test
    public void userTestFisrt(){
        List<Users> users = usersDao.selectAllUsers();
        System.out.println(JSON.toJSONString(users));
    }
}
