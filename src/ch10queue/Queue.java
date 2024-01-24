package ch10queue;

import java.util.ArrayList;

public class Queue {
	ArrayList<String> delegate = new ArrayList<>();

	public Queue() {
	}

	public void addRear(String s) {
		delegate.add(s);
	}

	public int getSize() {
		return delegate.size();
	}

	public String removeFront() {
		String result = delegate.get(0);
		delegate.remove(0);
		return result;
	}
}