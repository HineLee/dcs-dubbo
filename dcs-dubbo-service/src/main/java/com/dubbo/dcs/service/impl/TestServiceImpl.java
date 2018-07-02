package com.dubbo.dcs.service.impl;

import com.dubbo.dcs.mapper.test.TDubboInfMapper;
import com.dubbo.dcs.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * dubbo 生产者实现
 */
@Service("testServiceImpl")
public class TestServiceImpl implements TestService {

    @Autowired
    private TDubboInfMapper tDubboInfMapper;
    /**
     * 测试dubbo方法实现
     * @param desc
     */
    @Override
    public void test(String desc) {
        if (null == desc) {
            System.out.print("The desc is null!");
            return;
        }
        System.out.print("DESC: " + desc);
        tDubboInfMapper.getInfById(1);
        
    }
}
