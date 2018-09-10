

class TreeNode{
    public int body;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int t)
    {
        body = t;
    }
}

class Tree
{
    // 二叉搜索树的添加
    void add(TreeNode root, TreeNode n1){
        while(true)
        {
            if(root.body >= n1.body)
            {
                if(root.left!=null)
                {
                    root = root.left;
                }
                else
                {
                    root.left = n1;
                    break;
                }
            }
            else
            {
                if(root.right!=null)
                {
                    root = root.right;
                }
                else
                {
                    root.right = n1;
                    break;
                }
            }
        }
    }

    //二叉搜索树的中序遍历
    void print(TreeNode root)
    {
        if (root==null)
            return;
        print(root.left);
        System.out.println(root.body);
        print(root.right);

    }
}

/**
 * Created by rex on 2018/9/10.
 */
public class Basic {
}
