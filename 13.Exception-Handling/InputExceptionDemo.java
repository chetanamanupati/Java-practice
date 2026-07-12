public class InputExceptionDemo {
    public static void main(String[]args){
        System.out.println("Program started");
    try{
        int[]arr={10,20,30};
        System.out.println(arr[5]);
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Invalid Index");
    }
    System.out.println("Program Ended");
}
}
