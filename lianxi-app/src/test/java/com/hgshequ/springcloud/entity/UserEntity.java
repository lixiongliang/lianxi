package com.hgshequ.springcloud.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author : Sunny
 * @version V1.0
 * @Project: lianxi
 * @Package com.hgshequ.springcloud.entity
 * @Description: TODO
 * @date Date : 2019年05月05日 9:26
 */
@Getter
@Setter
public class UserEntity {
    public UserEntity(String id, String name) {
        this.id = id;
        this.name = name;
    }

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
