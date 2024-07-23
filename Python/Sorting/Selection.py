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
        Selection sort is a straightforward, comparison-based sorting algorithm. It divides the list into a sorted and an unsorted region. The sorted region grows from left to right by repeatedly finding the smallest element in the unsorted region, swapping it with the leftmost unsorted element, and moving the boundary one element to the right.
      
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