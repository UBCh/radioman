package domain;

public class Radio {
    private int currentVolume = 0;
    private int station = 0;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getStation() {
        return station;
    }

    public int setStation(int newStation) {
        if (newStation < 0) {

            newStation = 9;
        }
        if (newStation > 9) {
            newStation = 0;
        }
        station = newStation;
        return station;
    }

    public int setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        currentVolume = newCurrentVolume;
        return currentVolume;
    }

    public int setStartVolume() {
        int volume = 0;
        if (currentVolume < 10) {
            volume = currentVolume + 1;
        } else {
            volume = 10;

        }
        return volume;
    }


    public int setMinusVolume() {
        int volume = 0;
        if (currentVolume > 0) {
            volume = currentVolume - 1;
        } else {
            volume = 0;

        }
        return volume;
    }

    public int setStartStationMinus() {
        int stan = 0;
        if (station > 0) {
            stan = station - 1;
        } else {
            stan = 9;
        }
        return stan;
    }

    public int setStartStation() {
        int stan = 0;
        if (station < 9) {
            stan = station + 1;
        } else {
            stan = 0;

        }
        return stan;

    }

}




























