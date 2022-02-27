package OopPartTwo.Composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions=new Dimensions(20,20,10);
        Case theCase=new Case("9376","Dell","970",dimensions);
       //Resolution nativeResolution=new Resolution(32,24);

        Monitor theMonitor= new Monitor("32 inch","Acer", 32,new Resolution(3200,1800));

        MotherBoard theMotherBoard= new MotherBoard("BJ-200","Asus",8,12,"v2.15");

        PC thePC=new PC(theCase,theMonitor,theMotherBoard);
        thePC.powerUp();
    }
}
