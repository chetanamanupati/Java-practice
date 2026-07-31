import java.util.HashMap;

public class HashMapEmployee {
    public static void main(String[]args){
        HashMap<Integer,String>employees= new HashMap<>();

        employees.put(201,"Arjun");
        employees.put(202,"Meera");
        employees.put(203,"Kiran");
        employees.put(204,"Sneha");

        System.out.println(employees);

        System.out.println(employees.put(202,"Riya"));
        
        System.out.println(employees);
    
    }
}
