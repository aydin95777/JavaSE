package javase04.t02;

import java.io.IOException;

public class EmptyPropertFileExcep extends IOException {
    @Override
    public String getMessage() {
        return "Пустой файл";
    }
}