
public class CalculatorModel {
	// Holds the value of the sum of the numbers
	// entered in the view
		     
	private double calculationValue;
	
    public void addTwoNumbers(double firstNumber, double secondNumber){
        calculationValue = firstNumber + secondNumber;
}
    
    public double getCalculationValue(){
        return calculationValue;
    }
}
