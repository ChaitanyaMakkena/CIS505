package com.module4;

import java.util.LinkedList;

/**
 * The GenericQueue class is used to perform 
 * add,remove and size operations for products
 * 
 * @author Chaitanya
 *
 * @param <E>
 */
public class GenericQueue<E> {

	private LinkedList<E> list = new LinkedList<E>();

	/**
	 * Add element at first
	 * @param item
	 */
	public void enqueue(E item) {

		list.addFirst(item);
	}

	/**
	 * remove first element returns
	 * @return
	 */
	public E dequeue() {

		return list.removeFirst();
	}

	/**
	 * 
	 * @return size of the list
	 */
	public int size() {

		return list.size();
	}
}
