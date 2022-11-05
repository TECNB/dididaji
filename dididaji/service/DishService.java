package com.TEC.dididaji.service;

import com.TEC.dididaji.dto.DishDto;
import com.TEC.dididaji.entity.Dish;
import com.baomidou.mybatisplus.extension.service.IService;

public interface DishService extends IService<Dish> {

    //新增菜品，同时操作两张表
    public void saveWithFlavor(DishDto dishDto);

    //根据id擦汗寻菜品信息和对应口味信息
    public  DishDto getByIdWithFlavor(long id);

    public  void  updateWithFlavor(DishDto dishDto);
}
