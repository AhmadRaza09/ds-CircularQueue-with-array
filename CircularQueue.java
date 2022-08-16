public class CircularQueue {
    private int[] arr;
    private int topOfQueue;
    private int beginningOfQueue;

    public CircularQueue(int size) {
        arr = new int[size];
        topOfQueue = -1;
        beginningOfQueue = -1;
        System.out.println("Crated queue object");
    }

}