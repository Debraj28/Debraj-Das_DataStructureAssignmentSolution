package com.greatlearning.transactionsoperation;
import java.io.*;

public class TransactionOpers {
		
		public static class Node {
			int val;
			public Node left;
			public Node right;

			public Node(int item) {
				val = item;
				left = right = null;
			}
		}
		
		public static Node preNode = null;
		public static Node nextNode = null;

		public void BstToSkew(Node root) {

			if (root == null)
				return;

			BstToSkew(root.left);

			Node rightNode = root.right;

			if (nextNode == null) {
				nextNode = root;
				root.left = null;
				preNode = root;
			} else {
				preNode.right = root;
				root.left = null;
				preNode = root;
			}
			BstToSkew(rightNode);  
		}

		public void traverseRightSkewed(Node root) {
			if (root == null)
				return;

			System.out.print(root.val + " ");
			traverseRightSkewed(root.right);
		}
	}

