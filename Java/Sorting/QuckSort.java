import java.util.Arrays;

public class QuckSort{
    
    public static void Swap(int[] Data,int Num1Index,int Num2Index){
        int Temp = Data[Num1Index];
        Data[Num1Index] = Data[Num2Index];
        Data[Num2Index] = Temp;
    }

    public static int Partition(int[] Data,int Left,int Right){
        int Pivot = Data[Left],Start = Left,End = Right;

        while(true){
            while(Start < Right && Data[Start] <= Pivot){
                Start += 1;
            }
            while(End > Left && Data[End] > Pivot){
                End -= 1;
            }
            
            if(Start < End){
                Swap(Data,Start,End);
            }
            else{
                break;
            }  
        }
        
        Swap(Data, Left, End);
        return End;
    }

    public static void QuickSortFunction(int[] Data,int Left,int Right){

        if(Left < Right){
            int PivotIndex = Partition(Data, Left, Right);
            QuickSortFunction(Data, Left, PivotIndex-1);
            QuickSortFunction(Data, PivotIndex+1, Right);
        }
    }

    public static void main(String[] args) {
        System.out.println("""
        Quick Sort
            Definition:
                Quick sort is an efficient, comparison-based sorting algorithm. It works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays: elements less than the pivot and elements greater than the pivot. The sub-arrays are then recursively sorted. This process is repeated until the base case of an empty or single-element array is reached, which is inherently sorted.

            Time Complexity:
                - Best case: O(nlog n) (when the pivot divides the array into two nearly equal parts)
                - Average case: O(nlog n)
                - Worst case: O(n^2) (when the pivot is the smallest or largest element in each partition)

            Advantages:
                - Generally faster than other O(n log n) algorithms like merge sort and heap sort in practice due to lower constant factors.
                - In-place sorting algorithm (minimal additional memory needed).
            Disadvantages:
                - Worst-case performance can be poor without careful pivot selection.
                - Not stable (relative order of equal elements may not be preserved).
        """);

        int[] Data = {2,4,1,10,5,9,8,7};

        System.out.println("Before Sorting Data : "+Arrays.toString(Data));

        QuickSortFunction(Data,0,Data.length-1);

        System.out.println("After Sorting Data : "+Arrays.toString(Data));
    }
}
