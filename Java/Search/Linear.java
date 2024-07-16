
import java.util.Arrays;
import java.util.Scanner;
public class Linear{
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("""
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
                """);
        
        int[] Data = {1,3,5,7,8,9,2,20,15};

        System.out.println("\nLet's See How Linear search Works !\nData = "+Arrays.toString(Data));

        int FindNum;
        boolean Search = false;

        while(true){
            try {
                System.out.print("Enter A Number To Find : ");
                FindNum = Input.nextInt();
                for(int i = 0 ; i < Data.length ; i++){
                    System.out.print("Find Num:"+FindNum+" is Data:"+Data[i]);
                    
                    if(FindNum == Data[i]){
                        System.out.println("=> Yes\nWe Found The Number at Position "+ (i+1) + "\n");
                        Search = true;
                        break;
                    }
                    else{
                        System.out.println("=> No\nLet's Check the Next Number\n");
                    }
                }
                if (Search == false) {
                    System.out.println("Entered Number is Not In Data\n");
                }
                break;
            } catch (Exception e) {
                System.out.println("Invaild Number");
                Input.nextLine(); // Clear the input buffer
            }
        }
    }
}