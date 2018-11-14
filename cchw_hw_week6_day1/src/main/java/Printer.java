public class Printer {

    private int sheetsLeft;
    private int tonerVolume;

    public Printer(int sheetsLeft, int tonerVolume){
        this.sheetsLeft = sheetsLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsLeft() {
        return this.sheetsLeft;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

    public void print(int copies, int pages){
        int pagesToRemove = copies * pages;
        if (pagesToRemove <= this.sheetsLeft) {
            this.sheetsLeft -= pagesToRemove;
            this.tonerVolume -= pagesToRemove;
        }
    }

    public void refillPaper(){
        this.sheetsLeft = 100;
    }
}
