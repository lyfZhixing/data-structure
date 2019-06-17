package com.data.structure.linearlist;

/**
 * @author lyf
 * @description 链表
 * @date 2019/3/24 13:42
 */
public class LinkedList implements MyList {

    private int size;
    private Node node;

    // 链表节点
    class Node{
        // 数据
        private int data;
        // 指向下一节点
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }



    @Override
    public int size() {
        return 0;
    }

    @Override
    public void insert(int index, Object obj) throws Exception {

    }

    @Override
    public void delete(int index) throws Exception {

    }

    @Override
    public Object get(int index) throws Exception {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
