package com.cloudo.bwee.test;

import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;


public class EncypterTest {  
  
    public static void main(String[] args) {  
         //加密     
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();     
        
        textEncryptor.setPassword("bwee");
        String url = "jdbc:mysql://127.0.0.1:3306/dev?useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false";
            String jdbcUrl = textEncryptor.encrypt(url);
        System.out.println("jdbcUrl:"+jdbcUrl); 
        String user = textEncryptor.encrypt("bwee_test");
        System.out.println("user:"+user); 
        String passwd = textEncryptor.encrypt("bwee_test*1");
        System.out.println("passwd:"+passwd);

          
    }

    @Test
    public void testDecrypt() {
        System.out.println(DeEncypterUtils.decrypt("V7jELd2rgEso3xm4qM+UDsep5b1CnE0ihbm66dIk6/NI8maGLGj/UGpCIT01awf3xKWRg9+Ml7ygZNf1ryTpwRluh3PfDVz2MrKGYZvPxKpOKYQqr984Zg=="));
        System.out.println(DeEncypterUtils.decrypt("qxp4P94sSARN48h2GY9p0bzQzjpJZORo"));
        System.out.println(DeEncypterUtils.decrypt("qROGPa4zH5UyWqG+4wOb9aiL31hFtypg"));
    }
}  

