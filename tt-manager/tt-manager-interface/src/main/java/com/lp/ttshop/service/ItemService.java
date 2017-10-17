package com.lp.ttshop.service;

import com.lp.ttshop.pojo.po.TbItem;

/*
商品实体类的业务逻辑层接口
 */
public interface ItemService {
    TbItem getById(Long itemId);
}
