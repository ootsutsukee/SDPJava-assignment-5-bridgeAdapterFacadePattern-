package bridgeAdapterFacade;

public class ReloadGun {
    public void reload(M4A1_S m4a1_s) {
        m4a1_s.setNumberOfBullets(25);
        m4a1_s.fire();
    }
}
