""""// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
"""
# Morris Inorder Traversal-
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def isValidBST(self, root):
        self.inorder(root)
        return True

    def inorder(self, root):
        curr = TreeNode(root)
        while curr != None:
            if curr.left == None:
                print(curr.val)
                curr = curr.right
            else:
                pre = TreeNode(curr.left)
                while pre.right != None and pre.right != curr:
                    pre = pre.right
                if pre.right == None:
                    pre.right = curr
                    curr = curr.left
                else:
                    print(curr.val)
                    pre.right = None
                    curr = curr.right
