// ThreadsLocks/CountingFixed/src/main/java/com/paulbutcher/Counting.java

class Counter {
	private int count = 0;
	public synchronized void increment() { ++count; }
	public int getCount() { return count; }
}
