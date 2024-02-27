package org.example.logging;

public class DBLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Veritabanına loglandı : " + data);
    }
}
