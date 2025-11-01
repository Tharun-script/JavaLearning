import java.util.*;

class Sorting {
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void bubbleSort(int[] arr) {
        int n =  arr.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n - 1 ; j++ ){
                if(arr[j] > arr[j+1]){
                    swap(arr , j , j+1);
                }
            }
        }
    }
    
    public void insertionsort(int[] arr){
        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            int key = arr[i];
            int j = i - 1;
            while(j>= 0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public void selectionsort(int[] arr){
        int n = arr.length;
        for(int i =0 ; i< n-1 ; i++){
            int min = i;
            for(int j = i+1 ; j<n ;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            swap(arr , i , min);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Number of elements in array:");
        int number = scan.nextInt();

        int[] arr = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Input number " + (i + 1) + ":");
            arr[i] = scan.nextInt();
        }

        System.out.println("Original array:");
        for (int i = 0; i < number; i++) {
            System.out.print(arr[i] + " ");
        }

        Sorting sort = new Sorting();
        sort.bubbleSort(arr);
        sort.insertionsort(arr);

        System.out.println("\nSorted array:");
        for (int i = 0; i < number; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
