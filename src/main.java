void main() {
    CAQ<Integer> queue = new CAQ<>(2);

    queue.enqueue(3);
    queue.enqueue(5);
    queue.dequeue();
    queue.enqueue(7);

    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
}