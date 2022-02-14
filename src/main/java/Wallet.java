import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> walletItems;
    private ArrayList<IPay> cash;

    public Wallet(String name) {
        this.name = name;
        this.walletItems = new ArrayList<IScan>();
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

}