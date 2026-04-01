package model;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public abstract class Employee{
    private String name;
    private int identity;
    private LocalDate dateofJoining;
    private String email;
    private String phoneNumber;
    private String role;
    private BigDecimal salary;

    public Employee() {
        this("unknown", 0, null, "unknown", "NA", "NA", null);
    }

    public Employee(String name, int identity, LocalDate dateofJoining, String email, String phoneNumber, String role, BigDecimal salary) {
        this.name = name;
        this.identity = identity;
        this.dateofJoining = dateofJoining;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.salary = salary;
    }

    public void setRole(String r){role=r;}
    public void setSalary(BigDecimal s){salary=s;}

    public String getName(){return name;}
    public int getID(){return identity;}
    public LocalDate getJoiningDate(){return dateofJoining;}
    public String getEmail(){return email;}
    public String getPhoneNumber(){return phoneNumber;}
    public String getRole(){return role;}
    public BigDecimal getSalary(){return salary;}

    abstract public void work();

    abstract public String displayDetails();

    public int workingExperience(){
        LocalDate todayDate = LocalDate.now();
        Period yearsWorked = Period.between(dateofJoining, todayDate);
        return yearsWorked.getYears();
    }
}