public class CircularArrayQueue<T> implements Queue<T> {
    private T[] array;
    private int front;
    private int rear;
    private int capacity;
    private int size;
    
    /**
     * Initializes a circular array queue with the specified capacity.
     * @param capacity
     */
    @SuppressWarnings("unchecked")
    public CircularArrayQueue(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    
    /**
     * Adds an item to the back of the queue.
     * @param item
     */
    public void enqueue(T item) {
        if (size >= capacity) {
            throw new IllegalStateException("Queue overflow");
        }
        rear = (rear + 1) % capacity;
        array[rear] = item;
        size++;
    }
    
    /**
     * Removes and returns the item at the front of the queue.
     * @return the item at the front of the queue
     */
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue underflow");
        }
        T item = array[front];
        array[front] = null; // Help GC
        front = (front + 1) % capacity;
        size--;
        return item;
    }
    
    /**
     * Returns the item at the front of the queue without removing it.
     * @return the item at the front of the queue
     */
    public T front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return array[front];
    }
    
    /**
     * Checks if the queue is empty.
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the number of items in the queue.
     * @return the number of items in the queue
     */
    public int size() {
        return size;
    }
}

