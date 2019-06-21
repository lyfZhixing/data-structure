package fun.lyf.data.structure.tree;

/**
 * @description 实现类可以实现不同的存储结构，顺序或链式
 * @author lyf
 * @date 2019/6/20 16:58
 */
public interface BinaryTree {

    /**
     * @description 是否空树
     * @date 2019/6/20 17:00
     * @return boolean
     */
    boolean isEmpty();

    /**
     * @description 结点数量
     * @date 2019/6/20 17:00
     * @return int
     */
    int size();

    /**
     * @description 树的高度
     * @date 2019/6/20 17:01
     * @return int
     */
    int getHeight();

    /**
     * @description 根据数据查找结点
     * @author lyf
     * @date 2019/6/20 17:41
     * @return fun.lyf.data.structure.tree.Node
     */
    Node findKey(Object data);

    /**
     * @description 前序递归遍历
     * @author lyf
     * @date 2019/6/21 9:05
     * @return void
     */
    void preOrderTraverse();

    /**
     * @description 中序递归遍历
     * @author lyf
     * @date 2019/6/21 9:06
     * @return void
     */
    void midOrderTraverse();

    /**
     * @description 后序递归遍历
     * @author lyf
     * @date 2019/6/21 9:12
     * @return void
     */
    void postOrderTraverse();



}
