/** Class Staff: 
 * Dẫn xuất từ (con của) lớp Person. Cần hoàn thiện các phương thức chưa có
 * nhưng phải giữ nguyên mẫu phương thức (khai báo, đối số, kiểu trả về)
 * Có thể thay đổi giá trị sau lệnh return cuối các phương thức nhưng cần
 * giữ nguyên kiểu trả về. Có thể bổ sung phương thức nếu cần, nhưng phải 
 * giữ lại đầy đủ các phương thức đã được khai báo sẵn
 * */
 
public class Staff extends Person{
    private String department = "Office";
    private Date recruitment = new Date();
    private double salary;

    public Staff(){
        // bổ sung mã lệnh ở đây
        super();
        this.department = "Office";
        this.recruitment = new Date();
        this.salary = 0.0;
    }

    public Staff(String code, String mail, String dept, double salary, Date recruit,
                    String name, Date birthday, boolean gender, String address){
        // bổ sung mã lệnh ở đây 
        super(code, name, birthday, gender, mail, address);
        this.department = dept;
        this.salary = salary;
        this.recruitment = recruit;
    }

    public String getDepartment(){
        // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        return this.department;
    }

    public double getSalary(){
        // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        return this.salary;
    }
    
    public int getSeniority(int currentYear) throws ArithmeticException{
        if(currentYear > recruitment.getYear())
            return currentYear - recruitment.getYear();
        else
            throw new ArithmeticException("Recruitment: Invalidate data! Year of birth has to be less than recruitment year!");
    
    }

    public double getRealEarnings(int currentYear){

        // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!

        if (currentYear > recruitment.getYear())
            return this.salary + (currentYear - recruitment.getYear()) * 0.05 * this.salary;
        else {
            return salary;
        }
    }


    public String toString(){

        // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        return "Staff Code: " + getCode() + "\n" +
                "Name: " + getName() + "\n" +
                "Birthday: " + getBirthday() + "\n" +
                "Gender: " + getGender() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Address: " + getAddress() + "\n" +
                "Department: " + department + "\n" +
                "Recruitment Date: " + recruitment.toString() + "\n" +
                "Salary: " + salary;
    }

}