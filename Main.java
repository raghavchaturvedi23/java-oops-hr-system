import java.math.BigDecimal;
import java.time.LocalDate;
import model.Developer;
import model.Employee;
import model.Programmer;
import service.HRservice;


public class Main {

    public static void main(String[] args){

        HRservice hr = new HRservice();

        Programmer p =
        new Programmer(
            "Raghav",
            101,
            LocalDate.of(2019,1,1),
            "raghav@gmail.com",
            "9999999999",
            "Programmer",
            new BigDecimal("50000"),
            "Java"
        );

        Developer d =
        new Developer(
            "Aman",
            201,
            LocalDate.of(2015,1,1),
            "aman@gmail.com",
            "8888888888",
            "Developer",
            new BigDecimal("90000"),
            "Backend"
        );

        hr.add(p);
        hr.add(d);

        hr.showAll();

        hr.promoteAll();

        System.out.println("\nAfter Promotion\n");

        hr.showAll();

        hr.remove(p);
        System.out.println("\nAfter removing Employee\n");

        hr.showAll();

        hr.searchByID(101);

        Employee e = hr.searchByID(101);
        if(e != null){
            System.out.println(e.displayDetails());
        }
        else{
            System.out.println("Employee not found");
        }

    }
}