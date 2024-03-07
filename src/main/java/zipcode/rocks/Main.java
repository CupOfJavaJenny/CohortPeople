package zipcode.rocks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        String student_source = "FakeData.csv";

        // Load data file into an ArrayList<Person> of Person objects.
        Main programObject = new Main();

      List listOfStudents = programObject.handWrittenLoadOfData();
        int numberOfPersons = listOfStudents.size();
        for (int i = 0; i< numberOfPersons; i++){
            System.out.println(listOfStudents.get(i).toString());
        }
    }

    private List loadCSVFile(String student_source) {
        ArrayList<Person> records = new ArrayList<>();

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(student_source);

        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                records.add(this.getRecordFromLine(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("File NOT FOUND.");
            e.printStackTrace();
        }
        return records;
    }

    private Person getRecordFromLine(String line) {
        // take the String of lastname,firstname and create a new Person object with it.
        String[] values = line.split(COMMA_DELIMITER);
        Person newPerson = new Person(values[0], values[1]);
        return newPerson;
    }

    private List handWrittenLoadOfData() {
        ArrayList<Person> students = new ArrayList<>();

      
      Person newPerson1 = new Person("Abukar", "Abukar");
      newPerson1.setbirthMonth("April");
      newPerson1.setfavoriteColor("yellow");
      students.add(newPerson1);

      Person newPerson2 = new Person("Chaz", "Adams");
      newPerson2.setbirthMonth("February");
      newPerson2.setfavoriteColor("blue");
      students.add(newPerson2);

      Person newPerson3 = new Person("Asan", "Ahmadli");
      newPerson3.setbirthMonth("December");
      newPerson3.setfavoriteColor("Dark blue");
      students.add(newPerson3);

      Person newPerson4 = new Person("Jenn", "Azer");
      newPerson4.setbirthMonth("November");
      newPerson4.setfavoriteColor("purple");
      students.add(newPerson4);

      Person newPerson5 = new Person("Ali", "Bangash");
      newPerson5.setbirthMonth("March");
      newPerson5.setfavoriteColor("green");
      students.add(newPerson5);

      Person newPerson6 = new Person("Jake", "Brennan");
      newPerson6.setbirthMonth("April");
      newPerson6.setfavoriteColor("purple");
      students.add(newPerson6);

      Person newPerson7 = new Person("Trey", "Bruton");
      newPerson7.setbirthMonth("September");
      newPerson7.setfavoriteColor("orange");
      students.add(newPerson7);

      Person newPerson8 = new Person("Asia", "Burton");
      newPerson8.setbirthMonth("April");
      newPerson8.setfavoriteColor("pink");
      students.add(newPerson8);

      Person newPerson9 = new Person("Danny", "Cao");
      newPerson9.setbirthMonth("September");
      newPerson9.setfavoriteColor("blue");
      students.add(newPerson9);

      Person newPerson10 = new Person("Nathan", "Eckel");
      newPerson10.setbirthMonth("February");
      newPerson10.setfavoriteColor("green");
      students.add(newPerson10);

      Person newPerson11 = new Person("Jorris", "Ekoloko");
      newPerson11.setbirthMonth("August");
      newPerson11.setfavoriteColor("black");
      students.add(newPerson11);

      Person newPerson12 = new Person("Alice", "Plaza Gonzalez");
      newPerson12.setbirthMonth("May");
      newPerson12.setfavoriteColor("dark blue");
      students.add(newPerson12);

      Person newPerson13 = new Person("Deepa", "Kakade");
      newPerson13.setbirthMonth("June");
      newPerson13.setfavoriteColor("pink");
      students.add(newPerson13);

      Person newPerson14 = new Person("Mariyana", "Katzarova");
      newPerson14.setbirthMonth("December");
      newPerson14.setfavoriteColor("green");
      students.add(newPerson14);

      Person newPerson15 = new Person("Lydia", "Konstanski");
      newPerson15.setbirthMonth("October");
      newPerson15.setfavoriteColor("mushroom");
      students.add(newPerson15);

      Person newPerson16 = new Person("Matt", "Kramer");
      newPerson16.setbirthMonth("January");
      newPerson16.setfavoriteColor("green");
      students.add(newPerson16);

      Person newPerson17 = new Person("Angelina", "Mathew");
      newPerson17.setbirthMonth("May");
      newPerson17.setfavoriteColor("dark blue");
      students.add(newPerson17);

      Person newPerson18 = new Person("Chris", "McCall");
      newPerson18.setbirthMonth("May");
      newPerson18.setfavoriteColor("blue");
      students.add(newPerson18);

      Person newPerson19 = new Person("Nick", "McNamara");
      newPerson19.setbirthMonth("January");
      newPerson19.setfavoriteColor("green");
      students.add(newPerson19);

      Person newPerson20 = new Person("Shaily", "Modi");
      newPerson20.setbirthMonth("January");
      newPerson20.setfavoriteColor("purple");
      students.add(newPerson20);

      Person newPerson21 = new Person("Dan", "Moffett-Conaway");
      newPerson21.setbirthMonth("June");
      newPerson21.setfavoriteColor("blue");
      students.add(newPerson21);

      Person newPerson22 = new Person("Lavanya", "Palanikumar");
      newPerson22.setbirthMonth("October");
      newPerson22.setfavoriteColor("blue");
      students.add(newPerson22);

      Person newPerson23 = new Person("Anthony", "Pearson");
      newPerson23.setbirthMonth("July");
      newPerson23.setfavoriteColor("red");
      students.add(newPerson23);

      Person newPerson24 = new Person("Ethan", "Rieger");
      newPerson24.setbirthMonth("May");
      newPerson24.setfavoriteColor("blue");
      students.add(newPerson24);

      Person newPerson25 = new Person("Jorden", "Ross");
      newPerson25.setbirthMonth("December");
      newPerson25.setfavoriteColor("green");
      students.add(newPerson25);

      Person newPerson26 = new Person("Michael", "Scott");
      newPerson26.setbirthMonth("May");
      newPerson26.setfavoriteColor("orange");
      students.add(newPerson26);

      Person newPerson27 = new Person("Diksha", "Sharma");
      newPerson27.setbirthMonth("March");
      newPerson27.setfavoriteColor("blue");
      students.add(newPerson27);

      Person newPerson28 = new Person("Shijin", "Zeng");
      newPerson28.setbirthMonth("July");
      newPerson28.setfavoriteColor("yellow");
      students.add(newPerson28);
      
      Person newPerson29 = new Person("Andy", "Zheng");
      newPerson29.setbirthMonth("December");
      newPerson29.setfavoriteColor("red");
      students.add(newPerson29);
      
     
      
        return students;
    }
}
