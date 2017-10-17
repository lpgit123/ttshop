package com.lp.ttshop.dao;

import com.lp.ttshop.pojo.po.TbUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao-test.xml"})
public class TbUserMapperTest {

    @Autowired
    private  TbUserMapper userMapper;

    @Test
    public void selectByPrimaryKey() throws Exception {

        TbUser user = userMapper.selectByPrimaryKey(5l);
        System.out.println(user);
    }

}