import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

        System.out.println(scottishIslands);

//        1. Add "Coll" to the end of the list
        scottishIslands.add(5, "Coll");
        //scottishIslands.add("Coll");
//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");
//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");
//        4. Print out the index position of "Skye"
        //System.out.println("Skye index: " + skyeIndex);
        //System.out.println(scottishIslands.get("Skye"));
        System.out.println("The index of Sky in th ArrayList is: " +
        scottishIslands.indexOf("Skye"));
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);
//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands.size());
//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
//        9. Print out all the islands using a for loop
        for (int i = 0; i < scottishIslands.size(); i++){
            System.out.println(scottishIslands.get(i));
        }

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        for (int number : numbers){
            if((number % 2) == 0){
                System.out.println(number);
            }
        }

//        2. Print the difference between the largest and smallest value
        Collections.sort(numbers);
        System.out.println(numbers.get((numbers.size() -1)) - numbers.get(0));

        //int num1 = 99;
        //int num2 = 1;
        //System.out.println(num1 - num2);

//        3. Print true if the list contains a 1 next to a 1 somewhere
 /*       for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) == 1){
                if (numbers.get(++1)){
                    System.out.println("True");
                }
            }
        }
*/

//        4. Print the sum of the numbers
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println("Sum -> " + sum);


//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count
//          HINT - You will need to track the index throughout the loop
//
//          So [7, 13, 2] would have sum of 9.

        int sum2 = 0;
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) != 13){
                sum2 = sum2 +numbers.get(i);
            }
            else {
                i++;
            }
            System.out.println(sum2);
        }
        // check whether a number is 13
        // if tracking the index, that if O hit #13, stop incrementing the index

        int total = 0;
        int index = 0;
        for (int number : numbers){
            if (number == 12){
                continue;
            }
            else {
                total += number;
                index += 1;
            }
        }

    }

}
