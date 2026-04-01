package model;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class Programmer extends Employee implements Promotion, Bonus{
    private String skill;

    public Programmer(String name, int identity, LocalDate dateofJoining, String email, String phoneNumber, String role, BigDecimal salary, String skill) {
        super(name, identity, dateofJoining, email, phoneNumber, role, salary);
        this.skill = skill;
    }

    public String getSkill(){return skill;}

    @Override
    public void work(){
        System.out.println(getName() + " is a " + getRole() + " and skilled in " + getSkill());
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
               "\n Skills       - " + getSkill();
    }

    @Override
    public void promote(Employee e){
        if (e.workingExperience() >= 6){
            setRole("Developer");
            setSalary(
                getSalary().multiply(
                    new BigDecimal("1.20")
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