package com.geely.design.pattern.creational.factorymethod.simplefactory;

/**
 * 简单工厂
 * 1.定义一个抽象父类
 * 2.用子类继承
 * 3.在用工厂类来实现
 *
 * 可以通过反射弥补拓展
 *
 */
public class VideoFactory {

    public Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        }catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
     return video;
    }


//    public Video getVideo(String type){
//        if ("java".equalsIgnoreCase(type)){
//            return new JavaVideo();
//        }else if ("paython".equalsIgnoreCase(type)){
//            return new PaythonVideo();
//        }
//        return null;
//    }
}