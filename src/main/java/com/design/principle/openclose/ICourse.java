package com.design.principle.openclose;

/**
 * @ClassName ICourse
 * @Author chenchen
 * @Date 2019/8/10 18:24
 * @Version 1.0
 **/
public interface ICourse {
    Integer getId();
    String getName();
    Double getPrice();
    /**
     * 接口是一种契约，不应该经常改变
     */
}
