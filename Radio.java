class Radio {
    static boolean isOn = false;
    static int currentVolume = 5;
    static int maxVolume = 10;
    static int minVolume = 0;

    public static void onOrOff() {
        if (!isOn) {
            isOn = true;
            System.out.println("Radio is now ON.");
        } else {
            isOn = false;
            System.out.println("Radio is now OFF.");
        }
    }

    public static void increaseVolume() {
        if (isOn) {
            if (currentVolume < maxVolume) {
                currentVolume++;
                System.out.println("Volume increased to " + currentVolume);
            } else {
                System.out.println("Cannot increase volume. Max volume reached.");
            }
        } else {
            System.out.println("Cannot increase volume. Radio is OFF.");
        }
    }

    public static void decreaseVolume() {
        if (isOn) {
            if (currentVolume > minVolume) {
                currentVolume--;
                System.out.println("Volume decreased to " + currentVolume);
            } else {
                System.out.println("Cannot decrease volume. Min volume reached.");
            }
        } else {
            System.out.println("Cannot decrease volume. Radio is OFF.");
        }
    }
}
