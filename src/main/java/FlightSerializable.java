import java.io.Serializable;

public class FlightSerializable implements Serializable {
    private int DEST_AIRPORT_ID;
    private float ARR_DELAY;
    private float AIR_TIME;
    private float CANCELLED;

    public FlightSerializable() {}

    public FlightSerializable(int DEST_AIRPORT_ID, float ARR_DELAY, float AIR_TIME, float CANCELLED) {
        this.DEST_AIRPORT_ID = DEST_AIRPORT_ID;
        this.ARR_DELAY = ARR_DELAY;
        this.AIR_TIME = AIR_TIME;
        this.CANCELLED = CANCELLED;
    }

    public float getARR_DELAY() {
        return ARR_DELAY;
    }

    public float getCANCELLED() {
        return ARR_DELAY;
    }

    public float getDEST_AIRPORT_ID() {
        return ARR_DELAY;
    }

    public float get() {
        return ARR_DELAY;
    }

}
