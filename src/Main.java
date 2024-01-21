import People.employee;
import People.person;
import People.student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<person> peopleList = new ArrayList<>();

        peopleList.add(new employee("John", "Lennon", "Teacher", 80000));
        peopleList.add(new student("Paul","McCartney",3.67));
        peopleList.add(new student("Ringo", "Starr", 2.1));
        peopleList.add(new employee("George", "Harrison", "OfficeWorker", 100000));

        printData(peopleList);
    }
    public static void printData(Iterable<person> people){
        for (person person : people){
            System.out.println(person);
        }
    }
}