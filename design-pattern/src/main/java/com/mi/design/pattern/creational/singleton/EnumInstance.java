package com.geely.design.pattern.creational.singleton;

/**
 * 枚举生成单例
 * 关注枚举的序列化和反序列化的攻击
 */
public enum EnumInstance {

    INSTANCE{
        protected void printTest(){
            System.out.println("imi print test");
        }
    };

    /**能让外部调用*/
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
