package domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio service = new Radio(1, 10, 1, 100, 0,10,9,0);

       @Test
         void shouldGetCurrentVolume (){
        service.getCurrentVolume();
        int expected = 10;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    void shouldGetStation(){
        service.getStation();
        int expected = 1;
        int actual = service.getStation();
        assertEquals(expected, actual);
    }
   @Test
    void shouldSetStation_one (){
           service.setStation(10);
       int expected = 0;
       int actual = service.getStation ();
       assertEquals(expected, actual);
   }

   @Test
    void shouldSetStation_two (){
        service.setStation(-1);
        int expected = 9;
        int actual = service.getStation ();
        assertEquals(expected, actual);
    }
    @Test
    void shouldSetStation_three (){
        service.setStation(8);
        int expected = 8;
        int actual = service.getStation ();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume_one (){
        service.setCurrentVolume(101);
        int expected = 100;
        int actual = service.getCurrentVolume ();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume_two (){
        service.setCurrentVolume(-1);
        int expected = 0;
        int actual = service.getCurrentVolume ();
        assertEquals(expected, actual);
    }
    @Test
    void shouldSetCurrentVolume_three (){
        service.setCurrentVolume(50);
        int expected = 50;
        int actual = service.getCurrentVolume ();
        assertEquals(expected, actual);
    }

    @Test

    void shoulSetIncreaseVolume_one(){
        service.setCurrentVolume(101);
        service.setIncreaseVolume();
        int expected = 100;
        int actual = service.setIncreaseVolume ();
        assertEquals(expected, actual);
    }
    @Test

    void shoulSetIncreaseVolume_two(){
        service.setCurrentVolume(100);
        service.setIncreaseVolume();
        int expected = 100;
        int actual = service.setIncreaseVolume ();
        assertEquals(expected, actual);
    }

    @Test

    void shouldCetStartVolume_three(){
        service.setCurrentVolume(0);
        service.setIncreaseVolume();
        int expected = 1;
        int actual = service.setIncreaseVolume ();
        assertEquals(expected, actual);
    }
    @Test

    void shouldSetMinusVolume_one(){
        service.setCurrentVolume(-1);
        service.setMinusVolume();
        int expected = 0;
        int actual = service.setMinusVolume();
        assertEquals(expected, actual);
    }
    @Test

    void shouldCetMinusVolume_two(){
        service.setCurrentVolume(0);
        service.setMinusVolume();
        int expected = 0;
        int actual = service.setMinusVolume();
        assertEquals(expected, actual);
    }
    @Test

    void shouldCetMinusVolume_three(){
        service.setCurrentVolume(10);
        service.setMinusVolume();
        int expected = 9;
        int actual = service.setMinusVolume();
        assertEquals(expected, actual);
    }

        @Test
        void shouldsetStationMinus_one(){
           service.setStation(0);
           service.setStationMinus();
        int expected = 9;
        int actual = service.setStationMinus();
        assertEquals(expected, actual);
    }
    @Test
    void shouldCetStartStationMinus_two(){
        service.setStation(1);
        service.setStationMinus();
        int expected = 0;
        int actual = service.setStationMinus();
        assertEquals(expected, actual);
    }
    @Test
    void shouldCetStartStationMinus_three(){
        service.setStation(9);
        service.setStationMinus();
        int expected = 8;
        int actual = service.setStationMinus();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetIncreaseStation_one(){
        service.setStation(9);
           service. setIncreaseStation();
        int expected = 0;
        int actual = service. setIncreaseStation();
        assertEquals(expected, actual);
    }
    @Test
    void SetIncreaseStation_two(){
        service.setStation(0);
        service. setIncreaseStation();
        int expected = 1;
        int actual = service. setIncreaseStation();
        assertEquals(expected, actual);
    }
    @Test
       void SetIncreaseStation_three() {
        service.setStation(5);
        service.setIncreaseStation();
        int expected = 6;
        int actual = service.setIncreaseStation();
        assertEquals(expected, actual);
    }
}