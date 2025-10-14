import java.util.Scanner;
class Subject{
    int subjectMarks;
    int credits;
    int grade;
}
class Student{
    String name;
    String USN;
    double SGPA;
    Scanner s;
    Subject subject[];
    Student(){
        s=new Scanner(System.in);
        subject= new Subject[8];
        for(int i=0;i<8;i++){
            subject[i]=new Subject();
        }
    }
    void getstudentdetails(){
        System.out.print("Enter student name:");
        name=s.nextLine();
        System.out.print("Enter student USN:");
        USN=s.nextLine();


    }
    void getmarks(){
        for(int i=0;i<8;i++){
            System.out.println("Enter marks for subject"+(i+1)+":");
            subject[i].subjectMarks=s.nextInt();
            System.out.println("Enter credits for subject"+(i+1)+":");
            subject[i].credits=s.nextInt();
            subject[i].grade=(subject[i].subjectMarks/10)+1;
            if (subject[i].grade==11){
                subject[i].grade=10;
            }
            if (subject[i].grade<=4){
                subject[i].grade=0;
            }
        }
    }
    void computeSGPA(){
        int Score=0;
        int TotalCredits=0;
        for(int i=0;i<8;i++){
            Score+=(subject[i].grade*subject[i].credits);
            TotalCredits+=subject[i].credits;
        }
        SGPA=(double)Score/(double)TotalCredits;
    }
    void display(){
        System.out.println("Student details:");
        System.out.println("Name: "+name);
        System.out.println("USN: "+USN);
        System.out.println("SGPA: "+ SGPA);

    }
}
 public class studentSGPAcal{
    public static void main(String args[]){
        Student student1=new Student();
        Student student2=new Student();
        student1.getstudentdetails();
        student1.getmarks();
        student1.computeSGPA();
        student1.display();
        student2.getstudentdetails();
        student2.getmarks();
        student2.computeSGPA();
        student2.display();
    }
}
