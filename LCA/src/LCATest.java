import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class LCATest {

	@Test
	public void test() {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
  
        Assert.assertEquals("lca of 4 and 5", tree.findLCA(4, 5), 2);
        Assert.assertEquals("LCA(4, 6): " , tree.findLCA(4,6),1); 
        Assert.assertEquals("LCA(3, 4): ", tree.findLCA(3,4), 1); 
        Assert.assertEquals("LCA(2, 4): ", tree.findLCA(2,4),2); 
        
	}
	
	@Test
	public void testEmptyTree()
	{
		BinaryTree tree = new BinaryTree();
		Assert.assertEquals("LCA(0,1) ", -1 , tree.findLCA(0, 1));
	}
	
	@Test
	public void testNonExistingNodes()
	{
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7);
        
        Assert.assertEquals("LCA(1,0), 0 missing ", -1, tree.findLCA(1, 0));
        Assert.assertEquals("LCA(8,0), both missing ", -1, tree.findLCA(8, 0));
        
        
	}
	
	

}
