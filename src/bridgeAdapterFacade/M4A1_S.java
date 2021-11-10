package bridgeAdapterFacade;

public class M4A1_S implements Rifle {
    private int numberOfBullets = 0;

    public int getNumberOfBullets() {
        return numberOfBullets;
    }

    public void setNumberOfBullets(int numberOfBullets) {
        this.numberOfBullets = numberOfBullets;
    }

    @Override
    public void fire() {
        System.out.println("I am shooting from m4a1-s and i have " + numberOfBullets + " bullets");
    }
}
