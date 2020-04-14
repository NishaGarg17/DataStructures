package com.java.queue.fixedSizeCircularArrayQueue;

public class FixedSizeCircularArrayQueue {
	int front, rear, size;
	int capacity;
	static final int DEFAULT_CAPACITY = 16;
	int[] queue;
	public FixedSizeCircularArrayQueue(int queueCapacity) {
		this.capacity = queueCapacity;
		queue = new int[capacity];
		front = 0;
		rear = 0;
		size = 0;
	}
	
	public FixedSizeCircularArrayQueue() {
		this(DEFAULT_CAPACITY);
	}
	
	// enQueue operation to insert an element in the queue
	public void enQueue(int element) throws RuntimeException{
		if(size == capacity) {
			throw new RuntimeException("Overflow: Queue is full!");
		} else {
			queue[rear] = element;
			size++;
			rear = (rear + 1) % capacity;
		}
	}
	
	// deQueue operation to delete an element from the queue
	public int deQueue() throws RuntimeException {
		if(size == 0) {
			throw new RuntimeException("Underflow: Queue is empty!");
		} else {
			int data = queue[front];
			queue[front] = Integer.MIN_VALUE;
			size--;
			front = (front + 1) % capacity;
			return data;
		}
	}
	
	// to get the front of the queue without deleting it
	public int getFront() throws RuntimeException {
		if(size == 0) {
			throw new RuntimeException("Underflow: Queue is empty!");
		} else {
			return queue[front];
		}
	}
	
	// to get the size of the queue or the number of elements present in the queue
	public int getSize() {
		return size;
	}
	
	// to check if the queue is full
	public boolean isFull() {
		return (size==capacity);
	}
	
	// to check if the queue if empty
	public boolean isEmpty() {
		return (size == 0);
	}
	
	// String representation of the Queue
	public String toString() {
		String result = "[";
		for(int i = 0; i < size; i++) {
			if(i == size - 1) {
				result += queue[(front + i) % capacity];
			} else {
				result += queue[(front + i) % capacity] + ",";
			}	
		}
		result += "]";
		return result;
	}

}
