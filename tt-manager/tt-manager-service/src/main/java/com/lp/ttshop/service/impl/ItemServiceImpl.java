package com.lp.ttshop.service.impl;

import com.lp.ttshop.dao.TbItemMapper;
import com.lp.ttshop.pojo.po.TbItem;
import com.lp.ttshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private TbItemMapper itemDao;

    @Override
    public TbItem getById(Long itemId){
        return  itemDao.selectByPrimaryKey(itemId);
    }
}
