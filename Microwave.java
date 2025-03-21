class Microwave 
{
    static boolean isConnected = false;
    static int temperature = 100; 
    static int maxTemperature = 300;
    static int minTemperature = 50;

    public static void onOrOff() 
    {
        if (!isConnected) 
        {
            isConnected = true;
            System.out.println("Microwave is now ON.");
        } 
        else 
        {
            isConnected = false;
            System.out.println("Microwave is now OFF.");
        }
    }

    public static void increaseTemperature() 
    {
        if (isConnected) 
        {
            if (temperature < maxTemperature) 
            {
                 temperature=temperature+1;
                System.out.println("Temperature increased to: " + temperature + "°C");
            } 
            else 
            {
                System.out.println("Cannot increase temperature. Max limit reached.");
            }
        } 
        else 
        {
            System.out.println("Cannot increase temperature. Microwave is OFF.");
        }
    }

    public static void decreaseTemperature() 
    {
        if (isConnected) 
        {
            if (temperature > minTemperature) 
            {
                 temperature=temperature-1;
                System.out.println("Temperature decreased to: " + temperature + "°C");
            } 
            else 
            {
                System.out.println("Cannot decrease temperature. Min limit reached.");
            }
        } 
        else 
        {
            System.out.println("Cannot decrease temperature. Microwave is OFF.");
        }
    }
}
