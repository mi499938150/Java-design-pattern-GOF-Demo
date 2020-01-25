package com.geely.design.pattern.structural.proxy.db;

public class DataSourceContextHolder {

    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<String>();

    public static void setBDType(String dbType){
        CONTEXT_HOLDER.set(dbType);
    }

    public static String getBDType(){
        return (String)CONTEXT_HOLDER.get();
    }

    public static void clearDBType(){
        CONTEXT_HOLDER.remove();
    }

}