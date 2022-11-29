// Time Complexity : O(n)
// Space Complexity : O(h)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach :
/*
 * The idea is to not use a Stack or recursion to perform inorder traversal.
 * 2 - We use predecessor/sucessor pairs to traverse the entire tree.
 */
public class MorrisTraversal {
    public boolean isValidBST(TreeNode root) {
        // if(root == null)
        // {
        //     return false;
        // }
        
        inorder(root);
        return true;
    }
    
    public void inorder(TreeNode root)
    {
        TreeNode curr = root;
        while(curr != null)
        {
            if(curr.left == null)
            {
                System.out.println(curr.val);
                curr = curr.right;
            }
            
            else
            {
                TreeNode pre = curr.left;
                while(pre.right != null && pre.right != curr)
                {
                    pre = pre.right;
                }
                if(pre.right == null)
                {
                    pre.right = curr;
                    curr = curr.left;
                }
                else
                {
                    System.out.println(curr.val);
                    pre.right = null;
                    curr = curr.right;
                }
            }
        }
    }
}
