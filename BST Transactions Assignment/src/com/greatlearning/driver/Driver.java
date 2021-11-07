package com.greatlearning.driver;

import com.greatlearning.transactionsoperation.TransactionOpers;
import com.greatlearning.transactionsoperation.TransactionOpers.Node;


public class Driver {

	public static void main (String[] args)
	{
		TransactionOpers opn = new TransactionOpers();
		Node root = new Node(50);
		Node node1 = new Node(30);
		Node node2 = new Node(60);
		Node node3 = new Node(10);
		Node node4 = new Node(40);
		
		
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		
		opn.BstToSkew(root);
		opn.traverseRightSkewed(opn.nextNode);
	}
}