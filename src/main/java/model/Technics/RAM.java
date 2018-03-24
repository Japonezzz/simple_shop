package model.Technics;

import enums.MemoryType;

import java.util.ArrayList;
import java.util.List;

public class RAM {
    private int volume;
    private MemoryType ramType;

    public RAM() {

    }

    public RAM(int volume, String ramType) {
        this.volume = volume;
        this.ramType = MemoryType.valueOf(ramType);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MemoryType getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = MemoryType.valueOf(ramType);
    }

    @Override
    public String toString() {
        return "\n\tVolume of memory: " + this.volume +
                "\n\tMemoryType: " + this.ramType.toString();
    }
}
