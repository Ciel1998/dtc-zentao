package com.tjfybj.dtc.zentao.service.impl;

import com.mysql.fabric.xmlrpc.base.Data;
import com.tjfybj.dtc.zentao.mapper.TestMapper;
import com.tjfybj.dtc.zentao.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2020/11/19 16:48
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */
@Service
public class TestServiceImpl implements TestService {
    @Resource
    private TestMapper testMapper;
    /**
     * User:
     * Date: 2020/11/15
     * Description:
     **/
    @Override
    public Integer test(Date upData, Date endData) {

        return null;
    }
}
