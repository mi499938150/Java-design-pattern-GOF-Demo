package com.geely.design.pattern.structural.proxy;

public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;


    public int saveOrder(Order order) {
       iOrderDao = new OrderDaoImpl();
       System.out.println("service 层调用Dao层");

       return iOrderDao.insert(order);
    }
}