import java.util.Scanner;
class Books{
    String name,author;
    int price,num_pages;
    Books(String name, String author, int price, int num_pages){
       
        this.name=name;
        this.author=author;
        this.price=price;
        this.num_pages=num_pages;
    }
    public String toString(){
        String name,author, price, num_pages;
        name="Book name:"+this.name+"\n";
        author="Author name: "+this.author+"\n";
        price="Price: "+this.price+"\n";
        num_pages="Number of Pages: "+this.num_pages+"\n";
        return name+author+price+num_pages;
    }
}
public class toStringDemo {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n, price, num_pages;
        String name, author;
        System.out.println("Enter the number of books: ");
        n=s.nextInt();
        Books b[];
        b=new Books[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the book "+(i+1)+" name: ");
            name=s.next();
            System.out.println("Enter the book "+(i+1)+" author: ");
            author=s.next();
            System.out.println("Enter the book "+(i+1)+" price: ");
            price=s.nextInt();
            System.out.println("Enter the number of pages in book "+(i+1)+" : ");
            num_pages=s.nextInt();
            b[i]=new Books(name,author,price,num_pages);
        }
        for(int i=0;i<n;i++){
            System.out.println(b[i]);

        }

    }
    
}
