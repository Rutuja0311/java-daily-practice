import java.util.Scanner;
class Student1{
    int rollno;
    String name;
    String[] subjects;
    int[] marks;
    public Student1(int rollno,String name,int subjectcount){
        this.rollno=rollno;
        this.name=name;
        this.subjects=new String[subjectcount];
        this.marks=new int[subjectcount];

    }
    void inputData(Scanner sc){
        sc.nextLine();
        System.out.println("Enter Subject Name and Marks for : "+name);
        for(int i=0;i<subjects.length;i++){

            System.out.println("Enter the name of "+" Subject "+(i+1));
            subjects[i]=sc.nextLine();
            System.out.println("Enter the marks of : "+subjects[i]);
            marks[i]=sc.nextInt();
            sc.nextLine();
        }
    }
    void displayreport(){
        int total=0;
        System.out.println("........Student Report...........");
        System.out.println("Roll Number: "+rollno);
        System.out.println("Name: "+name);
        System.out.println("Subject and Marks");
        for(int i=0;i<subjects.length;i++){
            System.out.println(subjects[i]+" :"+marks[i]);
            total += marks[i];
        }
        double avg=(double)total/marks.length;
        System.out.println("Total of all Subject is: "+total);
        System.out.println("Average of Total Subject is: "+avg);
        System.out.println("...................................");
    }
}
public class StudentManagement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Student you want to Add: ");
        int num=sc.nextInt();
        sc.nextLine();
        Student1[] students=new Student1[num];
        for(int i=0;i<num;i++){

            System.out.println("Enter the Details for student "+(i+1));
            System.out.print("Enter Roll Number: ");
            int rollno= sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name= sc.nextLine();
            System.out.println("Enter  Number of Subject: ");
            int subjectcount= sc.nextInt();
            students[i]=new Student1(rollno,name,subjectcount);
            students[i].inputData(sc);
        }
        System.out.println("\n Search Student Record......");
        System.out.println("Press 1 to Search by Roll Number:");
        System.out.println("Press 2 to Search by Name:");
        System.out.print("Enter Choice:");
        boolean found=false;
        int choice= sc.nextInt();
        sc.nextLine();
        if(choice==1){
            System.out.println("Enter Roll Number: ");
            int searchrn= sc.nextInt();
            for(Student1 s: students){
                if(s.rollno==searchrn){
                    s.displayreport();
                    found=true;
                    break;
                }

            }

        } else if(choice==2) {
            System.out.println("Enter Name: ");
            String sname=sc.nextLine();
            for(Student1 s: students){
                if(s.name.equalsIgnoreCase(sname)){
                    s.displayreport();
                    found=true;
                    break;
                }

            }

        }
        if(!found){
            System.out.println("Details not Found ");

        }
        System.out.println("if you want to see all details say yes");
        String say=sc.nextLine();
        if(say.equalsIgnoreCase("yes")){
            for(Student1 s : students){
                s.displayreport();
            }

        }
        sc.close();
    }
}

