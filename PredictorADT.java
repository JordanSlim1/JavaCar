package yay;

public interface PredictorADT {
	public double getTrainingAccuracy ();
	public String getPrediction (CarADT instance);
}
