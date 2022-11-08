public class DrivingLicense{
    private String name;
    private String surname;
    
    public DrivingLicense(String name_, String surname_){
        this.name = name_;
        this.surname = surname_;
    }

    public void display(){
        System.out.println("Name: "+name+", surname: "+surname); 
    }

    public void setName(String name_){
        this.name= name_;
    }

    public void setSurame(String surname_){
        this.surname= surname_;
    }

    public void getName(){
        System.out.println(this.surname);
    }

    public void getSurame(){
        System.out.println(this.name);
    }

    public static void main(String args[]){
        DrivingLicense d1 = new DrivingLicense("jan", "kowalski");
        d1.display();
        d1.setName("Elon");
        d1.display();
    }
}