package com.hgshequ.springcloud.model;

import lombok.*;

/**
 * @author : Sunny
 * @version V1.0
 * @Project: lianxi
 * @Package com.hgshequ.springcloud.model
 * @Description: TODO
 * @date Date : 2019年05月03日 15:06
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserModel extends  BaseModel{

    private Long userId;
    private String userName;
    private Integer age;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
