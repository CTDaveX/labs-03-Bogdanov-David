package algorithms;

public class Iterative {

    public static int binarySearch(int[] data, int target) {
        int low = 0;
        int high = data.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (data[mid] == target) {
                return mid;
            } else if (data[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;  // Target not found
    }

    public static void bubbleSort(int[] data) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < data.length; i++) {
                if (data[i - 1] > data[i]) {
                    swap(data, i - 1, i);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static boolean contains(int[] data, int target) {
        for (int element : data) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;  // Target not found
    }

    public static void insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int current = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > current) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = current;
        }
    }

    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            swap(data, i, minIndex);
        }
    }

    public static void swap(int[] data, int a, int b) {
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }
}
