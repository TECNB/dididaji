package com.TEC.dididaji.service.impl;

import com.TEC.dididaji.entity.Employee;
import com.TEC.dididaji.mapper.EmployeeMapper;
import com.TEC.dididaji.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
