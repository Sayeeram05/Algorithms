from turtle import position


def InsertionSort(Data):
    for i in range(1,len(Data)):
        # print(Data[i])
        Temp = Data[i]
        Position = i
        for j in range(i-1,-1,-1):
            if(Temp < Data[j]):
                Data[j+1] = Data[j]
                Position = j
            # print(Data[j],end=" ")
            else:
                break
        Data[Position] = Temp
        # print()
        # print(Data)
        # print(Position)
        # print("\n")

        


print('''
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
        Generally slower compared to more advanced sorting algorithms like quicksort and merge sort.
''')

Data = [2,4,1,10,5,9,8,7]

print("Before Sorting Data : ",Data)

InsertionSort(Data)

print("After Sorting Data : ",Data)