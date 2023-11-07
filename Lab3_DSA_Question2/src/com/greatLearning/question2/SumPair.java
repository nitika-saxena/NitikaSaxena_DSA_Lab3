package com.greatLearning.question2;

import java.util.HashSet;
import java.util.Set;

public class SumPair {
	
	public void checkPair(TreeNode root, int sum) {
		Set<Integer> set = new HashSet<>();
		if(!isPairPresent(root, sum, set)) {
			System.out.println("Nodes are not Found");
			
		}
		
	}
	
	private boolean isPairPresent(TreeNode root, int sum, Set<Integer> set) {
		if(root == null) {
			return false;
		}
		if(isPairPresent(root.left, sum, set)) {
			return true;
		}
		if(set.contains(sum - root.data)) {
			System.out.println("Pair is (" + root.data + "," +(sum - root.data)+")");
			return true;
		}else {
			set.add(root.data);
		}
		return isPairPresent(root.right, sum, set);
		
	}

}
