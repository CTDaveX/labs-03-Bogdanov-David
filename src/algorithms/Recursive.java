package algorithms;

public class Recursive {

    public static int binarySearch(int[] data, int target) {
        return binarySearch(data, target, 0, data.length - 1);
    }

    private static int binarySearch(int[] data, int target, int min, int max) {
        if (min > max) {
            return -1;  // Target not found
        }
        int mid = min + (max - min) / 2;
        if (data[mid] == target) {
            return mid;
        } else if (data[mid] < target) {
            return binarySearch(data, target, mid + 1, max);
        } else {
            return binarySearch(data, target, min, mid - 1);
        }
    }

    public static void mergeSort(int[] data) {
        if (data.length > 1) {
            int[] left = getFirstHalf(data);
            int[] right = getSecondHalf(data);
            mergeSort(left);
            mergeSort(right);
            merge(data, left, right);
        }
    }

    private static int[] getFirstHalf(int[] data) {
        int[] left = new int[data.length / 2];
        System.arraycopy(data, 0, left, 0, left.length);
        return left;
    }

    private static int[] getSecondHalf(int[] data) {
        int[] right = new int[data.length - data.length / 2];
        System.arraycopy(data, data.length / 2, right, 0, right.length);
        return right;
    }

    private static void merge(int[] data, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                data[k++] = left[i++];
            } else {
                data[k++] = right[j++];
            }
        }
        while (i < left.length) {
            data[k++] = left[i++];
        }
        while (j < right.length) {
            data[k++] = right[j++];
        }
    }

    public static void quickSort(int[] data) {
        quickSort(data, 0, data.length - 1);
    }

    private static void quickSort(int[] data, int min, int max) {
        if (min < max) {
            int pivotIndex = partition(data, min, max);
            quickSort(data, min, pivotIndex - 1);
            quickSort(data, pivotIndex + 1, max);
        }
    }

    private static int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (data[j] < pivot) {
                i++;
                swap(data, i, j);
            }
        }
        swap(data, i + 1, high);
        return i + 1;
    }

    public static void selectionSort(int[] data) {
        selectionSort(data, 0);
    }

    private static void selectionSort(int[] data, int start) {
        if (start < data.length - 1) {
            int minIndex = start;
            for (int i = start + 1; i < data.length; i++) {
                if (data[i] < data[minIndex]) {
                    minIndex = i;
                }
            }
            swap(data, start, minIndex);
            selectionSort(data, start + 1);
        }
    }

    public static void swap(int[] data, int a, int b) {
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }
}
