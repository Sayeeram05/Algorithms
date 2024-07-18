def BubbleSort(Data):
    for i in range(len(Data)-1):  # (-1) for out of index
        for j in range(len(Data)-1-i):  # (-i) Reduce the unwanted loops of sorted Elements
            # print(Data[j],Data[j+1])
            if(Data[j] > Data[j+1]):
                Temp = Data[j+1]
                Data[j+1] = Data[j]
                Data[j] = Temp
        # print()

print('''
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
        Generally slower compared to more advanced sorting algorithms like Quick Sort and Merge Sort.
''')


Data = [2,4,1,10,5,9,8,7]

print("Before Sorting Data : ",Data)

BubbleSort(Data)

print("After Sorting Data : ",Data)
