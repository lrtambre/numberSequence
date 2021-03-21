package com.test;

import java.util.ArrayList;


/**
 * REQUIREMENT: 
 * By starting from the number 1 and repeatedly either adding 5 or multiplying
 * by 3, an infinite set of numbers can be produced. How would you write a
 * function that, given a number, tries to find a sequence of such additions and
 * multiplications that produces that number?
 * @author lalitha
 *
 */
public class NumberSequence {

	Node root;
	
	public static final String NO_SEQUENCE = "NO SEQUENCE";
	
	public NumberSequence(Integer n) {
		this.populate(n);
	}
	
	/**
	 * Build the tree starting with root node with data=1
	 * @param n
	 * @return
	 */
	public Node populate(int n) {
		 root = new Node(1);
	     return populateTree(n, root);
	}
	
	/**
	 * Recursively build the tree by either multiplying by 3
	 * or adding by 5 until the number is reached
	 * @param number
	 * @param currentNode
	 * @return
	 */
	public Node populateTree(int number, Node currentNode){
		int value = currentNode.getData();
		
		if(value*3 <= number){
			currentNode.setLeftNode(new Node(value*3));
			currentNode.setLeftNode(populateTree(number,currentNode.getLeftNode()));
		}
		if(value+5 <= number){
			currentNode.setRightNode(new Node(value+5));
			currentNode.setRightNode(populateTree(number,currentNode.getRightNode()));
		}
		return currentNode;
	}
	
	/**
	 * Print the sequence used to reach the number
	 * @param currentNode
	 * @param x
	 * @return
	 */
	public String printSequence(Node currentNode, int number) {
		String sequence = "";
        
		//Store the sequence as an ArrayList
        ArrayList<Integer> sequenceList = new ArrayList<>(); 
      
        // Print sequence if required node with 'number' is present  
        if (isPresent(root, sequenceList, number))  
        {  
            for (int i=0; i<sequenceList.size()-1; i++)      
            	sequence += (sequenceList.get(i)+"->"); 
        	sequence += sequenceList.get(sequenceList.size() - 1);     
        }  
        
        //return NO_SEQUENCE when 'number' is not present in the binary tree   
        else
        	sequence = NO_SEQUENCE;
        return sequence;
	}
	
	/**
	 * Print sequence if required node with 'number' is present  
	 * @param root
	 * @param sequenceList
	 * @param number
	 * @return
	 */
	public static boolean isPresent(Node root, ArrayList<Integer> sequenceList, int number) {
		
		//Sequence not possible when Root node is null
		if (root == null)
			return false;

		// push the node's value in sequenceList
		sequenceList.add(root.getData());

		// return if the current node matches the number
		if (root.getData() == number)
			return true;

		// check if required node is present 
		// in the left or right subtree of the current node
		if (isPresent(root.getLeftNode(), sequenceList, number) || 
				isPresent(root.getRightNode(), sequenceList, number))
			return true;

		// Remove the current node's value from sequenceList 
		// as it's not present in both left and right sub tree
		// and return false
		sequenceList.remove(sequenceList.size() - 1);
		return false;
	}
	  
	public static void main(String[] args) {
		int number = 81;
		
		NumberSequence tree = new NumberSequence(number);
		String sequence = tree.printSequence(tree.root, number);
	       
		System.out.println("Sequence to reach number "+number+" :: "+sequence);
		
	}

}
