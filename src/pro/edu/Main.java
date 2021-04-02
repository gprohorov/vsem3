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

        List<Integer> listInt = new ArrayList<>( );
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
                 Arrays.asList(32,21,22,490)
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

//--------------------   READ --------------------------------------

        System.out.println("   ---  reading -----");

        System.out.println(" ---  TAIL ---- ");

        start = LocalDateTime.now();

        for (int i = 90000; i < 100000; i++) {
              int a = listInt.get(i);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between( start, finish);

        System.out.println( "arraList "+ duration);

   //----------------------------------------------------


        start = LocalDateTime.now();

        for (int i = 90000; i < 100000; i++) {
            int a = linkedList.get(i);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between( start, finish);

        System.out.println("libkedlist " + duration);

   // -------------------------------

        System.out.println(" ---   UPDATE  ---  ");

        start = LocalDateTime.now();

        for (int i = 0; i < 10000; i++) {
            listInt.set(i, 100);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between( start, finish);

        System.out.println( "arraList  update HEAD "+ duration);



        start = LocalDateTime.now();

        for (int i = 0; i < 10000; i++) {
            linkedList.set(i, 100);
        }
        finish = LocalDateTime.now();

        duration = (int) ChronoUnit.MILLIS.between( start, finish);

        System.out.println( "linkedList  update  HEAD "+ duration);

//  add()  - создание (create)
//  get()  - read
// set()   - update
//  remove() -  delete
        // insert  add()  TO

        List<Integer> list = new ArrayList<>( Arrays.asList(1,2,3,4,5,6,7,8,9,10));


        //  create
         list.add(11);
         list.add(12);
         // insert to BEGINING
        list.add(0,13);
        list.add(0,14);

        // insert INTO THE MIIDLE
        list.add(7, 100);
        list.add(7, 100);

        // insert TO THE END
        list.add(13, 99);
        list.add(13, 99);
        // list.add(14, 99)  ==  list.add(99)


        System.out.println(list.size());


        for (int i = 0; i < 5 ; i++) {
            list.add(9, 555);

        }
        System.out.println(list);

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
