class IronBox 
{
    static boolean isConnected = false;
    static int currentHeatLevel = 1;
    static int maxHeatLevel = 5;
    static int minHeatLevel = 1;

    public static void onOrOff() 
    {
        if (!isConnected) 
        {
            isConnected = true;
            System.out.println("Iron Box is now ON.");
        } 
        else 
        {
            isConnected = false;
            System.out.println("Iron Box is now OFF.");
        }
    }

    public static void increaseHeat() 
    {
        if (isConnected) 
        {
            if (currentHeatLevel < maxHeatLevel) 
            {
                currentHeatLevel++;
                System.out.println("Heat level increased to " + currentHeatLevel);
            } 
            else 
            {
                System.out.println("Cannot increase heat. Max level reached.");
            }
        } 
        else 
        {
            System.out.println("Cannot increase heat. Iron Box is OFF.");
        }
    }

    public static void decreaseHeat() 
    {
        if (isConnected) 
        {
            if (currentHeatLevel > minHeatLevel) 
            {
                currentHeatLevel--;
                System.out.println("Heat level decreased to " + currentHeatLevel);
            } 
            else 
            {
                System.out.println("Cannot decrease heat. Min level reached.");
            }
        } 
        else 
        {
            System.out.println("Cannot decrease heat. Iron Box is OFF.");
        }
    }
}
