public class InsertionSort {
    public static long sort(int[] array) {
        long start = System.nanoTime();
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
        long end = System.nanoTime();
        return end - start;
    }
}