package domain;

public class Radio {
    private int id = 1;
    private int currentVolume = 10;
    private int station = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int quantityStation = 10;
    private int minStation = 0;

    public Radio() {

    }

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getStation() {
        return station;
    }
    public int getQuantityStation (int quantityStation) {return quantityStation;}

    public int setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = minVolume;
        }
        if (currentVolume > 100) {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int setStation(int station) {
        if (station < 0) {
            station = quantityStation-1;
            return station;
        }
        if (station > quantityStation-1) {
            station = minStation;
            return station;
        }
        return station;
    }

    public int setIncreaseVolume(int currentVolume) {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int setMinusVolume(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
        return currentVolume;
    }

    public int setStationMinus(int station ) {
        if (station > 0) {
            station = station - 1;

        } else {
            station = quantityStation-1;
        }
        return station;
    }

    public int setIncreaseStation(int station) {
        if (station < quantityStation-1) {
            station = station + 1;

        } else {
            station = minStation;
        }
        return station;
    }
}




























