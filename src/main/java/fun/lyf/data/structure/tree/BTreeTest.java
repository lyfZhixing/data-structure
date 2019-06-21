package fun.lyf.data.structure.tree;

import org.junit.jupiter.api.Test;

/**
 * @author lyf
 * @Description
 * @date 2019-06-21 9:27
 * @modified by
 */
public class BTreeTest {

    // 创建一个二叉树
    Node node4 = new Node(4, null, null);
    Node node3 = new Node(3, null, null);
    Node node2 = new Node(2, null, node4);
    Node node1 = new Node(1, node3, null);
    Node node0 = new Node(0, node1, node2);
    LinkedBinaryTree bTree = new LinkedBinaryTree(node0);

    @Test
    public void testSize() {
        System.out.println(bTree.size());
    }

    @Test
    public void testHeight() {
        System.out.println(bTree.getHeight());
    }

    @Test
    public void testFind() {
        System.out.println(bTree.findKey(2));
    }
}
