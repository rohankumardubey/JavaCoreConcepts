package com.company.YamlModification;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class YamlEngine {

    public void parseYaml(String path, YamlReader.podMemory podSize) throws IOException {
        ObjectMapper objectMapper = new YAMLMapper();
        // read YAML file
        Map<String, Object> yaml = objectMapper.readValue(new File(path),new TypeReference<>() {});
        Map<String, Object> bootstrap = (Map<String, Object>) yaml.get("bootstrap");
        Map<String, Object> resources = (Map<String, Object>) yaml.get("resources");
        Map<String, Object> limits = (Map<String, Object>) resources.get("limits");
        Map<String, Object> requests = (Map<String, Object>) resources.get("requests");
        if(podSize== YamlReader.podMemory.SMALL){
            limits.put("cpu", 4);
            limits.put("memory","6Gi");
            requests.put("cpu", 4);
            requests.put("memory","6Gi");
            bootstrap.put("minHeap","-Xms2048m");
            bootstrap.put("maxHeap","-Xmx4096m");
        }
        else if(podSize== YamlReader.podMemory.MEDIUM){
            limits.put("cpu", 8);
            limits.put("memory", "12Gi");
            requests.put("cpu", 4);
            requests.put("memory","6Gi");
            bootstrap.put("minHeap","-Xms4096m");
            bootstrap.put("maxHeap","-Xmx9216m");
        }
        else if(podSize== YamlReader.podMemory.LARGE){
            limits.put("cpu", 12);
            limits.put("memory", "16Gi");
            requests.put("cpu", 4);
            requests.put("memory","6Gi");
            bootstrap.put("minHeap","-Xms4096m");
            bootstrap.put("maxHeap","-Xmx12288m");
        }
        objectMapper.writeValue(new File(path), yaml);

    }
}