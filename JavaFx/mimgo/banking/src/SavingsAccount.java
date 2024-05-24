/**
   An account that earns interest at a fixed rate.
*/
public class SavingsAccount extends BankAccount
{  
   
   private double interestRate;
   
   
   public SavingsAccount(String anAccountNumber, String pass){
        super(anAccountNumber, pass);
        interestRate = 0.0;
   }
   /**
      Constructs a bank account with a given interest rate.
      @param rate the interest rate
   */
   public SavingsAccount(String anAccountNumber, String firstName, String lastName, String pass, 
                            double initialBalance, double rate) 
   {  
        /* Bổ sung mã lệnh để hoàn thiện hàm dựng với đấy đủ tham số */
   }

   /**
      Adds the earned interest to the account balance.
   */
   public void addInterest() 
   {  
      double interest = getBalance() * interestRate / 100;
      deposit(interest); 
   }
   
   // Cần hoàn thiện
   public double getInterestRate(){
        /* Sửa lại mã lệnh để phương thức trả về interestRate;  */       
        return 0.0;
   }

    // Cần hoàn thiện
    public String toString(){
        /* Sửa lại mã lệnh để phương thức trả về xâu có nội dung:
        <phần toString() của lớp BankAccount> + ". Interest rate : " + interestRate;
        */
        return  "";   
    }

}