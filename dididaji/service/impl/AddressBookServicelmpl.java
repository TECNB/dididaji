package com.TEC.dididaji.service.impl;

import com.TEC.dididaji.dto.DishDto;
import com.TEC.dididaji.entity.AddressBook;
import com.TEC.dididaji.entity.Category;
import com.TEC.dididaji.mapper.AddressBookMapper;
import com.TEC.dididaji.mapper.CategoryMapper;
import com.TEC.dididaji.service.AddressBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServicelmpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
