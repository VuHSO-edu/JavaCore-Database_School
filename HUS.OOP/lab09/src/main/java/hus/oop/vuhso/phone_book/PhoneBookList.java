package hus.oop.vuhso.phone_book;

import java.util.ArrayList;

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
public class PhoneBookList implements PhoneBook {

    ArrayList<Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public Student searchByLastName(String lastname) {
        for (Student student : phoneBook) {
            if (student.getLastname().equals(lastname)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student student : phoneBook) {
            if (student.getPhone().equals(phone)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.add(p);
    }

    @Override
    public Student searchByName(String name) {
        for (Student student : phoneBook) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        for (Student student : phoneBook) {
            if (student.getPhone().equals(phone)) {
                phoneBook.remove(student);
            }
        }
    }
}
