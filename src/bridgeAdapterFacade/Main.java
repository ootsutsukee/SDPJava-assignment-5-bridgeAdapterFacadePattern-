package bridgeAdapterFacade;

public class Main {

    public static void main(String[] args) {
        GunFacade facade = new GunFacade();
        facade.fireM4A1_SThenReloadAndFire();
        System.out.println("\n\n");
        facade.imitateAK47Reloading();
    }
}
