// 15 ms, faster than 82.33% 
class BSTIterator {
	Stack<TreeNode> stack;
	public BSTIterator(TreeNode root) {
		stack = new Stack<>();
		TreeNode node = root;
		updateStack(node);                                      // update stack
	}
	public int next() {
		TreeNode toRemove = stack.pop();
		updateStack(toRemove.right);                             // before return node, first update stack further        
		return toRemove.val;
	}
	public boolean hasNext() {
		return !stack.isEmpty();    
	}
	// -------------------
	public void updateStack(TreeNode node){
		while(node != null){
			stack.add(node);
			node = node.left;
		}
	}
}