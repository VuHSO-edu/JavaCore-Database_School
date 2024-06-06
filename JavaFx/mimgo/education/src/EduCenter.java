/** Class EduCenter: 
 * Lớp dùng để gọi thực hiện và kiểm thử các lớp đã xây dựng trước đó. 
 * Cần hoàn thiện các phương thức chưa đầy đủ nhưng phải giữ nguyên mẫu
 * phương thức (khai báo, đối số, kiểu trả về). Có thể thay đổi giá trị 
 * sau lệnh return cuối các phương thức nhưng cần giữ nguyên kiểu trả về. 
 * Có thể bổ sung phương thức nếu cần, nhưng phải giữ lại đầy đủ các phương thức đã được khai báo sẵn
 * */
 

import java.util.Scanner;
import java.util.ArrayList;

public class EduCenter{
    public static int currentYear = 2020;
    public static double baseAmount;
    
    public static Person[] readData(Scanner scan){
        // bổ sung mã lệnh. Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        int n = scan.nextInt();
        Person[] persons = new Person[n];
        try{
        // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        // Thứ tự dữ liệu nhập: Đọc và thực hiện đúng theo yêu cầu như trong mô tả
            for (int i = 0; i < n; i++) {
                String type = scan.next(); // read the type of person (Staff or Student)
                if (type.equals("Staff")) {
                    // read Staff data and create Staff object
                    String code = scan.next();
                    String mail = scan.next();
                    String dept = scan.next();
                    double salary = scan.nextDouble();
                    Date recruit = new Date(scan.nextInt(), scan.nextInt(), scan.nextInt());
                    String name = scan.next();
                    Date birthday = new Date(scan.nextInt(), scan.nextInt(), scan.nextInt());
                    boolean gender = scan.nextBoolean();
                    String address = scan.next();
                    persons[i] = new Staff(code, mail, dept, salary, recruit, name, birthday, gender, address);
                } else if (type.equals("Student")) {
                    // read Student data and create Student object
                    String SVcode = scan.next();
                    String mail = scan.next();
                    String majors = scan.next();
                    double score = scan.nextDouble();
                    String name = scan.next();
                    Date birthday = new Date(scan.nextInt(), scan.nextInt(), scan.nextInt());
                    boolean gender = scan.nextBoolean();
                    String address = scan.next();
                    persons[i] = new Student(SVcode, mail, majors, score, name, birthday, gender, address);
                }
            }
            return persons;
        } catch(ArithmeticException ArtmExcp){
            System.out.print(ArtmExcp.getMessage() );       
            return null;
        } catch(Exception Excp){
            System.out.println("Data types mismatch!");       
            return null;
        }
        // Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
    }
    
    public static ArrayList<Person> listOfStaff(Person[] listPerson){

        ArrayList<Person> results = new ArrayList<Person>();
        // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        for (Person person : listPerson) {
            if (person instanceof Staff) {
                results.add(person);
            }
        }
        if ( results.size() > 0)
            return results;
        else
            return null;
     }
     
    public static void sortStaffBySalary(ArrayList<Person> listStaff){
        Staff tmp;
        int n = listStaff.size();
        Staff staffI, staffJ;
        for (int i = 0; i < n-1; i ++)
            for(int j = i + 1; j < n; j++){
                staffI = (Staff)listStaff.get(i);
                staffJ = (Staff)listStaff.get(j);
                if(staffI.getSalary() > staffJ.getSalary()){
                    tmp = (Staff)listStaff.get(i);
                    listStaff.set(i, listStaff.get(j) );
                    listStaff.set(j, tmp);
                }
            }
     }

     public static void sortStudentByScore(ArrayList<Person> listStudent){
        // bổ sung mã lệnh ở đây! Không thay đổi khai báo phương thức!
        // Tham khảo phương thức sortStaffBySalary
         int n = listStudent.size();
         Student studentI, studentJ;
         for (int i = 0; i < n-1; i++) {
             for(int j = i + 1; j < n; j++){
                 studentI = (Student)listStudent.get(i);
                 studentJ = (Student)listStudent.get(j);
                 if(studentI.getScore() > studentJ.getScore()){
                     Person tmp = listStudent.get(i);
                     listStudent.set(i, listStudent.get(j));
                     listStudent.set(j, tmp);
                 }
             }
         }
     }

    public static ArrayList<Person> listOfStudent(Person[] listPerson){

        ArrayList<Person> results = new ArrayList<Person>();
        for (Person person : listPerson) {
            if (person instanceof Student) {
                results.add(person);
            }
        }
        // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        if(results.size() > 0)
            return results;
        else
            return null;
     }
     
     public static Person searchByCode(Person[] listPerson, String code){

        // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
         for (Person person : listPerson) {
             if (person.getCode().equals(code)) {
                 return person;
             }
         }
        return null;
     }

    // Phương thức theo yêu cầu ở mục 4.2 trong mô tả
    public static void displayList(Person[] listPerson){
        if(listPerson != null){
            
            // bổ sung mã lệnh ở đây!
            for (Person person : listPerson) {
                System.out.println(person.toString());
            }
            
        } else{
            System.out.println("No any person in this list!");
        }
    }
    
    // Phương thức theo yêu cầu ở mục 4.3 trong mô tả
    public static void displayList(ArrayList<Person>  listPerson){
        // Bổ sung mã lệnh để phương thức này có thể thông tin ra màn hình đúng theo mẫu
        // cả trường hợp Student và Staff
        int n = listPerson.size();
        if(n > 0){

            for (int i = 0; i < n; i ++){
                if(listPerson.get(i).getClass().getSimpleName().equals("Staff")){
                    /* Đặt staff = (Staff)(đối tượng thứ i). Bổ sung lệnh để in ra xâu ký tự theo mẫu sau:
                    staff.toString() + " Income:" + String.valueOf(staff.getRealEarnings(currentYear)) */
                    Staff staff = (Staff) listPerson.get(i);
                    System.out.println(staff.toString() + " Income:" + String.valueOf(staff.getRealEarnings(currentYear)));
                }else{
                    /* Đặt student = (Student)(đối tượng thứ i). Bổ sung lệnh để in ra xâu ký tự theo mẫu sau:
                    student.toString() + " Total Fees:" + String.valueOf(student.getPayment(baseAmount) ) */;
                    Student student = (Student) listPerson.get(i);
                    System.out.println(student.toString() + " Total Fees:" + String.valueOf(student.getPayment(baseAmount)));
                }
            }
        } else{
            System.out.println("No any person in this list!");
        }
    }

    
     public static void sortByLastName(Person[] listPerson){
        // Bổ sung mã lệnh để phương thức này có thể sắp xếp mảng theo thứ tự tăng dần 
        // của phần tên LastName (từ cuối cùng của tên đầy đủ) các đối tượng Person
        // Dùng phương thức lớp String: str1.compareTo(String str2) để so hai xâu str1 và str2.
         int n = listPerson.length;
         for (int i = 0; i < n-1; i++) {
             for (int j = 0; j < n-i-1; j++) {
                 if (listPerson[j].getLastName().compareTo(listPerson[j+1].getLastName()) > 0) {
                     // Swap listPerson[j] and listPerson[j+1]
                     Person temp = listPerson[j];
                     listPerson[j] = listPerson[j+1];
                     listPerson[j+1] = temp;
                 }
             }
         }
     }  
     
     public static ArrayList<Person> searchByMajors(Person[] listPerson, String majors){
        // bổ sung mã lệnh ở đây để liệt kê các đối tượng Student trong listPerson có trường majors
        // trùng với tham đối majors! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!

         ArrayList<Person> results = new ArrayList<Person>();
         for (Person person : listPerson) {
             if (person instanceof Student) {
                 Student student = (Student) person;
                 if (student.getMajors().equals(majors)) {
                     results.add(student);
                 }
             }
         }
         return results.size() > 0 ? results : null;
     } 
     

    public static void main(String Ag[]){
        Scanner scan = new Scanner(System.in);
        currentYear = scan.nextInt();
        // Chỉ cần viết main để kiểm thử theo ý người lập trình
        // Phần chạy thử & chấm trên hệ thống đã có lớp khác.
    }
     
}