package domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
    void shouldCetCurrentVolume_one (){
        service.cetCurrentVolume(11);
        int expected = 0;
        int actual = service.getCurrentVolume ();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCetCurrentVolume_two (){
        service.cetCurrentVolume(-1);
        int expected = 0;
        int actual = service.getCurrentVolume ();
        assertEquals(expected, actual);
    }
    @Test
    void shouldCetCurrentVolume_three (){
        service.cetCurrentVolume(5);
        int expected = 5;
        int actual = service.getCurrentVolume ();
        assertEquals(expected, actual);
    }

    @Test

    void shouldCetStartVolume_one(){
        service.cetCurrentVolume(11);
        service.cetStartVolume();
        int expected = 1;
        int actual = service.cetStartVolume ();
        assertEquals(expected, actual);
    }
    @Test

    void shouldCetStartVolume_two(){
        service.cetCurrentVolume(0);
        service.cetStartVolume();
        int expected = 1;
        int actual = service.cetStartVolume ();
        assertEquals(expected, actual);
    }

    @Test

    void shouldCetStartVolume_three(){
        service.cetCurrentVolume(10);
        service.cetStartVolume();
        int expected = 10;
        int actual = service.cetStartVolume ();
        assertEquals(expected, actual);
    }
    @Test

    void shouldCetMinusVolume_one(){
        service.cetCurrentVolume(-1);
        service.cetMinusVolume();
        int expected = 0;
        int actual = service.cetMinusVolume();
        assertEquals(expected, actual);
    }
    @Test

    void shouldCetMinusVolume_two(){
        service.cetCurrentVolume(0);
        service.cetMinusVolume();
        int expected = 0;
        int actual = service.cetMinusVolume();
        assertEquals(expected, actual);
    }
    @Test

    void shouldCetMinusVolume_three(){
        service.cetCurrentVolume(10);
        service.cetMinusVolume();
        int expected = 9;
        int actual = service.cetMinusVolume();
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