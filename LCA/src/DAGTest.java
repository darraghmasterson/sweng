import org.junit.Assert;
import org.junit.Test;

public class DAGTest {

	@Test
	public void testIfDAG()
	{
		DAG dag = new DAG(10);
		dag.addEdge(1, 2);
		dag.addEdge(2, 3);
		Assert.assertEquals( dag.isDAG(), true);
		
		dag.addEdge(2, 1);
		Assert.assertEquals( dag.isDAG(), false);
	}
	
	@Test
	public void testLCA()
	{
		DAG dag = new DAG(10);
		dag.addEdge(1, 2);
		dag.addEdge(2, 3);
		dag.addEdge(2, 4);
		
		Assert.assertEquals(2, dag.lca(3,4));
		
		dag.addEdge(3, 5);
		
		Assert.assertEquals(2, dag.lca(3,5));
		
		dag.addEdge(1, 6);
		Assert.assertEquals(1, dag.lca(5,6));
		
		
		
	}

}
