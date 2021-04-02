package pro.edu;
/*
  @author   george
  @project   vsem3
  @class  StudentService
  @version  1.0.0 
  @since 02.04.2021 - 18.57
*/

import pro.edu.collectionss.Student;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class StudentService {

    public boolean isAdult(Student student){
        LocalDate birthday = student.getBirth();
        final long years = ChronoUnit.YEARS.between(birthday, LocalDate.now());
        if(years > 18) return true;

        return false;
    }
}
