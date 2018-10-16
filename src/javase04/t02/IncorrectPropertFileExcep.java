package javase04.t02;

import java.io.IOException;

public class IncorrectPropertFileExcep extends IOException {
    @Override
    public String getMessage() {
        return "Нет ключа";
    }
}