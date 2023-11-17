package enums;


import lombok.Getter;

@Getter
public enum Servico {

    BASE_URL_1("baseUrl1"),
    BASE_URL_2("baseUrl2");

    private final String path;

    Servico(String path) {
        this.path = path;
    }

}
