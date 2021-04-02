package pro.edu.collectionss;
/*
  @author   george
  @project   vsem3
  @class  Student
  @version  1.0.0 
  @since 31.03.2021 - 19.07
*/

import java.time.LocalDate;
import java.util.Objects;


//  POJO class
public class Student {
    private String name;
    private LocalDate birth;
    private Gender gender;
    private int mark;

    public Student() {
    }

    public Student(String name, LocalDate birth, Gender gender, int mark) {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                ", gender=" + gender +
                ", mark=" + mark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getMark() == student.getMark() && getName().equals(student.getName()) && getBirth().equals(student.getBirth()) && getGender() == student.getGender();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBirth(), getGender(), getMark());
    }

    public boolean isAdult(){
        return true;
    }

}
