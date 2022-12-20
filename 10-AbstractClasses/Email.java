public class Email extends Message{
    private String subject;
    private String recipient_address;

    public Email(String text_, String subject_, String recipient_address_){
        super(text_);
        this.subject = subject_;
        this.recipient_address = recipient_address_;
    }

    public String getRecipient_address() {
        return recipient_address;
    }

    public void setRecipient_address(String recipient_address) {
        this.recipient_address = recipient_address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void send() {
        System.out.println("Sending to "+this.recipient_address);
        System.out.println("Subject "+this.subject);
        System.out.println("Message: "+this.text);
    }
}