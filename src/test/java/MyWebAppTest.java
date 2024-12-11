package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Тесты для класса MyWebApp.
 */
public class MyWebAppTest {

    /**
     * Тест проверяет метод getGreeting.
     */
    @Test
    public void testGetGreeting() {
        MyWebApp app = new MyWebApp();
        String expectedGreeting = "Welcome to my Java web app!";
        assertEquals(expectedGreeting, app.getGreeting(), "Приветствие должно совпадать с ожидаемым значением");
    }
}
