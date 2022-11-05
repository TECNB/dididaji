package com.TEC.dididaji.dto;

import com.TEC.dididaji.entity.Dish;
import com.TEC.dididaji.entity.DishFlavor;
import com.TEC.dididaji.entity.Dish;
import com.TEC.dididaji.entity.DishFlavor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;


@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
