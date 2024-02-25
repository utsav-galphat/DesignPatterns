package DesignPattern.Prototype;

public class SpecialConfig extends Config{

    private String specialToken;


    SpecialConfig(String user, String password, String url, String sessionName, int port, int account, String specialToken) {
        super(user, password, url, sessionName, port, account);
        this.specialToken = specialToken;
    }

    //copy constructor
    SpecialConfig(SpecialConfig specialConfig) {
        super(specialConfig);
        this.specialToken = specialConfig.specialToken;
    }

    public SpecialConfig clone() {
        return new SpecialConfig(this);
    }
}
