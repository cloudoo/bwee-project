package com.cloudo.bwee.app;

import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;


public class EncypterTest {

    public static void encptRemote(){
        //加密
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();

        textEncryptor.setPassword("bwee");
        String url = "jdbc:mysql://10.79.169.27:3306/bwee_dev?useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false";
        String jdbcUrl = textEncryptor.encrypt(url);
        System.out.println("jdbcUrl:"+jdbcUrl);
        String user = textEncryptor.encrypt("bwee_test");
        System.out.println("user:"+user);
        String passwd = textEncryptor.encrypt("bwee_test*1");
        System.out.println("passwd:"+passwd);
    }

    public static void encptLocal(){
        //加密
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();

        textEncryptor.setPassword("bwee");
        String url = "jdbc:mysql://127.0.0.1:3306/bwee?useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false";
        String jdbcUrl = textEncryptor.encrypt(url);
        System.out.println("jdbcUrl:"+jdbcUrl);
        String user = textEncryptor.encrypt("bwee_app");
        System.out.println("user:"+user);
        String passwd = textEncryptor.encrypt("bwee_app*1");
        System.out.println("passwd:"+passwd);
    }
  
    public static void main(String[] args) {  

        EncypterTest.encptLocal();

          
    }

    @Test
    public void testDecrypt() {
        System.out.println(DeEncypterUtils.decrypt("V7jELd2rgEso3xm4qM+UDsep5b1CnE0ihbm66dIk6/NI8maGLGj/UGpCIT01awf3xKWRg9+Ml7ygZNf1ryTpwRluh3PfDVz2MrKGYZvPxKpOKYQqr984Zg=="));
        System.out.println(DeEncypterUtils.decrypt("qxp4P94sSARN48h2GY9p0bzQzjpJZORo"));
        System.out.println(DeEncypterUtils.decrypt("qROGPa4zH5UyWqG+4wOb9aiL31hFtypg"));
    }
}  

