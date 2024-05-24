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

        try{
        // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        // Thứ tự dữ liệu nhập: Đọc và thực hiện đúng theo yêu cầu như trong mô tả
        } catch(ArithmeticException ArtmExcp){
            System.out.print(ArtmExcp.getMessage() );       
            return null;
        } catch(Exception Excp){
            System.out.println("Data types mismatch!");       
            return null;
        }
        // Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!        
        return null;
    }
    
    public static ArrayList<Person> listOfStaff(Person[] listPerson){

        ArrayList<Person> results = new ArrayList<Person>();
        // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        
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
     }     

    public static ArrayList<Person> listOfStudent(Person[] listPerson){

        ArrayList<Person> results = new ArrayList<Person>();

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
        return null;
     }

    // Phương thức theo yêu cầu ở mục 4.2 trong mô tả
    public static void displayList(Person[] listPerson){
        if(listPerson != null){
            
            // bổ sung mã lệnh ở đây!
            
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
                }else{
                    /* Đặt student = (Student)(đối tượng thứ i). Bổ sung lệnh để in ra xâu ký tự theo mẫu sau:
                    student.toString() + " Total Fees:" + String.valueOf(student.getPayment(baseAmount) ) */;
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
     }  
     
     public static ArrayList<Person> searchByMajors(Person[] listPerson, String majors){
        // bổ sung mã lệnh ở đây để liệt kê các đối tượng Student trong listPerson có trường majors
        // trùng với tham đối majors! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!

        return null;
     } 
     

    public static void main(String Ag[]){
        Scanner scan = new Scanner(System.in);
        currentYear = scan.nextInt();
        // Chỉ cần viết main để kiểm thử theo ý người lập trình
        // Phần chạy thử & chấm trên hệ thống đã có lớp khác.
    }
     
}