package domain;

public class Radio {
    private int currentVolume=0;
    private int station =0;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getStation() {
        return station;
    }

    public void cetStation (int newStation) {
        if ( newStation < 0) { return;}
        if ( newStation > 9) { return;}
            station = newStation;
    }
    public void cetCurrentVolume (int newCurrentVolume) {
        if ( newCurrentVolume < 0) { return;}
        if ( newCurrentVolume > 10) { return;}
        currentVolume = newCurrentVolume;
    }

    public int cetStartVolume() {
        if (currentVolume < 10) {return currentVolume +1;}
        else { return 10 ;}
        }


    public int cetMinusVolume() {
        if (currentVolume > 0) {
            return currentVolume - 1;
        } else { return 0;}
    }

        public int cetStartStationMinus() {
            if (station > 0) {
                return station - 1;
            } else {
                station = 10;
                return station;
            }
        }

        public int cetStartStation() {
            if (station < 9) {
                return station + 1;
            } else {
                station = -1;
                return station;
            }

        }

    }


























