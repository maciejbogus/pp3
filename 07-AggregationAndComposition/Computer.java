class Computer{
    private String system;
    private String caseColor;
    private boolean isOn=false;
    Procesor p1;

    public Computer(String system_, String caseColor_){
        this.system = system_;
        this.caseColor = caseColor_;
        this.p1 = new Procesor();
    }
    public String getCaseColor() {
        return caseColor;
    }

    public String getSystem() {
        return system;
    }

    public void setCaseColor(String casecolor) {
        this.caseColor = casecolor;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }
}