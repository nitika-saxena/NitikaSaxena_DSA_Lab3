package com.greatLearning.question1;

import java.util.Stack;

public class BracketBalancing {
	
	public  boolean isBalancedBracket(String input)
	{
		Stack<Character> stack = new Stack<Character>();
		for (char ch : input.toCharArray()) {
			if (ch ==  '{'|| ch == '(' || ch == '[') {
				stack.push(ch);
				continue;
			}

			if(stack.isEmpty()) { 
				return false;
			}
			switch (ch) {
			case '}':
				if(stack.pop() != '{') {
					
					return false;
				}
				break;
			case ']':
				if(stack.pop() != '[') {
					return false;
				}
				break;	
			case ')':
				if(stack.pop() != '(') {
					return false;
				}
				break;	
			default:	
				return false;
			}
		}				
		return (stack.isEmpty());
	}


}
