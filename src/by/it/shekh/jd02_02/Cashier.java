package by.it.shekh.jd02_02;

public class Cashier implements Runnable {

    private int number;
    private String name;


    @Override
    public String toString() {
        return name;
    }

    public Cashier(int number) {
        this.number = number;
        name = "Кассир №" + number;
    }


    @Override
    public void run() {
        System.out.println(name + " открыл кассу");
        while (Dispetcher.marketOpened()) {
            Buyer buyer = BuyerQueue.extractBuyerFromQueue();
            if (buyer != null) {
                System.out.println(this + " обслуживает " + buyer);
                Util.sleep(Util.rnd(2000, 5000));
                System.out.println("\u001B[32m" + "Чек " + buyer + " составил " + buyer.getSum() + "$\n" +
                        this + " завершил обслуживание " + buyer + "\u001B[0m");
                Dispetcher.completeBuyer();
                synchronized (buyer) {
                    buyer.notify();
                }
            } else Util.sleep(10);
        }
        System.out.println(name + " закрыл кассу");
    }
}
