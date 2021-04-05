package pro.edu.collectionss;
/*
  @author   george
  @project   vsem3
  @class  Cols
  @version  1.0.0 
  @since 31.03.2021 - 18.56
*/

import pro.edu.collectionss.interfaces.IAccounting;
import pro.edu.collectionss.model.CandyBox;
import pro.edu.collectionss.model.CandyWeighed;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cols {

    public static void main(String[] args) {

        List<Student>  students = new ArrayList<>(
            Arrays.asList(
                 new Student("John Lennon", LocalDate.of(2003, Month.FEBRUARY,1), Gender.MALE, 90),
                 new Student("Paul McCartney", LocalDate.of(2004, Month.JANUARY,6), Gender.MALE, 75),
                 new Student("Yoko Ono", LocalDate.of(2000, Month.FEBRUARY,1), Gender.FEMALE, 50),
                 new Student("Freddie Mercury", LocalDate.of(2004, Month.AUGUST,23), Gender.MALE, 85),
                 new Student("Tarja Turunen", LocalDate.of(2002, Month.SEPTEMBER,1), Gender.FEMALE, 80)
                )
        );
        List<Student> men = students.stream()
                .filter(student -> student.getGender().equals(Gender.MALE))
                .collect(Collectors.toList());
        System.out.println(men);

        List<Student>  troechniki = students.stream().filter(item -> item.getMark() <75)
                .collect(Collectors.toList());
        System.out.println(troechniki);

        Student otlichnik = students.stream().max(Comparator.comparing(Student::getMark)).get();



        double avg = students.stream().mapToInt(Student::getMark).average().getAsDouble();
        System.out.println(otlichnik);
        System.out.println(avg);
        int max = students.stream().mapToInt(Student::getMark).max().getAsInt();
        int min = students.stream().mapToInt(Student::getMark).min().getAsInt();








   //--------------------------------------------------------------------------------------------
        List<IAccounting> list = new ArrayList<>(
                Arrays.asList(
                        new CandyBox("Lastochka", 0.2, 100, 10, 2 ),
                        new CandyBox("Roshen", 0.2, 100, 10, 2 ),
                        new CandyBox("Vinok Dunaya", 0.2, 120, 15, 1 ),
                        new CandyBox("Lastochka", 0.2, 100, 10, 2 ),
                        new CandyBox("Lastochka", 0.2, 100, 10, 2 ),
                        new CandyWeighed("Korovka",0.150, 60),
                        new CandyWeighed("Romashka",1.0, 88),
                        new CandyWeighed("Korovka",0.150, 60),
                        new CandyWeighed("Korovka",0.150, 60),
                        new CandyWeighed("Korovka",0.150, 60)
                )
        );
          double totalIncome = list.stream().mapToDouble(IAccounting::getUltimatePrice).sum();
          double expensive   = list.stream().mapToDouble(IAccounting::getUltimatePrice).max().getAsDouble();
          double cheap       = list.stream().mapToDouble(IAccounting::getUltimatePrice).min().getAsDouble();

        IAccounting element = list.stream().filter(item -> item.getUltimatePrice() == expensive)
                .findFirst().orElse(null);

        System.out.println(element);
        System.out.println("---------------------------------------");

        double totalSumBoxed = list.stream()
                .filter(el -> el instanceof CandyBox)
                .mapToDouble(IAccounting::getUltimatePrice).sum();
        double totalSumWeighed = list.stream()
                .filter(el -> el instanceof CandyWeighed)
                .mapToDouble(IAccounting::getUltimatePrice).sum();

        if (totalSumBoxed > totalSumWeighed) {
            System.out.println("Boxed");}
        else {
            System.out.println("Weighed");
        }

        boolean hasPool = true;
        int totalSum = 0;

        totalSum = totalSum + ( (hasPool) ? 100 : 0 );



        }
}
