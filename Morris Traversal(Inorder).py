# time complexity is o(n), where n is the number of nodes in the input
# space complexity is o(1)
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool: 
        self.inorderTraveral(root)
        return True
    
    def inorderTraveral(self, root):
        curr = root
        while(curr != None):
            if(curr.left == None):
                print(curr.val)
                curr = curr.right
            else:
                pre = curr.left
                while(pre.right != None and pre.right != curr):
                    pre = pre.right
                if(pre.right == None):
                    pre.right = curr
                    curr = curr.left
                else:
                    pre.right = None
                    print(curr.val)
                    curr = curr.right