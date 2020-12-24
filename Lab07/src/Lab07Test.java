public class Lab07Test {

    public static void main(String[] args) {

        SimpleLinkedList listTesting= new SimpleLinkedList();
        SimpleQueue queueTesting= new SimpleQueue();
        SimpleStackWithQueue queueTesting2= new SimpleStackWithQueue();


        listTesting.addToHead("1");
        listTesting.addToHead("2");
        listTesting.addToHead("3");
        listTesting.addToHead("4");
        listTesting.addToHead("5");

        System.out.println("Testing..");
        System.out.println(listTesting);
        listTesting.addAnywhere("X",3);
        System.out.println(" 'X' is added in index'3'..");
        System.out.println(listTesting);

        System.out.println(" 3rd index is printed.. ");
        System.out.println(listTesting.get(3));
        listTesting.removeFromHead();
        System.out.println(" First object is removed..");
        System.out.println(listTesting);
        listTesting.addToTail("Y");
        System.out.println(" 'Y' is added to the Tail..");
        System.out.println(listTesting);

        System.out.println("----------QUEUE PART----------");
        System.out.println("Enqueue CS Classes 'CS101', 'CS102', 'CS201', 'CS202' ");
        queueTesting.enqueue("CS101");
        queueTesting.enqueue("cs102");
        queueTesting.enqueue("cs201");
        queueTesting.enqueue("cs202");
        System.out.println(queueTesting);
        System.out.println("Dequeue the CS Queue");
        System.out.println(queueTesting.dequeue());

        System.out.println("Push, Pop and toString Methods are shown ");
        queueTesting2.push("Egemen");
        queueTesting2.push("Osman");
        queueTesting2.push("Öztürk");
        System.out.println(queueTesting2.pop());
        System.out.println(queueTesting2.pop());
        System.out.println(queueTesting2.toString());
        System.out.println(queueTesting2.pop());
    }
}
