public class Main {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);

        boolean result = circularQueue.isEmpty();

        System.out.println(result);
    }
}