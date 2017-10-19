package com.lp.ttshop.dao;

import com.lp.common.dto.Page;
import com.lp.ttshop.pojo.po.TbItem;

import java.util.List;

public interface TbItemCustomMapper {
    long  countItems();

    List<TbItem> listItemsByPage(Page page);
}
