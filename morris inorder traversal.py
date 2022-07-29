#TC: O(n) in average case as we TC is constant for all the leaf nodes and so on...
#SC: O(1)
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):

    def isValidBST(self, root):

        def inorder(root):
            curr=root
            while(curr!=None):
                if curr.left==None:
                    print(curr.val)
                    curr=curr.right
                else:
                    pre=curr.left
                    while(pre.right!=None and pre.right!=curr):
                        pre=pre.right
                    if pre.right==None:
                        pre.right=curr
                        curr=curr.left
                    else:
                        print(curr.val)
                        pre.right=None
                        curr=curr.right
                        
        inorder(root)
        return True
        
                
        
        
        
            
        
        