package com.lp.ttshop.web;

import com.lp.common.dto.Page;
import com.lp.common.dto.Result;
import com.lp.ttshop.pojo.po.TbItem;
import com.lp.ttshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
商品的控制层代码
 */
@Controller
@Scope("prototype")
public class ItemAction {

    @Autowired
    private ItemService itemService;

    @ResponseBody
    @RequestMapping(value = "item/{itemId}",method = RequestMethod.GET)
    public TbItem getById(@PathVariable Long itemId){

        System.out.println(itemId);
        return itemService.getById(itemId);
    }


  /*  @ResponseBody
    @RequestMapping("/items")
    public List<TbItem> listItems(){
        return itemService.listItems();
    }*/



    @RequestMapping("/items")
    @ResponseBody
    public Result<TbItem> listItemsByPage(Page page){

        return itemService.listItemsByPage(page);
    }
}
