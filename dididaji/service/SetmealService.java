package com.TEC.dididaji.service;

import com.TEC.dididaji.dto.DishDto;
import com.TEC.dididaji.dto.SetmealDto;
import com.TEC.dididaji.entity.Setmeal;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时需要保存套餐与菜品的关联关系
     * @param setmealDto
     */
    public  void  saveWithDish(SetmealDto setmealDto);

    public  SetmealDto getByIdWithDish(long id);

    public  void  updateWithDish(SetmealDto setmealDto);
}
