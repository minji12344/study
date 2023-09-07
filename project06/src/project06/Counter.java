package project06;

public class Counter {
	private int count;
	
	public synchronized void increment() {
		count++;
	}
	public synchronized void decrement() {
		count--;
	}
	public void printCount() {
		System.out.println(count);
		synchronized(this) {
			count++;
		}
	}
	
	public synchronized int getCount() {
		return count;
	}
}
