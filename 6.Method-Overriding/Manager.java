public class Manager extends Employee {
    @Override

    void work(){
        super.work();

        System.out.println("Manager is managing the team");
    }
    public static void main(String[]args){
        Manager m1= new Manager();

        m1.work();
    }
    
}
