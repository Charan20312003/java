class Projector 
{
    static boolean isConnected = false;
    static int brightness = 50; 
    static int maxBrightness = 100;
    static int minBrightness = 10;

    public static void onOrOff() 
    {
        if (!isConnected) 
        {
            isConnected = true;
            System.out.println("Projector is now ON.");
        } 
        else 
        {
            isConnected = false;
            System.out.println("Projector is now OFF.");
        }
    }

    public static void increaseBrightness() 
    {
        if (isConnected) 
        {
            if (brightness < maxBrightness) 
            {
                brightness++;
                System.out.println("Brightness increased to: " + brightness);
            } 
            else 
            {
                System.out.println("Cannot increase brightness. Max limit reached.");
            }
        } 
        else 
        {
            System.out.println("Cannot adjust brightness. Projector is OFF.");
        }
    }

    public static void decreaseBrightness() 
    {
        if (isConnected) 
        {
            if (brightness > minBrightness) 
            {
                brightness--;
                System.out.println("Brightness decreased to: " + brightness);
            } 
            else 
            {
                System.out.println("Cannot decrease brightness. Min limit reached.");
            }
        } 
        else 
        {
            System.out.println("Cannot adjust brightness. Projector is OFF.");
        }
    }
}
