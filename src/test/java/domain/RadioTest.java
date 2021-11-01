package domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio service = new Radio();

       @Test
         void shouldGetCurrentVolume (){
        service.getCurrentVolume();
        int expected = 5;
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
    void shouldCetStation_one (){
           service.cetStation(11);
       int expected = 0;
       int actual = service.getStation ();
       assertEquals(expected, actual);
   }
    @Test
    void shouldCetStation_two (){
        service.cetStation(-1);
        int expected = 0;
        int actual = service.getStation ();
        assertEquals(expected, actual);
    }
    @Test
    void shouldCetStation_three (){
        service.cetStation(8);
        int expected = 8;
        int actual = service.getStation ();
        assertEquals(expected, actual);
    }
    @Test

    void shouldCetStartVolume(){
        service.cetStartVolume();
        int expected = 6;
        int actual = service.cetStartVolume ();
        assertEquals(expected, actual);
    }

    @Test

    void shouldCetCurrentVolume(){
        Radio service = new Radio();
        service.cetCurrentVolume();
        int expected = 4;
        int actual = service.cetCurrentVolume();
        assertEquals(expected, actual);
    }


        @Test
        void shouldCetStartStationMinus_one(){
           service.cetStation(10);
           service.cetStartStationMinus();
        int expected = 9;
        int actual = service.cetStartStationMinus();
        assertEquals(expected, actual);
    }
    @Test
    void shouldCetStartStationMinus_two(){
        service.cetStation(1);
        service.cetStartStationMinus();
        int expected = 0;
        int actual = service.cetStartStationMinus();
        assertEquals(expected, actual);
    }
    @Test
    void shouldCetStartStationMinus_three(){
        service.cetStation(0);
        service.cetStartStationMinus();
        int expected = 9;
        int actual = service.cetStartStationMinus();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCetStartStation_one(){
        service.cetStation(0);
           service.cetStartStation();
        int expected = 1;
        int actual = service.cetStartStation();
        assertEquals(expected, actual);
    }
    @Test
    void shouldCetStartStation_two(){
        service.cetStation(8);
        service.cetStartStation();
        int expected = 9;
        int actual = service.cetStartStation();
        assertEquals(expected, actual);
    }
    @Test
       void shouldCetStartStation_three(){
        service.cetStation(9);
        service.cetStartStation();
        int expected = 0;
        int actual = service.cetStartStation();
        assertEquals(expected, actual);}


}