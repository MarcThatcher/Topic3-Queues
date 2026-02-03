public interface Queue<T> {
    /**
     * Adds an item to the back of the queue.
     * @param item
     */
    void enqueue(T item);
    /**
     * Removes and returns the item at the front of the queue.
     * @return
     */
    T dequeue();
    /**
     * Returns the item at the front of the queue without removing it.
     * @return
     */
    T front();
    /**
     * Checks if the queue is empty.
     * @return
     */
    boolean isEmpty();
    /**
     * Returns the number of items in the queue.
     * @return
     */
    int size();
}
