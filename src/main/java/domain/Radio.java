package domain;

public class Radio {
    private int currentVolume;
    public int station;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getStation() {
        return station;
    }

    public void cetStartVolume(int newCurrentVolume) {
        if (currentVolume < 10) {
            newCurrentVolume = currentVolume + 1;
        }
        return;
    }

    public void cetCurrentVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return;
    }

    public void cetStartStation() {
        if (station < 9) {
            station = station + 1;
        } else {
            station = 0;
        }
        return;
    }

    public void cetStartStationMinus() {
        if (station > 1) {
            station = station - 1;
        } else {
            station = 9;
            return;
        }

    }

   












