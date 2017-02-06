package Demo;
import java.io.*;
import hex.genmodel.easy.RowData;
import hex.genmodel.easy.EasyPredictModelWrapper;
import hex.genmodel.easy.prediction.*;

public class MyClass {
	private String modelClassName = "Demo.gbm_pojo_test";
//	private static String modelClassName = "Demo.gbm_pojo_test";
	
	public String predictReturn() throws Exception {
//	public static void main(String[] args) throws Exception {
		hex.genmodel.GenModel rawModel;
	rawModel = (hex.genmodel.GenModel) Class.forName(modelClassName).newInstance();
	EasyPredictModelWrapper model  = new EasyPredictModelWrapper(rawModel);
	
	RowData row = new RowData();
	row.put("Year","1987");
	row.put("Month","10");
	row.put("DayofMonth","14");
	row.put("DayofWeek","3");
	row.put("CRSDeptTime","730");
	row.put("UniqueCarrier","PS");
	row.put("Origin","SAN");
	row.put("Dest","SFO");

	BinomialModelPrediction p = model.predictBinomial(row);
	String sendOutString = new String();
	System.out.println("Label (aka prediction) is flight departure delayed:" + p.label);
	sendOutString += "Label (aka Prediction) is flight departure deplayed:";
	sendOutString += p.label;
	System.out.println("Class probabilities:");
	sendOutString += "<br>Class Probabilities:";
	for (int i = 0; i < p.classProbabilities.length; i++) {
	if (i >0) {
	System.out.println(',');
	}
	System.out.println(p.classProbabilities[i]);
	sendOutString += p.classProbabilities[i];
	if ( i != p.classProbabilities.length){
	sendOutString +=", ";
	}
	}
	System.out.println("");
	sendOutString +="<br>Something Works";
	return sendOutString;
	}
}
