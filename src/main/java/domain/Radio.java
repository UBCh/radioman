package domain;

public class Radio {
    private int currentVolume = 5;
    public int station;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getStation() {
        return station;
    }

    public int cetStartVolume() {
        if (currentVolume < 10){}
        return currentVolume+ 1 ;
    }

    public int cetCurrentVolume() {
        if (currentVolume > 0) {}
        return currentVolume-1;
    }

    public int cetStartStationMinus() {
        if (station > 0) {
       station =station - 1;
       if (station< 0){ station =9;}}
                return station;
    }
    public int cetStartStation() {
        if (station < 10) {
            station = station + 1;
            if (station > 10){ station =0;}}
       return station;
        }


    }

























