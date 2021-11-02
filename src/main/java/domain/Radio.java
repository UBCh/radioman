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

    public void setStation (int newStation) {
        if ( newStation < 0) { return;}
        if ( newStation > 9) { return;}
            station = newStation;
    }
    public void setCurrentVolume (int newCurrentVolume) {
        if ( newCurrentVolume < 0) { return;}
        if ( newCurrentVolume > 10) { return;}
        currentVolume = newCurrentVolume;
    }

    public int setStartVolume() {
        if (currentVolume < 10) {return currentVolume +1;}
        else { return 10 ;}
        }


    public int setMinusVolume() {
        if (currentVolume > 0) {
            return currentVolume - 1;
        } else { return 0;}
    }

        public int setStartStationMinus() {
            if (station > 0) {
                return station - 1;
            } else {
                station = 10;
                return station;
            }
        }

        public int setStartStation() {
            if (station < 9) {
                return station + 1;
            } else {
                station = -1;
                return station;
            }

        }

    }


























