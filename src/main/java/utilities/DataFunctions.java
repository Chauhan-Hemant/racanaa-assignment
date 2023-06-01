package utilities;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DataFunctions {

    private HashMap<String,String> testData = new HashMap<>();
    public Map<String, String> loadConfig() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        try {
            Map<String, Object> jsonMap = mapper.readValue(new File(System.getProperty("user.dir") + "" +
                    File.separator + "src" + File.separator + "main" +
                    File.separator + "resources" + File.separator + "configData.json"), Map.class);
            Map<String, Object> newJsonMap = new HashMap<>();
            readConfig("", mapper.readTree(mapper.writeValueAsString(jsonMap)), newJsonMap);
            for (Map.Entry<String, Object> entry : newJsonMap.entrySet()) {
                testData.put(entry.getKey(), (String) entry.getValue());
            }
            return testData;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void readConfig(String prefix, JsonNode node, Map<String, Object> newJsonMap) {
        if (node.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                if (!prefix.isEmpty()) {
                    readConfig(prefix + "." + entry.getKey(), entry.getValue(), newJsonMap);
                } else {
                    readConfig(entry.getKey(), entry.getValue(), newJsonMap);
                }
            }
        } else if (node.isArray()) {
            for (int i = 0; i < node.size(); i++) {
                readConfig(prefix + "." + i, node.get(i), newJsonMap);
            }
        } else if (node.isValueNode()) {
            newJsonMap.put(prefix, node.asText());
        }
    }

    public Map<String, String> readJsonTestData(String filePath){
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            File jsonFile = new File(System.getProperty("user.dir") + ""+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+""+filePath+".json");
            testData = objectMapper.readValue(jsonFile, new TypeReference<HashMap<String,String>>(){});
            return testData;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
