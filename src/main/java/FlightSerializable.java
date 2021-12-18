import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import java.io.Serializable;

public class FlightSerializable implements Serializable {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("lab3");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> DistOfAirportDelays = sc.textFile("664600583_T_ONTIME_sample_cutted.csv");
        JavaRDD<String> DistOfAirportNames  = sc.textFile("664600583_T_ONTIME_sample_cutted.csv");


        JavaRDD<ParsedData> spli)tted = di)stFi)le.map(
                s -> new ParsedData(s, ai)rportsBroadcasted.value())

    }
}
