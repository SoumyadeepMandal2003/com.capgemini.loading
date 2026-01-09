package OOPs;

/*
A smart device can be initialized in multiple stages depending on the information available at the time of creation.


Class Name: SmartDevice

Instance Variables
	•	String deviceName
	•	String os
	•	int batteryCapacity



Constructor Requirements

Implement the following constructors using constructor chaining with this():
	1.	Default constructor
	•	Initializes the device with default values.
	2.	Constructor with deviceName
	•	Initializes the device name and uses constructor chaining.
	3.	Constructor with deviceName and os
	•	Initializes device name and operating system using constructor chaining.
	4.	Constructor with all fields (deviceName, os, batteryCapacity)
	•	Initializes all instance variables.
*/

public class PS7 {

    public static void main(String[] args) {

        SmartDevice d1 = new SmartDevice();
        SmartDevice d2 = new SmartDevice("Smart Watch");
        SmartDevice d3 = new SmartDevice("Smart TV", "Android");
        SmartDevice d4 = new SmartDevice("Smart Phone", "Android", 5000);

        d1.display();
        d2.display();
        d3.display();
        d4.display();
    }
}

class SmartDevice {

    String deviceName;
    String os;
    int batteryCapacity;

    // 1. Default constructor
    SmartDevice() {
        this("Unknown Device");
    }

    // 2. Constructor with deviceName
    SmartDevice(String deviceName) {
        this(deviceName, "Unknown OS");
    }

    // 3. Constructor with deviceName and os
    SmartDevice(String deviceName, String os) {
        this(deviceName, os, 0);
    }

    // 4. Constructor with all fields
    SmartDevice(String deviceName, String os, int batteryCapacity) {
        this.deviceName = deviceName;
        this.os = os;
        this.batteryCapacity = batteryCapacity;
    }

    void display() {
        System.out.println("Device Name: " + deviceName);
        System.out.println("OS: " + os);
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("---------------------------");
    }
}
