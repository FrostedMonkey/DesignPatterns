package com.design.principle.openclose;

/**
 * @ClassName javaDiscountCourse
 * @Author chenchen
 * @Date 2019/8/10 18:34
 * @Version 1.0
 **/
public class javaDiscountCourse extends JavaCourse {
    public javaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }
    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
