package model;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class Developer extends Employee implements Promotion, Bonus{
    private String domain;

    public Developer(String name, int identity, LocalDate dateofJoining, String email, String phoneNumber, String role, BigDecimal salary, String domain) {
        super(name, identity, dateofJoining, email, phoneNumber, role, salary);
        this.domain = domain;
    }

    public String getDomain(){return domain;}

    @Override
    public void work(){
        System.out.println(getName() + " is a " + getRole() + " and specialist in " + getDomain());
    }

    @Override
    public String displayDetails(){
        return "\n Name         - " + getName() +
               "\n ID           - " + getID() + 
               "\n Joining Date - " + getJoiningDate() +
               "\n E-mail       - " + getEmail() +
               "\n Phone Number - " + getPhoneNumber() +
               "\n Salary       - " + getSalary() + 
               "\n Role         - " + getRole() + 
               "\n Domain       - " + getDomain();
    }

    @Override
    public void promote(Employee e){
        if (e.workingExperience() >= 10){
            setRole("Manager");
            setSalary(
                getSalary().multiply(
                    new BigDecimal("1.50")
                ));
            System.out.println(getName() + " promoted " + getRole() + " and Salary incremented to " +getSalary());
        }
    }

    @Override
    public void annualBonus(){
        LocalDate todayDate = LocalDate.now();
        if (todayDate.getMonth() == Month.NOVEMBER){
            setSalary(getSalary().multiply(new BigDecimal("1.10")));
        }
    }   
}