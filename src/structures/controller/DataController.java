package structures.controller;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import structures.model.Customer;
import structures.model.Dish;

public class DataController
{
	private Queue<Customer> customerQueue;
	private Stack<Dish> dishes;
	
	public void start()
	{
		fillQueue();
		removeQueue();
		
		fillStack();
		removeStack();
		
	}

	private void removeStack()
	{
		
	}

	private void fillStack()
	{
		dishes.push(new Dish(true, green, 7));
	}

	private void removeQueue()
	{
		customerQueue.remove();
		customerQueue.remove();
		customerQueue.remove();
	}

	private void fillQueue()
	{
		customerQueue = new LinkedList<Customer>();
		customerQueue.add(new Customer(true, "Rick", 11.78));
		customerQueue.add(new Customer(true, "Sally", 20.00));
		customerQueue.add(new Customer(false, "Tim", 0.00));
		customerQueue.add(new Customer(true, "Bill", 45.71));
		customerQueue.add(new Customer(false, "Rose", 1.78));
		customerQueue.add(new Customer(false, "Ashley", 32.01));
		customerQueue.add(new Customer(true, "Codie", 101.55));
		
		System.out.println(customerQueue);
	}
}
