package com.geely.design.pattern.structural.proxy.dynamicproxy;

import com.geely.design.pattern.structural.proxy.Order;
import com.geely.design.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class OrderServiceDynamicProxy  implements InvocationHandler {

    //1.声明目标对象
    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    //2.绑定
    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);

    }

    //3. 前置通知
    private void beforceMethod(Object obj){
        int userId = 0;
        System.out.println("动态代理 before core");
        if (obj instanceof Order){
            Order order = (Order) obj;
            userId = order.getUserId();
            int dbRouter = userId%2;
            System.out.println("动态代理分配到[db"+dbRouter+"] 处理数据" );

            //todo 设置dataSource
            DataSourceContextHolder.setBDType("db"+String.valueOf(dbRouter));
        }
    }

    //4. 后置通知
    private void aftermeMethod(){
        System.out.println("动态代理 after code");
    }

    // 主要的
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforceMethod(argObject);
        //要被增强的方法
        Object object = method.invoke(target,args);

        return object;
    }


}