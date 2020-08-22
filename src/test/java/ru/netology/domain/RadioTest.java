package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetNoMaxVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 51;
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    void shouldSetNoMinVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expected = 49;
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    void shouldSetMaxStation() {
        Radio radio = new Radio(
                15,
                15,
                0,
                50,
                100,
                0
        );
        radio.increaseStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    void shouldSetNextStation() {
        Radio radio = new Radio(
                10,
                15,
                0,
                50,
                100,
                0);
        radio.increaseStation();
        int expected = 11;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetPrevStation() {
        Radio radio = new Radio(
                10,
                15,
                0,
                50,
                100,
                0
        );
        radio.decreaseStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    void shouldSetOverMinStation() {
        Radio radio = new Radio(
                0,
                15,
                0,
                50,
                100,
                0);
        radio.decreaseStation();
        int expected = 15;
        assertEquals(expected, radio.getCurrentStation());
    }
}