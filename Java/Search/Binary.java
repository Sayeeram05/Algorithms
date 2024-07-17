import java.util.Arrays;
import java.util.Scanner;

public class Binary {
    static int[] Data = {1,2,3,4,5,6,7,8,9};
    static int FindNum;
    static byte Loop = 0;

    public static boolean  BinarySearch(int[] Data,int FindNum,int Left,int Right){
        Loop++;
        int Mid = (Left+Right)/2;

        if(Loop == (Data.length)/2 + 1){
            return false;
        }

        if (Data[Mid] == FindNum) {
            System.out.println("Index: "+Mid);
        }
        else {
            if (FindNum <= Data[Mid]) {
                Right = Mid;
            }
            else {
                Left = Mid + 1;
            }
            BinarySearch(Data, FindNum, Left, Right);
        }

        return true;
    }
    
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("""
        Binary Search
            Definition: 
                Binary search is an efficient algorithm for finding an item from a sorted list of items.It works by repeatedly dividing in half the portion of the list that could contain the item, until you've narrowed down the possible locations to just one.
            
            Time Complexity: O(log n), where n is the number of elements in the list. This makes it much faster than linear search, especially for large datasets.
            
            Advantages:
                Highly efficient for large datasets due to its logarithmic time complexity.
                Reduces the search space significantly with each step by half.
            Disadvantages:
                Requires the list to be sorted beforehand.
                More complex to implement than linear search.
        """);

        System.out.println("\nLet's See How Linear search Works !\nData = "+Arrays.toString(Data));

    
        while(true){
            try {
                System.out.print("Enter A Number To Find : ");
                FindNum = Input.nextInt();
                
                if(BinarySearch(Data, FindNum, 0, (Data.length)-1) == false){
                    System.out.println("Entered Number is Not In Data\n");
                }

                break;
            } catch (Exception e) {
                System.out.println("Invaild Number");
                Input.nextLine(); // Clear the input buffer
            }
        }
        Input.close();
        
    }
}
