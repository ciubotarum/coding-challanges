package theory.examples;

public class Bridge {
    // Implementor interface
    public interface Device {
        void turnOn();
        void turnOff();
        void setVolume(int volume);
    }

    // Concrete Implementor 1
    public static class TV implements Device {
        private int volume;

        @Override
        public void turnOn() {
            System.out.println("TV is ON");
        }

        @Override
        public void turnOff() {
            System.out.println("TV is OFF");
        }

        @Override
        public void setVolume(int volume) {
            this.volume = volume;
            System.out.println("TV volume set to " + volume);
        }
    }

    // Concrete Implementor 2
    public static class Radio implements Device {
        private int volume;

        @Override
        public void turnOn() {
            System.out.println("Radio is ON");
        }

        @Override
        public void turnOff() {
            System.out.println("Radio is OFF");
        }

        @Override
        public void setVolume(int volume) {
            this.volume = volume;
            System.out.println("Radio volume set to " + volume);
        }
    }

    // Abstraction
    public abstract static class RemoteControl {
        protected Device device;

        public RemoteControl(Device device) {
            this.device = device;
        }

        public abstract void turnOn();
        public abstract void turnOff();
        public abstract void setVolume(int volume);
    }

    // Refined Abstraction 1
    public static class BasicRemoteControl extends RemoteControl {
        public BasicRemoteControl(Device device) {
            super(device);
        }

        @Override
        public void turnOn() {
            device.turnOn();
        }

        @Override
        public void turnOff() {
            device.turnOff();
        }

        @Override
        public void setVolume(int volume) {
            device.setVolume(volume);
        }
    }

    // Refined Abstraction 2
    public static class AdvancedRemoteControl extends RemoteControl {
        public AdvancedRemoteControl(Device device) {
            super(device);
        }

        @Override
        public void turnOn() {
            device.turnOn();
        }

        @Override
        public void turnOff() {
            device.turnOff();
        }

        @Override
        public void setVolume(int volume) {
            device.setVolume(volume);
        }

        public void mute() {
            device.setVolume(0);
            System.out.println("Device is muted");
        }
    }

    // Use the Bridge Pattern
    public static class MainBridge {
        public static void main(String[] args) {
            Device tv = new TV();
            Device radio = new Radio();

            RemoteControl basicRemoteForTV = new BasicRemoteControl(tv);
            AdvancedRemoteControl advancedRemoteForRadio = new AdvancedRemoteControl(radio);

            basicRemoteForTV.turnOn();
            basicRemoteForTV.setVolume(10);
            basicRemoteForTV.turnOff();

            advancedRemoteForRadio.turnOn();
            advancedRemoteForRadio.setVolume(15);
            advancedRemoteForRadio.mute();
            advancedRemoteForRadio.turnOff();
        }
    }

}
