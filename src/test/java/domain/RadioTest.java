package domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio service = new Radio();

    @Test
     void shouldGetCurrentVolume (){

        service.getCurrentVolume();
        int expected = 9;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetStation(){
        service.getStation();
        int expected = 0;
        int actual = service.getStation();
        assertEquals(expected, actual);
    }
    @Test

    void shouldCetStartVolume(){
        service.cetStartVolume();
        int expected = 9;
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
        int station = 5;
       int expected = 0;
        int actual = service.cetStartStation();
        assertEquals(expected, actual);
    }
    @Test
       void shouldCetStartStation_two(){
        service.cetStartStation();
        int station = 0;
        int expected = 0;
        int actual = service.cetStartStation();
        assertEquals(expected, actual);
         }
    @Test
    void shouldCetStartStation_three(){
        service.cetStartStation();
        int station = 10;
        int expected = 0;
        int actual = service.cetStartStation();
        assertEquals(expected, actual);}


        @Test
        void shouldCetStartStationMinus_one(){

        service.cetStartStationMinus();
        int station = 0;
        int expected = 9;
        int actual = service.cetStartStationMinus();
        assertEquals(expected, actual);
    }
    @Test
    void shouldCetStartStationMinus_two(){

        service.cetStartStationMinus();
        int station = 10;
        int expected = 9;
        int actual = service.cetStartStationMinus();
        assertEquals(expected, actual);
    }
}