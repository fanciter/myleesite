package com.fanciter.myleesite.SysUser.Mapper.test;


import com.fanciter.myleesite.module.user.entity.SysUser;
import com.fanciter.myleesite.module.user.mapper.SysUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration({"classpath:spring-context.xml"})
public class SysUserMapperTest {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    public void testSysUserMapper(){
        SysUser sysUser = new SysUser();
        sysUser.setId("333333333");
        sysUser.setLoginName("wang");

        int i = sysUserMapper.insert(sysUser);
        System.out.println(i);
    }

}
