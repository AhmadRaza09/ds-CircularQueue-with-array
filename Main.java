public class Main {
    public static void main(String[] args) throws Exception {
        CircularQueue circularQueue = new CircularQueue(5);

        System.out.println("--------------------- Enqueue");
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.enqueue(4);
        circularQueue.enqueue(5);
        circularQueue.enqueue(6);
    }
}