package binarytree;
/**
 * 二叉树的下一个结点
 * @author MFS
 * 题目：
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 *
 */
public class GetNext {
	public TreeLinkNode getNext(TreeLinkNode node)
    {
		if(node==null)return null;
		//如果有右子树，则找右子树的最左节点
        if(node.right!=null)
        {
            node=node.right;
            while(node.left!=null)
            {
                node=node.left;
               
            }return node;
        }
      //没右子树，从父节点中找，找第一个当前节点是父节点左孩子的节点（撇 的结构）
        while(node.next!=null)
        {
            if(node.next.left==node)return node.next;
            node=node.next;
        }
        return null;
    }
}
