package bridgeAdapterFacade;

public class AK_47Adapter extends M4A1_S {
    private AK_47 ak_47;

    @Override
    public int getNumberOfBullets() {
        return 0;
        // because our ak has no bullets
    }

    @Override
    public void setNumberOfBullets(int numberOfBullets) {
        // nothing because no bullets
    }

    @Override
    public void fire() {
        ak_47.fire();
    }

    public void setAk_47(AK_47 ak_47) {
        this.ak_47 = ak_47;
    }
}
