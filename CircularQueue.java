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

    /**
     * This method will tell the queue is Empty or not
     *
     * @return boolean
     */
    public boolean isEmpty() {
        if (beginningOfQueue == -1 && topOfQueue == -1) {
            return true;
        }
        return false;
    }

}