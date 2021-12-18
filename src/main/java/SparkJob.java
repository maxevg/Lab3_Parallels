import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple2;

public class SparkJob {
    private static float CheckNullDelay(String current) {
        if (current.equals("")) {
            return 0.0F;
        } else {
            return Float.parseFloat(current);
        }
    }

    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("lab3");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> DistOfAirportDelays = sc.textFile("664600583_T_ONTIME_sample_cutted.csv");
        JavaRDD<String> DistOfAirportNames  = sc.textFile("L_AIRPORT_ID.csv");


        JavaPairRDD<Integer, String> DataOfAirportNames = DistOfAirportNames.filter(str ->!str.contains("Code"))
                .mapToPair(value -> {
                    String[] Table = value.split("\",");
                    int DestAirportID = Integer.parseInt((Table[0]).replaceAll("\"", ""));
                    return new Tuple2<>(DestAirportID, Table[1]);
                });

        JavaPairRDD<Tuple2<Integer, Integer>, FlightSerializable> DataOfAirportDelays = DistOfAirportDelays.filter(str -> !str.contains("YEAR"))
                .mapToPair(value -> {
                    String[] Table = value.split(",");
                    int DestAirportID = Integer.parseInt(Table[14]);
                    int OriginalAirportID = Integer.parseInt(Table[11]);
                    float IsCancelled = Float.parseFloat(Table[19]);
                    float ArrDelay = CheckNullDelay(Table[17]);
                    return new Tuple2<>(new Tuple2<>(OriginalAirportID, DestAirportID),
                            new FlightSerializable(DestAirportID, OriginalAirportID, ArrDelay, IsCancelled));
                });

        JavaPairRDD<Tuple2<Integer, Integer>,

    }
}
