class Ac
{
    static boolean isConnected = false;
    static int currentTemperature = 24;  
    static int maxTemperature = 30;  
    static int minTemperature = 16;  

    public static void onOrOff()
    {
        if (!isConnected)
        {
            isConnected = true;
            System.out.println("AC is now ON.");
        }
        else
        {
            isConnected = false;
            System.out.println("AC is now OFF.");
        }
    }

    public static void increaseTemperature() 
    {
        if (isConnected)
        {
            if (currentTemperature < maxTemperature)
            {
                currentTemperature++;
                System.out.println("Temperature increased to " + currentTemperature + "°C");
            }
            else 
            {
                System.out.println("Cannot increase temperature. Max temperature reached.");
            }
        }
        else 
        {
            System.out.println("Cannot increase temperature. AC is OFF.");
        }
    }

    public static void decreaseTemperature()
    {
        if (isConnected) 
        {
            if (currentTemperature > minTemperature)
            {
                currentTemperature--;
                System.out.println("Temperature decreased to " + currentTemperature + "°C");
            }
            else 
            {
                System.out.println("Cannot decrease temperature. Min temperature reached.");
            }
        }
        else
        {
            System.out.println("Cannot decrease temperature. AC is OFF.");
        }
    }
}
