package com.geely.design.pattern.structural.proxy.staticproxy;

import com.geely.design.pattern.structural.proxy.IOrderService;
import com.geely.design.pattern.structural.proxy.Order;
import com.geely.design.pattern.structural.proxy.OrderServiceImpl;
import com.geely.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * 增强
 */
public class OrderServiceStaticProxy {

    private IOrderService iOrderService;

    public int saveOrder(Order order){
        //符合代理模式的意义
        beformeMethod(order);
        iOrderService = new OrderServiceImpl();
        //换成增强要单独出来
        int result = iOrderService.saveOrder(order);
        aftermeMethod();
        return result;
    }

    private void beformeMethod(Order order){
        int userId = order.getUserId();
        int dbRouter = userId%2;
        System.out.println("静态代理分配到[db"+dbRouter+"] 处理数据" );

        //todo 设置dataSource
        DataSourceContextHolder.setBDType("db"+String.valueOf(dbRouter));
        System.out.println("静态代理 before code");
    }

    private void aftermeMethod(){
        System.out.println("静态代理 after code");
    }
}