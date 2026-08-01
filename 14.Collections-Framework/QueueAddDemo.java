import java.util.Queue;
import java.util.LinkedList;

public class QueueAddDemo {
    public static void main(String[]args){
        Queue<String> queue=new LinkedList<>();

        queue.add("Java");
        queue.add("SQL");
        queue.add("DBMS");
        queue.add("Spring Boot");

        System.out.println(queue);
    }
}
