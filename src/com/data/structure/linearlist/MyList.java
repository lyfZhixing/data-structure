package com.data.structure.linearlist;

/**
 * @author lyf
 * @description 线性表接口
 * @date 2019/3/18 20:35
 */
public interface MyList< T > {
    /*线性表操作：
    1. 求元素个数
    2. 插入
    3. 删除
    4. 查找
    5. 判断是否为空*/

    // 获取线性表中的元素个数
    int size();

    // 插入
    void insert(int index, T obj) throws Exception;

    // 删除
    void delete(int index) throws Exception;

    // 查找指定位置的元素
    T get(int index) throws Exception;

    // 判断是否为空
    boolean isEmpty();
}
