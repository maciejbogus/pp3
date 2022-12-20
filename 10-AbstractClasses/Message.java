public abstract class Message{
    public String text;

    public Message(){
        this.text="";
    }

    public Message(String text_){
        this.text = text_;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int charNumber(){
        return this.text.length();
    }

    public abstract void send();

    public static void main(String[] args) {
        Sms s1 = new Sms("123123123");
        s1.setText("witam");
        s1.send();
        Sms s2 = new Sms("111222333");
        s2.send();
    }
}