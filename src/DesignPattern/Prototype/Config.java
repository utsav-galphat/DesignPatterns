package DesignPattern.Prototype;

public class Config {
    private String user;
    private String password;
    private String url;
    private String sessionName;
    private int port;
    private int account;

    Config(String user, String password, String url, String sessionName, int port, int account) {
        this.user = user;
        this.password = password;
        this.url = url;
        this.sessionName = sessionName;
        this.port = port;
        this.account = account;
    }

    //copy constructor
    Config(Config config) {
        this.user = config.user;
        this.password = config.password;
        this.url = config.url;
        this.sessionName = config.sessionName;
        this.port = config.port;
        this.account = config.account;
    }

    public Config clone() {
        return new Config(this);
    }
}
