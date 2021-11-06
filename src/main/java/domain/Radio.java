package domain;

public class Radio {
    private int id = 1;
    private int currentVolume = 10;
    private int station = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int quantityStation = 10;
    private int maxStation = quantityStation - 1;
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

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            this.currentVolume = minVolume;
            return;
        }
        if (currentVolume > 100) {
            this.currentVolume = maxVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setStation(int station) {
        if (station < 0) {
            this.station = maxStation;
            return;
        }
        if (station > maxStation) {
            this.station = minStation;
            return;
        }
        this.station = station;
    }

    public int setIncreaseVolume() {
        if (currentVolume < 100) {
            return currentVolume + 1;
        } else {
            return maxVolume;
        }
    }

    public int setMinusVolume() {
        if (currentVolume > 0) {
            return currentVolume - 1;
        } else {
            return minVolume;
        }
    }

    public int setStationMinus() {
        if (station > 0) {
            return station - 1;
        } else {
            return maxStation;
        }
    }

    public int setIncreaseStation() {
        if (station < maxStation) {
            return station + 1;
        } else {
            return minStation;
        }
    }
}


























