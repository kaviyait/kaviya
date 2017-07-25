import.java.io.*;
import.java.util.*;
public boolean isPalindrome(LinkedListNode head)
	{
		if(head == null)
			return false;
		Stack<Integer> stack = new Stack<Integer>();
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		stack.add(slow.value);
		int i = 0;
		while(f.next != null)
		{
			if(i == 0)
			{
				f = f.next;
				i = 1;
			}
			else if(i == 1)
			{
				slow = slow.next;
				f = f.next;
				stack.add(slow.value);
				i = 0;
			}
		}		
		System.out.println(slow.value);
		if(stack.size() % 2 == 0)
		{
			stack.pop();
		}
		slow = slow.next;
		while(!stack.isEmpty() && slow != null)
		{
			int val = stack.pop();
			if(slow == null ||  val != slow.value)
				return false;
			slow = slow.next;			
		}
		return true;
	}
