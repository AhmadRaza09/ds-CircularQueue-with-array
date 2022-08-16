public class Main {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);

        boolean result = circularQueue.isFull();

        System.out.println(result);
    }
}