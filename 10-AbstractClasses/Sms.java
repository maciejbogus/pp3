public class Sms extends Message{
    private String phone_number;

    public Sms(String phone_number_){
        this.phone_number = phone_number_;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public void send() {
        System.out.println("Sending to "+this.phone_number);
        System.out.println("Message: "+this.text);
    }
}