package com.lp.ttshop.dao;

import com.lp.common.dto.Page;
import com.lp.ttshop.pojo.po.TbItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao-test.xml"})
public class TbItemCustomMapperTest {
    @Autowired
    private TbItemCustomMapper itemDao;

    @Test
    public void countItems() throws Exception {
        System.out.println(itemDao.countItems());
    }

    @Test
    public void listItemsByPage() throws Exception {
        Page page = new Page();
        page.setPage(1);
        page.setRows(10);
        List<TbItem> list = itemDao.listItemsByPage(page);
        System.out.println(list);
    }

}