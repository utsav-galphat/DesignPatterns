package DesignPattern.Prototype;

import java.util.HashMap;

public class RegistryConfig {

    private HashMap<String, Config> configMap;

    public RegistryConfig() {
        configMap = new HashMap<>();

        Config config = new Config("user", "password", "url", "sessionName",
                8080, 1234);
        SpecialConfig specialConfig = new SpecialConfig("specialUser", "specialPassword", "specialUrl", "specialSession",
                8088, 4321, "specialToken");

        registerConfig("config", config);
        registerConfig("specialConfig", specialConfig);
    }

    public void registerConfig(String key, Config config) {
        configMap.put(key, config);
    }

    public Config getConfig(String key) {
        return (Config) configMap.get(key).clone();
    }
}
