print('''
Linear Search
    Definition: 
        Linear search, also known as sequential search, is a simple search algorithm that checks each element in a list sequentially until the target element is found or the list ends.
      
    Time Complexity: O(n), where n is the number of elements in the list. This makes it inefficient for large datasets.
      
    Advantages:
        Easy to implement.
        Works on both sorted and unsorted lists.
    Disadvantages:
        Inefficient for large lists due to its linear time complexity.
        Comparatively slow compared to more advanced search algorithms like binary search.
''')

Data = [1,3,5,7,8,9,2,20,15]

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

# Algorithm

for i in range(0,len(Data)):
    print(f"Find Num:{FindNum} is Data:{Data[i]}",end=" ")

    if(FindNum == Data[i]):
        print(f"=> Yes\nWe Found The Number at {i+1} Position")
        break
    else:
        print("=> No\nLet's Check the Next Number\n")



