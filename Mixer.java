class Mixer 
{
    static boolean isConnected = false;
    static int currentSpeed = 0;
    static int maxSpeed = 5;
    static int minSpeed = 0;

    public static void onOrOff() 
    {
        if (!isConnected) 
        {
            isConnected = true;
            System.out.println("Mixer is now ON.");
        } 
        else 
        {
            isConnected = false;
            System.out.println("Mixer is now OFF.");
        }
    }

    public static void increaseSpeed() 
    {
        if (isConnected) 
        {
            if (currentSpeed < maxSpeed) 
            {
               currentSpeed= currentSpeed+1;
                System.out.println("Mixer speed increased to " + currentSpeed);
            } 
            else 
            {
                System.out.println("Cannot increase speed. Max speed reached.");
            }
        } 
        else 
        {
            System.out.println("Cannot increase speed. Mixer is OFF.");
        }
    }

    public static void decreaseSpeed() 
    {
        if (isConnected) 
        {
            if (currentSpeed > minSpeed) 
            {
              currentSpeed = currentSpeed-1;
                System.out.println("Mixer speed decreased to " + currentSpeed);
            } 
            else 
            {
                System.out.println("Cannot decrease speed. Min speed reached.");
            }
        } 
        else 
        {
            System.out.println("Cannot decrease speed. Mixer is OFF.");
        }
    }
}
