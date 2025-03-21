class Refrigerator 
{
    static boolean isConnected = false;
    static int currentTemperature = 4; 
    static int maxTemperature = 8;
    static int minTemperature = 0;

    public static void onOrOff() 
    {
        if (!isConnected) 
        {
            isConnected = true;
            System.out.println("Refrigerator is now ON.");
        } 
        else 
        {
            isConnected = false;
            System.out.println("Refrigerator is now OFF.");
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
                System.out.println("Cannot increase temperature. Max limit reached.");
            }
        } 
        else 
        {
            System.out.println("Cannot increase temperature. Refrigerator is OFF.");
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
                System.out.println("Cannot decrease temperature. Min limit reached.");
            }
        } 
        else 
        {
            System.out.println("Cannot decrease temperature. Refrigerator is OFF.");
        }
    }
}
