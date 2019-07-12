package com.ssm.service.impl;

import com.ssm.dao.ItemsMapper;
import com.ssm.pojo.Items;
import com.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;
    @Override
    public Items findById(Integer id) {
        return itemsMapper.findById(id);
    }
}
