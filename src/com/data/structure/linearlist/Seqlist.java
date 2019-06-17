package com.data.structure.linearlist;

/**
 * @author lyf
 * @description 顺序表
 * @date 2019/3/15 20:33
 */
public class Seqlist<T> implements MyList<T> {

    // 给一个默认的size
    private final int defaultSize = 10;

    // 最大长度
    private int maxSize;

    // 当前长度
    private int size;

    // 数组
    T[] listArray;

    // 默认构造方法
    public Seqlist() {
        init(defaultSize);
    }

    // 构造方法设置最大长度
    public Seqlist(int size) {
        // 初始化顺序表
        init(size);
    }

    private void init(int size) {
        maxSize = size;
        this.size = 0;
        listArray = (T[]) new Object[size];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void insert(int index, T obj) throws Exception {
        if (size == maxSize) {
            throw new Exception("顺序表已满");
        }
        if (index <= maxSize-1 && index >= 0 ) {
            for (int i = size-1; i >= index; i--) {
                listArray[i+1] = listArray[i];
            }
            listArray[index] = obj;
            size++;
        } else {
            throw new Exception("下标越界");
        }
    }

    @Override
    public void delete (int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("下标越界");
        }
        for (int i = index; i < size-1; i++) {
            listArray[i] = listArray[i+1];
        }
        size--;
    }

    @Override
    public T get(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("下标越界");
        }
        return listArray[index];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
// 测试类
class Test {
    public static void main(String[] args) throws Exception {
        Seqlist<String> seqlist = new Seqlist<>(5);
        seqlist.insert(0 , "L");
        seqlist.insert(1, "O");
        seqlist.insert(2, "V");
        seqlist.insert(3, "E");
        for (int i = 0; i < seqlist.size(); i++) {
            System.out.print( seqlist.get(i));
        }
        seqlist.insert(2, "U");
        for (int i = 0; i < seqlist.size(); i++) {
            System.out.print( seqlist.get(i));
        }
        seqlist.delete(2);
        for (int i = 0; i < seqlist.size(); i++) {
            System.out.print( seqlist.get(i));
        }
    }
}