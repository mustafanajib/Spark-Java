package line_count_Spark;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.JavaRDD;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SparkConf conf = new SparkConf().setAppName("Line_Count");
		
		JavaSparkContext ctx = new JavaSparkContext(conf);
		
		JavaRDD<String> textLoadRDD = ctx.textFile("/Users/hicham/Desktop/doc1.txt");
		
		
		System.out.println(textLoadRDD.count());
		
		
		
	}

}
