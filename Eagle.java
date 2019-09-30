public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    //Constructeur
    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    //Getter
    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    //Méthode classe mère
    @Override
    public String sing() {
        return "Screech!";
    }

    //Implémentation des méthodes de l'interface Fly
    @Override
    public void takeOff(){
        if (this.altitude == 0 && !this.flying) {
            this.flying = true;
            System.out.println(this.getName() + " take of in the sky !");
        }
        else {
            System.out.println(this.getName() + " is already flying.");
        }
    }

    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude += meters;
            System.out.println(this.getName() + " fies upward, altitude : " + this.getAltitude() + ".");
        }
        return this.altitude;
    }

    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.println(this.getName() + " flies downward, altitude : " + this.getAltitude() + ".");
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.altitude <= 1 && this.flying) {
            this.flying = false;
            System.out.println(this.getName() + " lands on the ground.");
        }
        else {
            System.out.println(this.getName() + " can't land, he has to get closer to the ground !");
        }
    }
}
