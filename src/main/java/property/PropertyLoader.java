package property;

import enums.Ambiente;
import enums.Servico;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class PropertyLoader {

    private PropertyLoader() {}
    public static PropertyLoader get() {
        return new PropertyLoader();
    }

    public String getUrl(Ambiente ambiente, Servico servico) {
        try (InputStream inputStream = getClass().getResourceAsStream(ambiente.getFilePath())) {
            if (inputStream != null) {
                Yaml yaml = new Yaml();
                Map<String, Object> root = yaml.load(inputStream);
                if (root != null) {
                    Map<String, Object> services = (Map<String, Object>) root.get("services");
                    Map<String, String> service = (Map<String, String>) root.get(servico.getPath());
                    if (services != null && service != null) {
                        return service.get("url");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception according to your application's needs
        }
        return null; // or throw an exception indicating property loading failure
    }
}
