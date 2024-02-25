package DesignPattern.Prototype;

public class Client {

    public static void main(String[] args) {
        RegistryConfig registryConfig = new RegistryConfig();

        Config config = registryConfig.getConfig("config");
        Config specialConfig = registryConfig.getConfig("specialConfig");

        Config  config1 = config.clone();
        Config specialConfig1 = specialConfig.clone();

        System.out.println(config1);
    }

}
