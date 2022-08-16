public class CircularQueue {
    private int[] arr;
    private int topOfQueue;
    private int beginningOfQueue;

    //size of the queue
    private int size;

    public CircularQueue(int size) {
        arr = new int[size];
        topOfQueue = -1;
        beginningOfQueue = -1;
        size = 0;
        System.out.println("Crated queue object");
    }

    /**
     * This method will tell the queue is Empty or not
     *
     * @return boolean
     */
    public boolean isEmpty() {
        return size == 0;
    }

}