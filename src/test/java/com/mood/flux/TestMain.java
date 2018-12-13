package com.mood.flux;

import com.mood.flux.utils.RsaUtils;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class TestMain {
    public static void main(String[] args) {
        String s = "TS_ozbAIv8PqGhMgzzCOyhaYvu9QGkY_1538214521000";
        String c1 = RsaUtils.encryptByPublic(s.getBytes(),null);
        String m1 = RsaUtils.decryptByPrivate(c1,null);
        System.out.println(c1);
        System.out.println(m1);
    }
}
