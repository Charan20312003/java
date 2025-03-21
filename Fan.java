class Fan {
    static boolean isConnected = false;
    static int currentSpeed = 0;
    static int maxSpeed = 5;
    static int minSpeed = 0;
    static int setSpeed;
    static String oscillateMode;	
    public static void onOrOff() {
        if (!isConnected)
	 {
            isConnected = true;
            System.out.println("Fan is now ON.");
        } else 
	{
            isConnected = false;
            System.out.println("Fan is now OFF.");
        }
    }

    public static void increaseSpeed() 
	{
        if (isConnected) 
	{
            if (currentSpeed < maxSpeed)
	 {
                currentSpeed=currentSpeed+1;
                System.out.println("Fan speed increased to " + currentSpeed);
            } else
	 {
                System.out.println("Cannot increase speed. Max speed reached.");
            }
        } else {
            System.out.println("Cannot increase speed. Fan is OFF.");
        }
    }

    public static void decreaseSpeed() {
        if (isConnected) {
            if (currentSpeed > minSpeed) {
                currentSpeed=currentSpeed-1;
                System.out.println("Fan speed decreased to " + currentSpeed);
            } else {
                System.out.println("Cannot decrease speed. Min speed reached.");
            }
        } else {
            System.out.println("Cannot decrease speed. Fan is OFF.");
        }
    }

    public static void setSpeed(int speed) {
        if (isConnected) {
            if (speed >= minSpeed && speed <= maxSpeed) {
                currentSpeed = speed;
                System.out.println("Fan speed set to " + currentSpeed);
            } else 
	{
                System.out.println("Invalid speed! Set between " + minSpeed + " and " + maxSpeed);
            }
        } else
	 {
            System.out.println("Cannot set speed. Fan is OFF.");
        }
    }

    public static void oscillateMode() {
        if (isConnected) {
            System.out.println("Fan oscillation turned ON.");
        } else {
            System.out.println("Cannot oscillate. Fan is OFF.");
        }
    }
}
