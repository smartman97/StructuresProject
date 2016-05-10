package structures.controller;

import java.awt.Color;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import structures.model.Customer;
import structures.model.Dish;

public class DataController
{
	private Queue<Customer> customerQueue;
	private Stack<Dish> dishes;
	
	public DataController()
	{
		dishes = new Stack<Dish>();
	}
	
	public void start()
	{
		fillQueue();
		System.out.println(customerQueue);
		
		removeQueue();
		System.out.println(customerQueue);
		
		fillStack();
		System.out.println(dishes);
		
		removeStack();
		System.out.println(dishes);
	}

	private void removeStack()
	{
		dishes.pop();
		dishes.pop();
		dishes.pop();
		dishes.pop();
	}

	private void fillStack()
	{
		dishes.push(new Dish(true, Color.GREEN, 7));
		dishes.push(new Dish(true, Color.RED, 3));
		dishes.push(new Dish(false, Color.BLUE, 10));
		dishes.push(new Dish(true, Color.BLACK, 4));
		dishes.push(new Dish(false, Color.YELLOW, 8));
		dishes.push(new Dish(false, Color.CYAN, 2));
		dishes.push(new Dish(true, Color.GRAY, 15));
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
	}
}
