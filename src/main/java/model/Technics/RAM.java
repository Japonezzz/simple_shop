package model.Technics;

import java.util.ArrayList;
import java.util.List;

public class RAM {
    private int volume;
    private String ramType;

    public RAM() {

    }

    public RAM(int volume, String ramType) {
        this.volume = volume;
        this.ramType = ramType;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }
}
