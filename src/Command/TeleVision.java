package Command;

public class TeleVision extends Executable {
    int volume;

    public TeleVision() {
        volume = 50;
    }

    void addVolume(int index) {
        volume = volume + index;
        if (volume <= 0) volume = 0;
        if (volume >= 100) volume = 100;
    }
}
