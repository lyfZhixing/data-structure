package fun.lyf.data.structure.tree;

/**
 * @author lyf
 * @Description 二叉树的结点
 * @date 2019-06-20 17:02
 * @modified by
 */
public class Node {

    // 结点值
    Object data;

    // 左子树
    Node leftChild;

    // 右子树
    Node rightChild;

    public Node(Object data) {
        this.data = data;
    }

    public Node(Object data, Node leftChild, Node rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public String toString() {
        return "Node[ root: " + data + ", left: " + leftChild +", right: " + rightChild + "]";
    }
}
