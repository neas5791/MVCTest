
// This is the View
// Its only job is to display what the user sees
// It performs no calculations, but instead passes
// information entered by the user to whomever needs
// it.
		 
import java.awt.event.ActionListener;
import javax.swing.*;
		 
public class CalculatorView extends JFrame{
		 
    /**
	 * 
	 */
	private static final long serialVersionUID = 9131304647063274186L;
	private JTextField firstNumber  = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);

    CalculatorView(){
    	// Sets up the view and adds the components

        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);

    }

   public double getFirstNumber(){
        return Double.parseDouble(firstNumber.getText());
    }

    public double getSecondNumber(){
    	return Double.parseDouble(secondNumber.getText());
    }

    public double getCalcSolution(){
         return Double.parseDouble(calcSolution.getText());
    }

    public void setCalcSolution(double solution){
        calcSolution.setText(Double.toString(solution));
    }

	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
	void addCalculateListener(ActionListener listenForCalcButton){
	        calculateButton.addActionListener(listenForCalcButton);
	}

    // Open a popup that contains the error message passed
    void displayErrorMessage(String errorMessage){ 
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
