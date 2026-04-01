package service;
import model.Employee;
import model.Promotion;
import java.util.ArrayList;

public class HRservice {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void add(Employee e){
        employees.add(e);
    }

    public void remove(Employee e){
        employees.remove(e);
    }

    public Employee searchByID(int id){
        for (Employee e: employees){
            if (e.getID() == id){
                return e;
            }
        }
        return null;
    }

    public void showAll(){
        for(Employee e : employees){
            System.out.println(e.displayDetails());
        }
    }

    public void promoteAll(){

        for(Employee e : employees){

            if(e instanceof Promotion){

                ((Promotion)e).promote(e);
            }
        }
    }
}