public class Manager extends Employee {

    void manage() {
        System.out.println("Manager is managing the team");
    }

    public static void main(String[] args) {

        Manager m1 = new Manager();

        m1.work();
        m1.manage();

    }
}
