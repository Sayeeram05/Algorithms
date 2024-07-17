print('''
Binary Search
    Definition: 
        Binary search is an efficient algorithm for finding an item from a sorted list of items. It     works by repeatedly dividing in half the portion of the list that could contain the item, until you've narrowed down the possible locations to just one.
      
    Time Complexity: O(log n), where n is the number of elements in the list. This makes it much faster than linear search, especially for large datasets.
      
    Advantages:
        Highly efficient for large datasets due to its logarithmic time complexity.
        Reduces the search space significantly with each step by half.
    Disadvantages:
        Requires the list to be sorted beforehand.
        More complex to implement than linear search.
''')

def BinarySearch(Data,Left,Right,FindNum):
    Mid = int((Left+Right)/2)
    # print(Left,Mid,Right)
    # print(Data[Mid])
    if(Data[Mid] == FindNum):
        print("Index : ",Mid)
        return 0
    else:
        if(FindNum <= Data[Mid]):
            Right = Mid
            # print("R")
        else:
            Left = Mid + 1
            # print("L")
        BinarySearch(Data,Left,Right,FindNum)

Data = [1,2,3,4,5,6,7,8,9,10]

print("\nLet's See How Linear search Works !\nData = ",Data)

# Loop Until Get Number and Num In Data
while True:
    try :
        FindNum = int(input("Enter A Number To Find : "))
        if(FindNum not in Data):
            print("Entered Number is Not In Data\n")
        else:
            break
    except:
        print("❌Invalid Number\n")

BinarySearch(Data,0,len(Data)-1,FindNum)

