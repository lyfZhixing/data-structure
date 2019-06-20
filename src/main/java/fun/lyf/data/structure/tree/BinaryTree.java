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

}
