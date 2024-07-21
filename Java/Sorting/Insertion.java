import java.util.Arrays;

public class Insertion {

    public static void InsertionSort(int[] Data){
        
        for(int i = 1 ; i < Data.length ; i++){
            int Temp = Data[i]; // to change Insert in the postion
            int j = i - 1; // To check the Temp and Valve before i index

            while(j>=0 && Data[j] > Temp){
                Data[j+1] = Data[j];
                j--;
            }
            // System.out.println(j);
            Data[j + 1] = Temp;


        }
    }

    public static void main(String[] args) {
        System.out.println("""
        Insertion Sort
            Definition:
                Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time. It is much less efficient on large lists than more advanced algorithms.Insertion sort works by taking elements from the list one by one and inserting them into their correct position in the sorted part of the list.
            
            Time Complexity: 
                Best case: O(n) when the list is already sorted.
                Average and worst case: O(n^2) where n is the number of elements in the list. This makes it inefficient on large lists.
            
            Advantages:
                Simple to implement and understand.
                Efficient for small datasets and mostly sorted lists.
                In-place sorting algorithm (requires no additional memory space).
            Disadvantages:
                Inefficient for large datasets due to its quadratic time complexity.
                Generally slower compared to more advanced sorting algorithms like quicksort and merge sort.""");

        int[] Data = {2,4,1,10,5,9,8,7};

        System.out.println("Before Sorting Data : "+Arrays.toString(Data));

        InsertionSort(Data);

        System.out.println("After Sorting Data : "+Arrays.toString(Data));
    }
    
}
