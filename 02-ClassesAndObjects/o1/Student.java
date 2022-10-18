public class Student{

    //atrybuty
    String name="Jan";
    int age=0;
    String studentID="000000";
    boolean isValid=false;
    int semesterNr=1;
    double avgGrade;
    
    
    //metody
    public void info(){
        //name
        System.out.println("Name: "+name);
        //sem num
        System.out.println("Semester number: "+semesterNr);
        //avg grade
        System.out.println("Avarage grade: "+avgGrade);
    }
    
    public void changeIdStatus(){
        if(isValid == true) isValid=false;
        else isValid=true;
    }
    
    public void displayStudentStatus(){
        System.out.println("Name: "+name+"\nID number: "+studentID);
        if(isValid == true) System.out.println("ID valid");
        else System.out.println("ID invalid\n");
    }
    
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Mati";
        s1.age = 20;
        s1.studentID = "432432";
        s1.semesterNr= 3;
        s1.avgGrade = 3.1;
        s1.displayStudentStatus();
        s1.changeIdStatus();
        s1.displayStudentStatus();
    }
}

