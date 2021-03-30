package pro.edu;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int r1 = random.nextInt(1000);

        int[] arrayInt = new int[5];
        arrayInt[0] = 7;
        arrayInt[1] = 4;
        arrayInt[2] = 3;
        arrayInt[3] = 0;
        arrayInt[4] = 2;

        System.out.println(arrayInt[2]);
        Arrays.sort(arrayInt);

   //     arrayInt[5] = 90;

        for (int i = 0; i < arrayInt.length ; i++) {
            System.out.println(arrayInt[i]);
        }
        System.out.println(" -----------    Collections -------------------");
   ///------------------  COLLECTION -----------------------------

        List<Integer> listInt = new ArrayList<>();
        listInt.add(67);
        listInt.add(61);
        listInt.add(6);
        listInt.add(17);
        listInt.add(55);
        listInt.add(0, 101);
        listInt.add(0, 102);
        listInt.add(0, 103);
        listInt.add(0, 104);
        listInt.add(0, 105);
        int indexOfCenter = listInt.size() / 2;
        System.out.println(listInt.get(3));
        System.out.println( " size " + listInt.size());
       // System.out.println(listInt.remove(2));
        System.out.println(listInt.toString());

        System.out.println(listInt.contains(97));
        // update


        //---------------   Initialize 1
         List<Integer>  l2 = new ArrayList<>(
                 Arrays.asList(32,21,22,41,90)
         );
//---------------   Initialize 2
        List<Integer>  l3 =  Stream.of(1,22,21).collect(Collectors.toList());

        System.out.println("-----------------   LinkedList  ------------");

        List<Integer> linkedList = new LinkedList<>();

        //   CRUD  create - add()      read - get()   update - =   delete - remove()

        listInt.clear();

        System.out.println(" ---  ArrayList add to the end ");
        LocalDateTime start = LocalDateTime.now();

        for (int i = 0; i < 100000 ; i++) {
            listInt.add(random.nextInt(1000));
        }
        LocalDateTime finish = LocalDateTime.now();

        int duration = (int) ChronoUnit.MILLIS.between( start, finish);

        System.out.println( "duration " + duration);
        System.out.println("---------------------------");

        // ---------------------  Linked List
         start = LocalDateTime.now();

        for (int i = 0; i < 100000 ; i++) {
            linkedList.add(random.nextInt(1000));
        }
       finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between( start, finish);

        System.out.println(duration);

        Arrays.sort(arrayInt);
        listInt.sort(Comparator.comparing(Function.identity()));


        System.out.println(listInt.size());


        //  ---------------------  Update List
               listInt.set(10, 7); //    На 10ое место поставить число 7





    }
}
/*
*
*
* -----------------   LinkedList  ------------
 ---  ArrayList add to the end
duration 25
*
*
*
*
* */
