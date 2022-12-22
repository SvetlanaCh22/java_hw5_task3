// Реализовать алгоритм пирамидальной сортировки (HeapSort).
// (Можно использовать массивы)

// Чубченко Светлана

public class main {

    public static void main(String args[]) {
        // задаем массив
        int[] arrToSort = { 9, 18, 11, 2, 19, 4 };
        // выводим на экран
        System.out.println("Исходный массив: ");
        printArray(arrToSort);
        // сортируем
        sortArray(arrToSort);
        // выводим на экран
        System.out.println("Отсортированный массив: ");
        printArray(arrToSort);
    }

    // пирамидальная сортировка
    static void sortArray(int arr[]) {
        int N = arr.length;
        for (int i = N / 2 - 1; i >= 0; i--) heapify(arr, N, i);
        for (int i = N - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    static void heapify(int arr[], int N, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < N && arr[l] > arr[largest]) largest = l;
        if (r < N && arr[r] > arr[largest]) largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, N, largest);
        }
    }

    // вывод массива в консоль
    static void printArray(int arr[]) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

}

