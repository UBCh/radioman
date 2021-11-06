package domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio service = new Radio();

    @Test
    void shouldGetCurrentVolume() {
        service.getCurrentVolume();
        int expected = 0;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetStation() {
        service.getStation();
        int expected = 0;
        int actual = service.getStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStation_one() {
        service.setStation(11);
        int expected = 0;
        int actual = service.getStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStation_two() {
        service.setStation(-1);
        int expected = 0;
        int actual = service.getStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStation_three() {
        service.setStation(8);
        int expected = 8;
        int actual = service.getStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume_one() {
        service.setCurrentVolume(11);
        int expected = 0;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume_two() {
        service.setCurrentVolume(-1);
        int expected = 0;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume_three() {
        service.setCurrentVolume(5);
        int expected = 5;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStartVolume_one() {
        service.setCurrentVolume(11);
        service.setStartVolume();
        int expected = 1;
        int actual = service.setStartVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStartVolume_two() {
        service.setCurrentVolume(0);
        service.setStartVolume();
        int expected = 1;
        int actual = service.setStartVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStartVolume_three() {
        service.setCurrentVolume(10);
        service.setStartVolume();
        int expected = 10;
        int actual = service.setStartVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMinusVolume_one() {
        service.setCurrentVolume(-1);
        service.setMinusVolume();
        int expected = 0;
        int actual = service.setMinusVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMinusVolume_two() {
        service.setCurrentVolume(0);
        service.setMinusVolume();
        int expected = 0;
        int actual = service.setMinusVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMinusVolume_three() {
        service.setCurrentVolume(10);
        service.setMinusVolume();
        int expected = 9;
        int actual = service.setMinusVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStartStationMinus_one() {
        service.setStation(10);
        service.setStartStationMinus();
        int expected = 9;
        int actual = service.setStartStationMinus();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStartStationMinus_two() {
        service.setStation(1);
        service.setStartStationMinus();
        int expected = 0;
        int actual = service.setStartStationMinus();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStartStationMinus_three() {
        service.setStation(0);
        service.setStartStationMinus();
        int expected = 9;
        int actual = service.setStartStationMinus();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStartStation_one() {
        service.setStation(0);
        service.setStartStation();
        int expected = 1;
        int actual = service.setStartStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStartStation_two() {
        service.setStation(8);
        service.setStartStation();
        int expected = 9;
        int actual = service.setStartStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStartStation_three() {
        service.setStation(9);
        service.setStartStation();
        int expected = 0;
        int actual = service.setStartStation();
        assertEquals(expected, actual);
    }


}
