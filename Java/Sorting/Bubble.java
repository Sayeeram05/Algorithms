
import java.util.Arrays;

public class Bubble {

    public static void BubbleSort(int[] Data){
        for(int i = 0 ; i < (Data.length)-1 ; i++){
            for(int j = 0 ; j < ((Data.length)-1)-i ; j++){  //(-i) Reduce the unwanted loops of sorted Elements
                if(Data[j] > Data[j+1]){
                    int Temp = Data[j+1];
                    Data[j+1] = Data[j];
                    Data[j] = Temp;
                }
                
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("""
        Bubble Sort
            Definition:
                Bubble sort is a simple comparison-based sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.
            
            Time Complexity: 
                Best case: O(n) when the list is already sorted.
                Average and worst case: O(n^2) where n is the number of elements in the list. This makes it inefficient on large lists.
            
            Advantages:
                Simple to understand and implement.
                Does not require additional memory space, making it an in-place sorting algorithm.
            Disadvantages:
                Inefficient for large datasets due to its quadratic time complexity.
                Generally slower compared to more advanced sorting algorithms like Quick Sort and Merge Sort.""");

        int[] Data = {2,4,1,10,5,9,8,7};

        System.out.println("Before Sorting Data : "+Arrays.toString(Data));

        BubbleSort(Data);

        System.out.println("After Sorting Data : "+Arrays.toString(Data));


    }
}
