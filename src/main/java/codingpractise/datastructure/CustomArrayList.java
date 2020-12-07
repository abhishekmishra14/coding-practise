package codingpractise.datastructure;

import java.util.Arrays;

public class CustomArrayList<E> {

	private int size;

	private int modCount = 0;

	private Object[] elementdata;

	private Object[] EMPTY_ELEMENTDATA = {};

	private Object[] DEFAULT_EMPTY_ELEMENTDATA = {};

	private static final int DEFAULT_CAPACITY = 10;

	public CustomArrayList() {
		this.elementdata = DEFAULT_EMPTY_ELEMENTDATA;
	}

	public CustomArrayList(int capacity) {
		if (capacity > 0) {
			this.elementdata = new Object[capacity];
		} else if (capacity == 0) {
			this.elementdata = EMPTY_ELEMENTDATA;
		} else {
			throw new IllegalArgumentException("Illegal capacity");
		}
	}

	public boolean add(E e) {
		modCount++;
		add(e, elementdata, size);
		return true;
	}

	private void add(E e, Object[] elementdata, int s) {
		if (s == elementdata.length)
			elementdata = grow();
		elementdata[s] = e;
		size = s + 1;
	}

	private Object[] grow() {
		return grow(size + 1);
	}

	private Object[] grow(int minCapacity) {
		return elementdata = Arrays.copyOf(elementdata, newCapacity(minCapacity));
	}

	private int newCapacity(int minCapacity) {
		int oldCapacity = elementdata.length;
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		return (newCapacity - Integer.MAX_VALUE <= 0) ? newCapacity : Integer.MAX_VALUE;

	}

	public void add(E e, int index) {
		if (elementdata.length < index) {
			throw new IllegalArgumentException("Out of bound exception");
		}
	}

	public int size() {
		return 0;
	}

	public void remove(int index) {

	}

	public void iterate() {

	}

	public static void main(String[] args) {

	}

}
