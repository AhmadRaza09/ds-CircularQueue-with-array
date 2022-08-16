public class Main {
    public static void main(String[] args) throws Exception {
        CircularQueue circularQueue = new CircularQueue(5);

        System.out.println("--------------------- Enqueue");
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.enqueue(4);
        circularQueue.enqueue(5);

        System.out.println("----------------------Dequeue");
        int result = circularQueue.dequeue();
        System.out.println(result);
        result = circularQueue.dequeue();
        System.out.println(result);
        result = circularQueue.dequeue();
        System.out.println(result);
        result = circularQueue.dequeue();
        System.out.println(result);
        result = circularQueue.dequeue();
        System.out.println(result);

        System.out.println("--------------------- Enqueue Again");
        circularQueue.enqueue(6);
        circularQueue.enqueue(7);
        circularQueue.enqueue(8);
        circularQueue.enqueue(9);
        circularQueue.enqueue(10);

        System.out.println("----------------------Dequeue Again");
        result = circularQueue.dequeue();
        System.out.println(result);

        result = circularQueue.dequeue();
        System.out.println(result);

        circularQueue.enqueue(11);

        circularQueue.enqueue(12);


        result = circularQueue.dequeue();
        System.out.println(result);

        result = circularQueue.dequeue();
        System.out.println(result);

        result = circularQueue.dequeue();
        System.out.println(result);

        result = circularQueue.dequeue();
        System.out.println(result);

        result = circularQueue.dequeue();
        System.out.println(result);

        result = circularQueue.dequeue();
        System.out.println(result);

    }
}