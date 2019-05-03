package com.hgshequ.springcloud.service.impl;

import com.hgshequ.springcloud.annotation.SystemOperationLogAnnotation;
import com.hgshequ.springcloud.model.UserModel;
import com.hgshequ.springcloud.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author : Sunny
 * @version V1.0
 * @Project: lianxi
 * @Package com.hgshequ.springcloud.service
 * @Description: TODO
 * @date Date : 2019年05月03日 15:13
 */
@Service
public class UserServiceImpl implements UserService {

    @SystemOperationLogAnnotation("查询单个Id用户信息")
    @Override
    public UserModel getUserModel(String id) {
        UserModel model = new UserModel();
        model.setAge(10);
        model.setUserId(10000000L);
        model.setUserName("lisi");
        return model;
    }
}
