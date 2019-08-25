package com.design.principle.openclose;

/**
 * @ClassName JavaCourse
 * @Author chenchen
 * @Date 2019/8/10 18:25
 * @Version 1.0
 **/
public class JavaCourse implements ICourse {
    private Integer Id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        Id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
