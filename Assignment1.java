import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Assignment1
{
    public static void main(String args[])
    {
        String name,address,dob;
        int age, retirementage = 55;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the name:");
        name = sc.nextLine();
        System.out.println("Enter the address:");
        address = sc.nextLine();
        System.out.println("Enter your data of birth yyy-mm-dd format:");
        dob = sc.nextLine();
        
        LocalDate birthDate = LocalDate.parse(dob);
        LocalDate todaysDate = LocalDate.now();
        age = Period.between(birthDate,todaysDate).getYears();
        LocalDate retirementDate = birthDate.plusYears(retirementage);
        if(age<18)
        {
            System.out.println("you are not eligible !");
            return;
        }
        
        System.out.println("Enter your salary details:");
        float da_percent = 2f;
        float ta_percent = 1f;
        float hra_percent = 3f;
        float pf_percent = 0.5f;
        float professionalTax = 1000;
        float basicPayment;
        float totalSalary;
        System.out.println("Enter the basic payment between 4500 and 6500:");
        basicPayment = sc.nextFloat();
        if(basicPayment<4500 || basicPayment>6500)
        {
            if(basicPayment < 4500)
            {
                System.out.println("Basic payment is low than the specified range !");
                return;
            }
            if(basicPayment > 6500)
            {
                System.out.println("Basic payment is exceeding the sepcified range !");
                return;
            }
        }
        float DA = basicPayment * (da_percent/100);
        float TA = basicPayment * (ta_percent/100);
        float HRA = basicPayment * (hra_percent/100);
        float PF = basicPayment * (pf_percent/100);
        totalSalary = basicPayment + DA + TA + HRA - PF;
        if(totalSalary > 10000)
        {
            totalSalary = professionalTax;
        }
        System.out.println("DA()Dearness Allowance):"+DA);
        System.out.println("TA(Travelling Allowance):"+TA);
        System.out.println("HRA(House Rent Allowance):"+HRA);
        System.out.println("Total Salary:"+totalSalary);
        
        System.out.println("\nEmployee Details");
        System.out.println("\nName :"+name);
        System.out.println("\nAddress:"+address);
        System.out.println("\nDate of birth:"+birthDate);
        System.out.println("\nAge:"+age);
        System.out.println("\nRetirement Date:"+retirementDate);
        System.out.println("\nSalary:"+totalSalary);
        
    }
}
