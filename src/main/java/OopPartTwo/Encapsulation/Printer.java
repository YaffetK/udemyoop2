package OopPartTwo.Encapsulation;

public class Printer {

    private int tonerLvl;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLvl, boolean duplex) {
        if (tonerLvl>=0 && tonerLvl<=100){
            this.tonerLvl=tonerLvl;
        }
        else{
            this.tonerLvl=-1;
        }
        this.duplex = duplex;
        this.pagesPrinted=0;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount >0 && tonerAmount<100){
            if((tonerAmount+ this.tonerLvl)> 100){
                return -1;
            }else {
                this.tonerLvl += tonerAmount;
            }

        }
        else {
            return -1;
        }

        return this.tonerLvl;
    }

    public int printPages(int pages){
        int pagesToPrint=pages;
        if (duplex){
             pagesToPrint=(int) Math.ceil(pages / 2.0);
            System.out.println("Printing in duplex mode");
        }

        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLvl() {
        return tonerLvl;
    }
}
