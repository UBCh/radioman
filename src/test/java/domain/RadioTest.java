package domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio service = new Radio();

    @Test
    void shouldGetCurrentVolume() {
        int expected = 0;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetStation() {
        int expected = 0;
        int actual = service.getStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationOne() {
        int expected = 0;
        int actual = service.setStation(11);
        ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationTwo() {
        int expected = 9;
        int actual = service.setStation(-1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationThree() {
        int expected = 8;
        int actual = service.setStation(8);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeOne() {
        int expected = 10;
        int actual = service.setCurrentVolume(11);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeTwo() {
        int expected = 0;
        int actual = service.setCurrentVolume(-1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeThree() {
        int expected = 5;
        int actual = service.setCurrentVolume(5);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStartVolume_one() {
        service.setCurrentVolume(11);
        int expected = 10;
        int actual = service.setStartVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStartVolumeTwo() {
        service.setCurrentVolume(0);
        int expected = 1;
        int actual = service.setStartVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStartVolumeThree() {
        service.setCurrentVolume(10);
        int expected = 10;
        int actual = service.setStartVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMinusVolumeOne() {
        service.setCurrentVolume(-1);
        int expected = 0;
        int actual = service.setMinusVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMinusVolumeTwo() {
        service.setCurrentVolume(0);
        int expected = 0;
        int actual = service.setMinusVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMinusVolumeThree() {
        service.setCurrentVolume(10);
        int expected = 9;
        int actual = service.setMinusVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStartStationMinusOne() {
        service.setStation(10);
        int expected = 9;
        int actual = service.setStartStationMinus();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStartStationMinusTwo() {
        service.setStation(1);
        int expected = 0;
        int actual = service.setStartStationMinus();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStartStationMinusThree() {
        service.setStation(0);
        int expected = 9;
        int actual = service.setStartStationMinus();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStartStationOne() {
        service.setStation(0);
        int expected = 1;
        int actual = service.setStartStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStartStationTwo() {
        service.setStation(8);
        int expected = 9;
        int actual = service.setStartStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStartStationThree() {
        service.setStation(9);
        int expected = 0;
        int actual = service.setStartStation();
        assertEquals(expected, actual);
    }
}
