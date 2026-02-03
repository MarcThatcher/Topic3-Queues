import javax.naming.PartialResultException;

public class CAQ<T> implements Queue<T>{
    private T[] array;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    /*
        Constructor CAQ
     */
    public CAQ(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.rear = -1;
        this.front = 0;
        this.array = (T[]) new Object[capacity];
    }

    @Override
    public void enqueue(T item) {
        if (size>=capacity) {
            System.out.println("Queue full!");
            return ;
        }

        rear = (rear+1) % capacity;
        array[rear] = item;
        size++;
    }

    @Override
    public T dequeue() {
        if (rear==-1){
            throw new IllegalStateException("Queue underflow");
        }

        T item = array[front];
        //array[front] = null;
        front = (front+1) % capacity;
        size--;
        return item;
    }

    @Override
    public T front() {
        return array[front];
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }
}
