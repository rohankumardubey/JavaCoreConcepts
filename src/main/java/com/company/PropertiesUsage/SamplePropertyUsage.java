package com.company.PropertiesUsage;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class SamplePropertyUsage {
    private static final Properties KubernetesProperties = new Properties();
    private static Map<String, Object> clientDefaultConfigs = getDefaultPropsKeyValue();

    static {
        DefaultConfigProps();
    }

    private static void DefaultConfigProps() {
        try (InputStream in = SamplePropertyUsage.class.getClassLoader()
                .getResourceAsStream("Kubernetes.properties")) {
            KubernetesProperties.load(in);
        } catch (IOException e) {
            setDefaultConfigFunc();
        } catch (Exception e) {
            setDefaultConfigFunc();
        }
    }

    private static void setDefaultConfigFunc() {
        setDefaultConfig();
    }

    private static void setDefaultConfig() {
        addConfigProp("kubernetes.disable.autoConfig", "false");
        addConfigProp("kubernetes.master", "https://masterurl:1234");
        addConfigProp("kubernetes.api.version", "v1");
        addConfigProp("kubernetes.trust.certificates", "false");
        addConfigProp("kubernetes.disable.hostname.verification", "false");
        addConfigProp("kubernetes.certs.client.key.algo", "RSA");

    }

    private static void addConfigProp(String key, String value) {
        KubernetesProperties.setProperty(key, value);
    }

    public static Map<String, Object> getDefaultConfig() {
        return getDefaultConfigProps();
    }


    private static Map<String, Object> getDefaultConfigProps() {
//        if (KubernetesProperties.isEmpty()) return new HashMap<>();
//        if (clientDefaultConfigs != null) return clientDefaultConfigs;
        return clientDefaultConfigs = getDefaultPropsKeyValue();
    }

    private static Map<String, Object> getDefaultPropsKeyValue() {
        Map<String, Object> props = new HashMap<>();
        KubernetesProperties.forEach((key, value) -> {
            String propKey = (String) key;
            props.put(propKey, value);
        });
        return props;
    }

}
