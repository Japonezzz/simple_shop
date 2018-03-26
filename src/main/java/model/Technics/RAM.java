package model.Technics;

import enums.MemoryType;

import java.util.ArrayList;
import java.util.List;

//клас для опису оперативної пам'яті пристрою

public class RAM {
    private int volume;                                 //поле для зазначення обсягу оперативної пам'яті пристрою
    private MemoryType ramType;                         //поле для вказання типу оперативної пам'яті. Вик-ся перечислення MemoryType

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
    public String toString() {                                      //перегрузка метода toString()
        return "\n\tVolume of memory: " + this.volume +
                "\n\tMemoryType: " + this.ramType.toString();
    }
}
