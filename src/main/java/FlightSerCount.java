import java.io.Serializable;

public class FlightSerCount implements Serializable {
    private float MaxArrDelay;
    private int CountOfFlights;
    private int CountOfDelays;
    private int CountOfCancelled;

    public FlightSerCount() {}
    
    public FlightSerCount(float MaxArrDelay, int CountOfFlights, int CountOfDelays, int CountOfCancelled){
        this.MaxArrDelay = MaxArrDelay;
        this.CountOfFlights = CountOfFlights;
        this.CountOfDelays = CountOfDelays;
        this.CountOfCancelled = CountOfCancelled;
    }

    public float getMaxArrDelay() {
        return MaxArrDelay;
    }

    public float getCountOfFlights() {
        return CountOfFlights;
    }

    public float getCountOfDelays() {
        return CountOfDelays;
    }

    public float getCountOfCancelled() {
        return CountOfCancelled;
    }

    public static FlightSerCount addValue(FlightSerCount a, float MaxArrDelay, boolean isDelayed, boolean isCancelled) {
        return new FlightSerCount(a.getCountOfFlights() + 1,
            isDelayed ? a.getCountOfDelays() + 1 : a.getCountOfDelays(),
            Math.max(a.getMaxArrDelay(), MaxArrDelay),
            isCancelled ? a.getCountOfCancelled() + 1 : a.getCountOfCancelled());
    }


}
