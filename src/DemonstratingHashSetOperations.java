import java.util.HashSet;

public class DemonstratingHashSetOperations {
    public static void main(String[] args) {
        //Create HashSet to store integers
        HashSet<Integer> hs = new HashSet<>();

        // Add the numbers 5, 10, 15, 20, 25 to the set
        for (int i = 1; i <= 5; i++) {
            hs.add(5 * i);
        }

        //Display the elements of the set.
        for(int number: hs){
            System.out.print(number+" ");
        }

        //Check if the set contains the number 10
        if(hs.contains(10)){
            System.out.println("Contain 10");
        }
        else System.out.println("Does not contain 10");

        //Remove the number 15 from the set
        hs.remove(15);

        //Display the size of the set
        System.out.println("Size of set: "+hs.size());
    }
}
