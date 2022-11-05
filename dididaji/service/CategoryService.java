package com.TEC.dididaji.service;

import com.TEC.dididaji.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

public interface CategoryService extends IService<Category> {
        public void remove(Long id);
}
