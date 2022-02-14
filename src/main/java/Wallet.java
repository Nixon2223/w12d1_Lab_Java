import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> walletItems;
    private ArrayList<Cash> cash;

    public Wallet(String name) {
        this.name = name;
        this.walletItems = new ArrayList<IScan>();
        this.cash = new ArrayList<Cash>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.walletItems.size();
    }

    public void addItem(IScan walletItem) {
        this.walletItems.add(walletItem);
    }

    public void addCash(Cash cash) {
        this.cash.add(cash);
    }

    public int totalCash(){
        int result = 0;
        for (Cash i : cash){
            result += i.getValue();
        }
        return result;
    }
}