public class MorrisInorderTraversal {
    private class TreeNode{

        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(){
             this.val=0;
             this.left=null;
             this.right=null;
        }

        public TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

    public void inOrderTraversal(TreeNode root){
        TreeNode curr=root;
        while(curr!=null){
            if(curr.left==null){
                System.out.println(curr.val);
                curr=curr.right;
            }else{
                TreeNode prev=curr.left;
                while(prev.right!=null && prev.right!=curr){
                    prev=prev.right;
                }
                if(prev.right==null){
                    prev.right=curr;
                    curr=curr.left;
                }else{
                    System.out.println(curr.val);
                    prev.right=null;
                    curr=curr.right;
                }
            }
        }
    }
}
