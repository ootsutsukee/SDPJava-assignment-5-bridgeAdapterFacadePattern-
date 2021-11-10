package bridgeAdapterFacade;

public class GunFacade {
    private Polygon polygon;
    private AK_47Adapter adapter;
    private ReloadGun reload;

    public GunFacade() {
        polygon = new Polygon();
        adapter = new AK_47Adapter();
        reload = new ReloadGun();
    }

    public void fireM4A1_SThenReloadAndFire() {
        M4A1_S m4A1_s = new M4A1_S();
        m4A1_s.setNumberOfBullets(1);
        polygon.setRifle(m4A1_s);
        polygon.fire();
        reload.reload(m4A1_s);
        polygon.fire();
    }

    public void imitateAK47Reloading() {
        AK_47 ak_47 = new AK_47();
        polygon.setRifle(ak_47);
        polygon.fire();
        adapter.setAk_47(ak_47);
        reload.reload(adapter);
        polygon.fire();
    }
}
