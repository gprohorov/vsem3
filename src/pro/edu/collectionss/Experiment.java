package pro.edu.collectionss;
/*
  @author   george
  @project   vsem3
  @class  Experiment
  @version  1.0.0 
  @since 02.04.2021 - 18.41
*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Experiment {
    public static void main(String[] args) {
        List<Integer> arrayLst = new ArrayList<>();

        for (int i = 0; i <100000 ; i++) {
            arrayLst.add(i);
        }

        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i <1000; i++) {
            arrayLst.add(0, 99);
        }
        LocalDateTime finish = LocalDateTime.now();
        System.out.println(ChronoUnit.MILLIS.between( start, finish));
        //-----------------------------------------------------
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i <100000 ; i++) {
            linkedList.add(i);
        }
        start = LocalDateTime.now();
        for (int i = 0; i <1000; i++) {
            linkedList.add(0, 99);
        }
         finish = LocalDateTime.now();
        System.out.println(ChronoUnit.MILLIS.between( start, finish));


    }
}
