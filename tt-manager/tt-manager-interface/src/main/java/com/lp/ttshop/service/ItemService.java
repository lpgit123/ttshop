package com.lp.ttshop.service;

import com.lp.common.dto.Page;
import com.lp.common.dto.Result;
import com.lp.ttshop.pojo.po.TbItem;

import java.util.List;

/*
商品实体类的业务逻辑层接口
 */
public interface ItemService {
    TbItem getById(Long itemId);

    List<TbItem> listItems();

    Result<TbItem> listItemsByPage(Page page);
}

