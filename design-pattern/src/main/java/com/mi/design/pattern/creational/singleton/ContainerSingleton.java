package com.geely.design.pattern.creational.singleton;







import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器单列
 * 共享单例
 * hashMap 线程不安全
 * hashtable 安全 同步锁 影响性能
 */
public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String,Object> singletonMap = new HashMap<String, Object>();

    public static void putInstance(String key,Object instance){
        if(StringUtils.isNotBlank(key) && instance != null){
            if (!singletonMap.containsKey(key)){
                singletonMap.put(key,instance);
            }
        }
    }

    public static  Object getInstance(String key){
        return singletonMap.get(key);
    }
}