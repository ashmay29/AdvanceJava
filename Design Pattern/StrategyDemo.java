// Strategy Pattern
interface SortStrategy {
    void sort(int[] arr);
}
class BubbleSort implements SortStrategy {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
    }
}
class QuickSort implements SortStrategy {
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }
    int partition(int[] a, int low, int high) {
        int pivot = a[high], i = low - 1;
        for (int j = low; j < high; j++)
            if (a[j] < pivot) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        int t = a[i+1];
        a[i+1] = a[high];
        a[high] = t;
        return i+1;
    }
}
class SortContext {
    private SortStrategy strategy;
    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }
    public void executeStrategy(int[] arr) {
        strategy.sort(arr);
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}
class StrategyDemo {
    public static void main(String[] args) {
        int[] data = {5, 2, 8, 3};
        SortContext context = new SortContext();
        context.setStrategy(new BubbleSort());
        context.executeStrategy(data.clone());
        context.setStrategy(new QuickSort());
        context.executeStrategy(data.clone());
    }
}
