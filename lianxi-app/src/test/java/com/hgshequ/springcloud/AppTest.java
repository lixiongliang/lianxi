package com.hgshequ.springcloud;

import static org.junit.Assert.assertTrue;

import com.hgshequ.springcloud.entity.UserEntity;
import org.junit.Test;

import java.util.Optional;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public static void main(String[] args) {
//        UserEntity userEntity = null;
//        UserEntity  userEntity1 = Optional.ofNullable(userEntity).orElse(new UserEntity("2","name2"));
//        System.out.printf(userEntity1.getName());
        int h;
        String key = "key123";
        int hash = (h = key.hashCode()) ^ (h >>> 16);
        System.out.printf("hash:"+(h >>> 16));
        System.out.printf("hash:"+key.hashCode());
     }
}
