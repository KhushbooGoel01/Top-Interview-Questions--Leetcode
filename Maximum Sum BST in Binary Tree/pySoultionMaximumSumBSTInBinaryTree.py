class Solution:
    def maxSumBST(self, root: TreeNode) -> int:
        self.MAX = 0
        self.mbst(root)
        return self.MAX

    def mbst(self, root):
        if not root: return (True, 0, float('-inf'), float('inf'))
        lv, ls, ll, lr = self.mbst(root.left)
        rv, rs, rl, rr = self.mbst(root.right)
        isBst = lv and rv and ll < root.val < rr
        sBst = (ls+rs+root.val) 
        if isBst: 
            self.MAX = max(self.MAX, sBst)
        return (isBst, sBst, max(rl, root.val), min(lr, root.val))
