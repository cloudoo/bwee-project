/**
 * @Title: DeEncypterUtils.java
 * @Desription: 对称加密解密
 * @Company CSN
 * @Author Benson
 * @Date 2017-11-20 15:19
 * @Version 0.1
 **/
package com.cloudo.bwee.test;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentStringPBEConfig;

/**
 * @ClassName DeEncypterUtils
 * @Description 对称加密解密
 * @Author benson
 * @Date 2017-11-20 15:19
 */
public class DeEncypterUtils {

    //加密工具
    private static StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
    //加密配置
    public static EnvironmentStringPBEConfig config = new EnvironmentStringPBEConfig();
    static{
        config.setAlgorithm("PBEWithMD5AndDES");
//        config.setPasswordSysPropertyName("ResearchWebsite");
//        config.setPasswordEnvName(null);
        //自己在用的时候更改此密码
        config.setPassword("fr2");
//        config.setPassword("freereport");
//        config.setPassword("root");
        //应用配置
        encryptor.setConfig(config);
    }

    /**
     * @Desription: 加密
     * @Author Benson
     * @Date 2017-11-20 15:28
     * @return
     **/
    public static String encrypt(String decryptString){
        return encryptor.encrypt(decryptString);
    }

    /**
     * @Desription: 解密
     * @Author Benson
     * @Date 2017-11-20 15:31
     * @return
     **/
    public static String decrypt(String source){

        return encryptor.decrypt(source);
    }
}
