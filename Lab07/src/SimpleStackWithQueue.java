public class SimpleStackWithQueue {

    SimpleQueue q2,q1;

    public SimpleStackWithQueue () {
        q1 = new SimpleQueue();
        q2 = new SimpleQueue();
    }

    public void push ( String data ) {
        q2.enqueue(data);
        while ( !q1.isEmpty() ) {
            q2.enqueue(q1.dequeue());
        }
        SimpleQueue temp;
        temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public String pop() {
        return q1.dequeue();
    }

    public String toString() {
        return q1.queue.toString();
    }
}