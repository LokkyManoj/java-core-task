package com.chainsys.workout;

import java.util.LinkedList;
import java.util.Queue;

public class Queuehkjhj {

	public static void main(String[] args) 
	{
		Queue<String> queue=new LinkedList<>();  
queue.add("manoj");  
queue.add("vikram");  
queue.add("lingham");  
queue.add("hemanth");  
queue.add("rahul");  
System.out.println("head:"+queue.element());  
System.out.println("peek:"+queue.peek()); 
System.out.println("poll:"+queue.poll());
System.out.println("remove:"+queue.remove("manoj"));
	}

}
