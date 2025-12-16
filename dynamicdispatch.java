class parent{
    public void greet(){
        System.out.println("Hello from parent!");
    }
}
class child extends parent{
    public void greet(){
        System.out.println();    
        System.out.println("Hello from child!");
    }
}
public class dynamicdispatch {
    public static void main(String[] args) {
        parent t1= new child();
        t1.greet();
    }
}
