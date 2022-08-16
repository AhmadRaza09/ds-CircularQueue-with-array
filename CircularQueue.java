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

    /**
     * This method will the the queue isFull or not
     *
     * @return boolean
     */
    public boolean isFull() {
        return size == arr.length;
    }

    /**
     * This method will add the element in the queue
     *
     * @param value
     * @throws throws exception if queue is full
     */
    public void enqueue(int value) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is Full");
        }

        if (isEmpty()) {
            beginningOfQueue = 0;
        }

        //if topOfQueue point to the last index of the queue then change it to the first index
        if (topOfQueue == arr.length - 1) {
            topOfQueue = -1;
        }
        topOfQueue = topOfQueue + 1;

        //add element in the queue
        arr[topOfQueue] = value;

        //increase the size of the queue
        size = size + 1;
    }

}