package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetNoMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int expected = 6;
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    void shouldSetNoMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int expected = 4;
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    void shouldSetMaxStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);
        radio.increaseStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setCurrentStation(2);
        radio.increaseStation();
        int expected = 3;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setCurrentStation(2);
        radio.decreaseStation();
        int expected = 1;
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    void shouldSetOverMinStation() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setCurrentStation(0);
        radio.decreaseStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentStation());
    }
}