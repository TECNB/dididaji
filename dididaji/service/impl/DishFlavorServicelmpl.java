package com.TEC.dididaji.service.impl;

import com.TEC.dididaji.dto.DishDto;
import com.TEC.dididaji.entity.DishFlavor;
import com.TEC.dididaji.mapper.DishFlavorMapper;
import com.TEC.dididaji.service.DishFlavorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service

public class DishFlavorServicelmpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {

    public void saveWithFlavor(DishDto dishDto){
        this.save(dishDto);
    }

    private void save(DishDto dishDto) {
    }
}
