/*
 ** Program designed for a Droid
 */
public class Droid {

    // Fields
    String name;
    int batteryLevel;

    // Constructor method
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    // perform method
    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    // toString method
    public String toString() {
        return "Hello, I'm the droid: " + name;
    }

    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("dancing");
        codey.performTask("playing");
        codey.performTask("drinking");
        System.out.println(codey.batteryLevel);
    }
}