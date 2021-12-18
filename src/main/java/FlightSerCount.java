import java.io.Serializable;

public class FlightSerCount implements Serializable {
    private float MaxArrDelay;
    private int CountOfFlights;
    private int CountOfDelays;
    private int CountOfCancelled;

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

    public static FlightSerCount addValue(FlightSerCount a, float)
}
