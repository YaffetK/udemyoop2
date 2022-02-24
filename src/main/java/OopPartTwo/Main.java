package OopPartTwo;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions=new Dimensions(20,20,10);
        Case theCase=new Case("9376","Dell","970",dimensions);
       //Resolution nativeResolution=new Resolution(32,24);

        Monitor theMonitor= new Monitor("32 inch","Acer", 32,new Resolution(3200,1800));

        Motherboard theMotherBoard= new Motherboard("BJ-200","Asus",8,12,"v2.15");

        PC thePC=new PC(theCase,theMonitor,theMotherBoard);

        thePC.getMonitor().drawPixelAt(1500,1200,"red");
        thePC.getMotherboard().loadProgram("windows 1.0");
        thePC.getTheCase().pressPowerButton();
    }
}
