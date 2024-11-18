package Week5.Assignment1.Task2;

class SumTask extends Thread {
    private final int[] array;
    private final int start;
    private final int end;
    private int partialSum;  // Store the partial sum for this thread

    public SumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        partialSum = 0;
        for (int i = start; i < end; i++) {
            partialSum += array[i];
        }
    }

    public int getPartialSum() {
        return partialSum;
    }
}