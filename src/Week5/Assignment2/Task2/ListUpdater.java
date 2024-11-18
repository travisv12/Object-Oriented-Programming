package Week5.Assignment2.Task2;

public class ListUpdater implements Runnable {
    private final ThreadSafeArrayList<String> safeList;
    private final String action;
    private final String element;

    public ListUpdater(ThreadSafeArrayList<String> safeList, String action, String element) {
        this.safeList = safeList;
        this.action = action;
        this.element = element;
    }

    @Override
    public void run() {
        safeList.ElementAction(action, element);
    }
}
