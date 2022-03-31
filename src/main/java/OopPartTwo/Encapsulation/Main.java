package OopPartTwo.Encapsulation;

public class Main {
    public static void main(String[] args) {

        Printer printer=new Printer(70,true);
        printer.addToner(1);
        printer.addToner(15);
        printer.addToner(14);
        printer.addToner(1);

        System.out.println(printer.getTonerLvl());


    }
}
