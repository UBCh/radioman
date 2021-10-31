package domain;

public class Radio {
    private int currentVolume = 9;
    public int station;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getStation() {
        return station;
    }

    public int cetStartVolume() {
        if (currentVolume < 10) {
            int newCurrentVolume = currentVolume + 1;
        }
        return 9;
    }

    public int cetCurrentVolume() {
        if (currentVolume > 0) {
            int newCurrentVolume = currentVolume - 1;
        }
        return 0;
    }

    public int cetStartStationMinus() {
        if (station > 0) {
            station = station - 1;
        }
        station = 9;
        return station;
    }
    public int cetStartStation() {
        if (station < 10) {
            station = station + 1;
        }

        return 0;
    }


    }






















