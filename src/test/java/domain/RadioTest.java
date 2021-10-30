package domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import domain.Radio;
class RadioTest {
    Radio service = new Radio();

    @Test
     void shouldGetCurrentVolume (){

        service.getCurrentVolume();
        int expected = 0;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetStation(){

        int station = 5;
        int expected = 0;
        int actual = service.getStation();
        assertEquals(expected, actual);
    }
    @Test
    void shouldCetStartVolume(){

        service.cetStartVolume(10);
        int expected = 0;
        int actual = service.cetStartVolume();
        assertEquals(expected, actual);
    }
    @Test
    void shouldCetCurrentVolume(){
        Radio service = new Radio();
        service.cetCurrentVolume();
        int expected = 0;
        int actual = service.cetCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCetStartStation_one(){
        service.cetStartStation();
       int expected = 0;
        int actual = service.cetStartStation();
        assertEquals(expected, actual);
    }
    @Test
    void shouldCetStartStation_two(){

        service.cetStartStation();
        int expected = 9;
        int actual = service.cetStartStation();
        assertEquals(expected, actual);
    }
    @Test
    void shouldCetStartStationMinus_one(){

        service.cetStartStationMinus(0);
        int expected = 9;
        int actual = service.cetCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    void shouldCetStartStationMinus_two(){

        service.cetStartStationMinus(-1);
        int expected = 9;
        int actual = service.cetStartStationMinus();
        assertEquals(expected, actual);
    }
}