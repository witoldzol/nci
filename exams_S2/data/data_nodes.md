----------------------------------------
Example interface
------------------------------

public interface Example{

	public void enqueue();
	public void dequeue();
	public int size();
	public boolean isEmpty();

}

------------------------------
Describe recursion elements
------------------------------
Each recursion needs these two:
	1. base case :
	RETURNS a value without making any more recursive calls. Basically stops further recursive calls.

	2. recursive step: apply logic to output from previous call ( for example on each call decrease the value of
									variable by 1)

------------------------------
Recursion example
------------------------------

Calculate factorial

public class Factorial(){

	int result = 1;

	public int calculateFactorial(int n){

		//base case
		if(n == 1){
			return result;
		} else {
			//recursive step
			result = result * n;
			//call itself
			return calculateFactorial(n-1);
		}
	}
}

Explanation: in order to get factorial we need to multiply number until we reach the base condition ( 1 )
	     with each subsequent call, we reduce the number passed in by 1
	     ultimately we reach the base condition and return the result

------------------------------
Trees Definitions
------------------------------

Root: top node
Internal node: node with at least one child
External node ( LEAF ): node without child
Depth of node: how many LINES (edges) from root to node !?
Seize of tree: number of nodes
Path: can only go downwards (so leaf has height of 0)
Height of node: how many edges from node to LEAF (find longest path)
Binary tree: has a root and two sub-trees (left and right)
Root is the only element without a parent
Degree of node is: how many children element has (DEGREE = HOW MANY CHILDREN)
	In binary tree: each node has degree of 2!
HEIGHT of Tree: calculate with LEVEL 0 !!! ( this way you cna't fuck up) --

---------- Binary Tree ----------
Full binary tree: either 0 or 2 children (no halfsies )
Binary Search Tree ( values lower go left, higher to right)
Complete tree: every level is full (except last one) - doesn't have to be balanced
Balanced tree: each subtree has the same height +- one level

---------- SLL vs DLL ----------
Compare inserting process:

	Single Linked List:
	       -if inserting as a first element: change reference to head, allocate reference to previous head
	       -


	Double Linked List:
	       -if first item: refrence as head, link previous head and link back from previous head to new head
	       

	