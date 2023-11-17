package enums;

import lombok.Getter;

@Getter
public enum Ambiente {

    DEV("configuration-dev.yml"),
    HOM("configuration-hom.yml");

    private final String filePath;

    Ambiente(String path) {
        this.filePath = path;
    }

}
