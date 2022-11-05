package com.TEC.dididaji.dto;

import com.TEC.dididaji.entity.Setmeal;
import com.TEC.dididaji.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
