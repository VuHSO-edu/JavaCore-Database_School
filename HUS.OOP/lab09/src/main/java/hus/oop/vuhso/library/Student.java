package hus.oop.vuhso.library;

import java.util.Comparator;
import java.util.Objects;

//AUTHOR:VuHSO
//                           _
//                        _ooOoo_
//                       o8888888o
//                       88" . "88
//                       (| -_- |)
//                       O\  =  /O
//                    ____/`---'\____
//                  .'  \\|     |//  `.
//                 /  \\|||  :  |||//  \
//                /  _||||| -:- |||||_  \
//                |   | \\\  -  /'| |   |
//                | \_|  `\`---'//  |_/ |
//                \  .-\__ `-. -'__/-.  /
//              ___`. .'  /--.--\  `. .'___
//           ."" '<  `.___\_<|>_/___.' _> \"".
//          | | :  `- \`. ;`. _/; .'/ /  .' ; |
//          \  \ `-.   \_\_`. _.'_/_/  -' _.' /
//===========`-.`___`-.__\ \___  /__.-'_.'_.-'================
//                        `=--=-'
//=========== Phật phù hộ không bao giờ BUG ===================
public class Student implements Comparable<Student>{
    String name;
    String lastname;
    String phone;
    double average;

    public Student(String name, String lastname, String phone) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
    }

    public Student(String name, String lastname, double average) {
        this.name = name;
        this.lastname = lastname;
        this.average = average;
    }

    public Student(String name, String lastname, String phone, double average) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Student student)) return false;
        return Double.compare(average, student.average) == 0
                && Objects.equals(name, student.name)
                && Objects.equals(lastname, student.lastname)
                && Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, phone, average);
    }

    @Override
    public String toString() {
        return "Student[" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                ", average=" + average +
                ']';
    }

    @Override
    public int compareTo(Student o) {
        return Comparator.comparing(Student::getName)
                .thenComparing(Student::getLastname)
                .compare(this, o);
    }

}
