class TeaStall {
    static String name = "baba tea stall";

    public static void main(String a[]) {
        System.out.println("The tea stall name is: " + name);
        
        update();

        System.out.println("Name after re-initialized:");
        System.out.println("The tea stall name is: " + name);
    }

    public static void update() { 
        name = "chai wala tea stall";
    }
}
