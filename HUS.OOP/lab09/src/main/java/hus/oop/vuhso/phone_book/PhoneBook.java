package hus.oop.vuhso.phone_book;

public interface PhoneBook {
    Student searchByLastName(String lastname);
    Student searchByNumber(String phone);
    void addPerson(Student p);
    Student searchByName(String name);

    void deleteByNumber(String phone);

}
