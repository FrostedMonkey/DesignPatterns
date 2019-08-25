package com.design.pattern.creational.singleton;

/**
 * @ClassName LazyDoubleCheckSingleton
 * @Author chenchen
 * @Date 2019/8/24 17:16
 * @Version 1.0
 **/
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton=null;
    private LazyDoubleCheckSingleton(){

    }

    public  static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton==null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton==null){
                    lazyDoubleCheckSingleton=new LazyDoubleCheckSingleton();
                    /**
                     * 1、分配内存
                     * 3、设置lazyDoubleCheckSingleton指向刚分配的内存地址。
                     * 2、初始化对象
                     * intra-thread semantics
                     *--------- 3、设置lazyDoubleCheckSingleton指向刚分配的内存地址。
                     *
                     * 重排序问题
                     */
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
