package Week2.Assignment1.Task1;

public class Television {
    private int channel;
    private boolean isOn;

    public Television() {
        this.channel = 1; // Default channel
        this.isOn = false; // Default state is off
    }

    public void setChannel(int channel) {
        if (channel > 10) {
            this.channel = 1;
        } else {
            this.channel = channel;
        }
    }

    public int getChannel() {
        return this.channel;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void pressOnOff() {
        this.isOn = !this.isOn; // Toggle the state
    }
}