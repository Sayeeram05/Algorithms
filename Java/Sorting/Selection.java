import java.util.Arrays;

public class Selection {
    
    public static void SelectionSort(int[] Data){
        for(int i = 0 ; i < Data.length - 1; i++){
            int index = i;

            for(int j = i+1 ; j < Data.length ; j++){
                if(Data[j] < Data[index]){
                    index = j;
                }
            }

            int Temp = Data[i];
            Data[i] = Data[index];
            Data[index] = Temp;
        }
    }

    public static void main(String[] args) {

        System.out.println("""
        Selection Sort
            Definition:
                Selection sort is a simple comparison-based sorting algorithm. It works by dividing the input list into two parts: the sublist of items already sorted, which is built up from left to right at the front (left) of the list, and the sublist of items remaining to be sorted that occupy the rest of the list. Initially, the sorted sublist is empty and the unsorted sublist is the entire input list. The algorithm proceeds by finding the smallest (or largest, depending on the order) element from the unsorted sublist, swapping it with the leftmost unsorted element (putting it in sorted order), and moving the sublist boundaries one element to the right.
            
            Time Complexity: 
                Best case: O(n^2) even if the list is already sorted.
                Average and worst case: O(n^2) where n is the number of elements in the list. This makes it inefficient on large lists.
            
            Advantages:
                Simple to implement and understand.
                Does not require additional memory space, making it an in-place sorting algorithm.
            Disadvantages:
                Inefficient for large datasets due to its quadratic time complexity.
                Generally slower compared to more advanced sorting algorithms like quicksort and merge sort.
        """);

        int[] Data = {2,4,1,10,5,9,8,7};

        System.out.println("Before Sorting Data : "+Arrays.toString(Data));

        SelectionSort(Data);

        System.out.println("After Sorting Data : "+Arrays.toString(Data));
    }
}
