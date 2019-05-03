package com.hgshequ.springcloud.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @author : Sunny
 * @version V1.0
 * @Project: lianxi
 * @Package com.hgshequ.springcloud.model
 * @Description: TODO
 * @date Date : 2019年05月03日 15:06
 */
public class BaseModel implements Serializable {

    @Override
    public String toString() {
       return ToStringBuilder.reflectionToString(this);
     }
}
