package src.com.data.structure.linearlist;

/**
 * @author lyf
 * @description 链表
 * @date 2019/3/24 13:42
 */
public class SingleLinkedList implements MyList {

    private int size;
    private Node head = new Node();

    @Override
    public int size() {
        return size;
    }

    @Override
    public void insert(int index, Object obj) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("下表越界");
        }
        // 找到前一个结点
        Node first = head;
        for (int i=0; i < index; i++) {
            first = first.next;
        }
        // 创建一个新的节点
        Node newNode = new Node(obj);
        newNode.next = first.next;
        first.next = newNode;
        size++;


    }

    public void add(Object obj) throws Exception {
        this.insert(size, obj);
    }

    @Override
    public void delete(int index) throws Exception {

    }

    @Override
    public Object get(int index) throws Exception {
        Node p = head;
        for (int i=0; i <= index; i++) {
            p = p.next;
        }
        return p.data;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public String toString() {
        String str = "";
        Node p = head;
        for (int i=0; i < size; i++ ) {
            p = p.next;
            str = str + p.data.toString() + ";";
        }
        return str;
    }

}

// 链表节点
class Node{
    // 数据
    Object data;
    // 指向下一节点
    Node next;

    public Node() {}

    public Node(Object data) {
        this.data = data;
    }
}

// 测试类
class SingleLinkedListTest {
    public static void main(String[] args) throws Exception {
        SingleLinkedList list = new SingleLinkedList();
        // list.insert(0, 1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.insert(0,0);
        System.out.println(list.toString());
    }
}
