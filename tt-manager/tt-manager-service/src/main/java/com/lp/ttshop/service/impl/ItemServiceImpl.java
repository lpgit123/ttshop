package com.lp.ttshop.service.impl;

import com.lp.common.dto.Page;
import com.lp.common.dto.Result;
import com.lp.ttshop.dao.TbItemMapper;
import com.lp.ttshop.dao.TbItemCustomMapper;
import com.lp.ttshop.pojo.po.TbItem;
import com.lp.ttshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private TbItemMapper itemDao;

    @Autowired
    private TbItemCustomMapper customDao;

    @Override
    public TbItem getById(Long itemId){
        return  itemDao.selectByPrimaryKey(itemId);
    }

    @Override
    public List<TbItem> listItems() {
        return itemDao.selectByExample(null);
    }

    @Override
    public Result<TbItem> listItemsByPage(Page page) {

        List<TbItem> rows = customDao.listItemsByPage(page);
        long total = customDao.countItems();
        Result<TbItem> rs = new Result<TbItem>();
        rs.setRows(rows);
        rs.setTotal(total);
        return rs;

    }
}
