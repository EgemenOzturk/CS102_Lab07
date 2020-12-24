public class SimpleQueue
{
    SimpleLinkedList queue;

    public SimpleQueue () {
        queue = new SimpleLinkedList();
    }

    public void enqueue( String data ) {
        queue.addToTail(data);
    }

    public String dequeue() {
        return  queue.removeFromHead();
    }

    public Boolean isEmpty () {
        return queue.isEmpty();
    }
}