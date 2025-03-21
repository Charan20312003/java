class Speaker {
    static boolean isConnected = false;
    static int currentVolume = 20;
    static int maxVolume = 100;
    static int minVolume = 0;

    public static void onOrOff()
 {
        if (!isConnected) 
{
            isConnected = true;
            System.out.println("Speaker is now ON.");
        }
 else
 {
            isConnected = false;
            System.out.println("Speaker is now OFF.");
        }
    }

    public static void increaseVolume()
 {
        if (isConnected)
 {
            if (currentVolume < maxVolume) 
{
                currentVolume=currentVolume+1;
                System.out.println("Volume increased to: " + currentVolume);
            } 
	else 
{
                System.out.println("Cannot increase volume. Max volume reached.");
            }
        } 
else
	 {
            System.out.println("Cannot increase volume. Speaker is OFF.");
        }
    }

    public static void decreaseVolume() 
{
        if (isConnected) 
{
            if (currentVolume > minVolume)
 {
                currentVolume=currentVolume-1;
                System.out.println("Volume decreased to: " + currentVolume);
            }
 else 
		{
                System.out.println("Cannot decrease volume. Min volume reached.");
            }
        }
 else 
{
            System.out.println("Cannot decrease volume. Speaker is OFF.");
        }
    }
}
