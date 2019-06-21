package fun.lyf.data.structure.tree;

/**
 * @author lyf
 * @Description
 * @date 2019-06-21 9:15
 * @modified by
 */
public class LinkedBinaryTree implements BinaryTree {

    /** 根结点 */
    private Node root;

    public LinkedBinaryTree() {
    }

    public LinkedBinaryTree(Node root) {
        this.root = root;
    }

    /**
     * @return boolean
     * @description 是否空树
     * @date 2019/6/20 17:00
     */
    @Override
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * @return int
     * @description 结点数量
     * @date 2019/6/20 17:00
     */
    @Override
    public int size() {
        return size(root);
    }

    private int size(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftSize = size(root.leftChild);
            int rightSize = size(root.rightChild);
            return leftSize + rightSize + 1;
        }
    }

    /**
     * @return int
     * @description 树的高度
     * @date 2019/6/20 17:01
     */
    @Override
    public int getHeight() {
        return 0;
    }

    /**
     * @param data
     * @return fun.lyf.data.structure.tree.Node
     * @description 根据数据查找结点
     * @author lyf
     * @date 2019/6/20 17:41
     */
    @Override
    public Node findKey(Object data) {
        return null;
    }

    /**
     * @return void
     * @description 前序递归遍历
     * @author lyf
     * @date 2019/6/21 9:05
     */
    @Override
    public void preOrderTraverse() {

    }

    /**
     * @return void
     * @description 中序递归遍历
     * @author lyf
     * @date 2019/6/21 9:06
     */
    @Override
    public void midOrderTraverse() {

    }

    /**
     * @return void
     * @description 后序递归遍历
     * @author lyf
     * @date 2019/6/21 9:12
     */
    @Override
    public void postOrderTraverse() {

    }
}
