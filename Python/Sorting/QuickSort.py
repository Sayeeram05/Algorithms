def Swap(Data,A,B):
    temp = Data[A]
    Data[A] = Data[B]
    Data[B] = temp

def Partition(Data,Left,Right):
    Pivot = Data[Left]
    Start = Left
    End = Right

    while True:
        while(Start < Right and Data[Start] <= Pivot):
            Start += 1
        while(End > Left and Data[End] > Pivot):
            End -= 1
        
        if(Start < End):
            Swap(Data,Start,End)
        else:
            break
    
    Swap(Data,Left,End) 
    return End


def QuickSort(Data,Left,Right):

    if(Left < Right):
        IndexOfPivot = Partition(Data,Left,Right)
        QuickSort(Data,Left,IndexOfPivot-1)
        QuickSort(Data,IndexOfPivot+1,Right)


print("""
Quick Sort
    Definition:
        Quick sort is an efficient, comparison-based sorting algorithm. It works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays: elements less than the pivot and elements greater than the pivot. The sub-arrays are then recursively sorted. This process is repeated until the base case of an empty or single-element array is reached, which is inherently sorted.

    Time Complexity:
        - Best case: O(nlog n) (when the pivot divides the array into two nearly equal parts)
        - Average case: O(nlog n)
        - Worst case: O(n^2) (when the pivot is the smallest or largest element in each partition)

    Advantages:
        - Generally faster than other \(O(n \log n)\) algorithms like merge sort and heap sort in practice due to lower constant factors.
        - In-place sorting algorithm (minimal additional memory needed).
    Disadvantages:
        - Worst-case performance can be poor without careful pivot selection.
        - Not stable (relative order of equal elements may not be preserved).
""")

Data = [20, 5, 2, 8, 7]
print("Before Sorting Data : ",Data)

QuickSort(Data,0,len(Data)-1)

print("After Sorting Data : ",Data)