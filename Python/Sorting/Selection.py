def Selection(Data):
    for i in range(len(Data)-1):
        # print(i)
        Index = i

        for j in range(i+1,len(Data)):
            if(Data[j] < Data[Index]):
                Index = j

        Data[i],Data[Index] = Data[Index],Data[i]
        print(Data)

print('''
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
''')


Data = [2,4,1,10,5,9,8,7]

print("Before Sorting Data : ",Data)

Selection(Data)

print("After Sorting Data : ",Data)