import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.add("Anna");
        students.add("Collin");
        students.add("Richard");
        students.add("Lucasz");

        System.out.println(students);

        //  Enhanced for loop
        for (String student : students) {
            System.out.println(student);
        }

        //  Classic for loop
        System.out.println("classic for loop");
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++){
            numbers.add(i);
        }

        System.out.println("all numbers: " + numbers);

        for (int i = 0; i <numbers.size(); i+=2){
            System.out.println(numbers.get(i));
        }




    }
}
