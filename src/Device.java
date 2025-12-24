public class Device {

    private String name;
    private boolean on;

    public Device(String name) {
        this.name = name;
        this.on = false;
    }

    public void toggle() {
        this.on = !this.on;
    }

    public boolean isOn() {
        return this.on;
    }

    public String getName() {
        return this.name;
    }

    public String status() {
        return name + ": " + (on ? "on" : "off");
    }

    public void turnOff() {
        this.on = false;
    }




}
