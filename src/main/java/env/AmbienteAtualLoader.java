package env;

import enums.Ambiente;


public class AmbienteAtualLoader {

    private AmbienteAtualLoader() {}

    public static Ambiente get() {
        String env = System.getProperty("env");
        return switch (env != null ? env.toLowerCase() : "") {
            case "dev" -> Ambiente.DEV;
            default -> Ambiente.HOM;
        };
    }


}
