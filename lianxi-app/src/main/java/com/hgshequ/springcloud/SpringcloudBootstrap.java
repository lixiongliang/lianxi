package com.hgshequ.springcloud;


import com.hgshequ.springcloud.model.UserModel;
import com.hgshequ.springcloud.service.UserService;
import com.hgshequ.springcloud.util.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Ace on 2017/6/2.
 */
@SpringBootApplication
//@MapperScan("com.hgshequ.springcloud.mapper")
@EnableAutoConfiguration
public class SpringcloudBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudBootstrap.class, args);

        UserService userService = SpringUtil.getBean(UserService.class);
        UserModel userModel = userService.getUserModel("100");
        System.out.printf("usermodel:"+userModel.toString());

    }
}
