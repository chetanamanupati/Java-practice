 class Book {
    String title;
    String author;
    int price;

    Book(){
        title="Java Programming";
        author="James";
        price=500;
    }

    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
    

    public static void main(String[]args){
        Book b1=new Book();

        b1.display();
    }
}
