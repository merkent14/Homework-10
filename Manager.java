import java.io.IOException;
import java.io.PrintWriter;
public class Manager extends Employee implements EmployeeCompensation{
	private double stockDividend_=0;
	
	//Constructor
	//#####################
	/**
	 * @param stockDividend
	 */
	public Manager(int ID, int yearHired, double baseSalary,double stockDividend) {
		setID(ID);
		setYearHired(yearHired);
		setBaseSalary(baseSalary);
		stockDividend_=stockDividend;
	}
	/**
	 * 
	 */
	public Manager() {
		stockDividend_=0;
	}//end bracket of constructor
	
	//Setter and Getter
	//#######################
	/**
	 * @return the stockDividend_
	 */
	public double getStockDividend() {
		return stockDividend_;
	}//end bracket of stockDividend getter

	/**
	 * @param stockDividend_ the stockDividend_ to set
	 */
	public void setStockDividend(double stockDividend) {
		
		stockDividend_ = stockDividend;
	}//end bracket of stockDividend setter
	/**
	 * 
	 */
	public void ShowDividend(PrintWriter pw) {
		System.out.println("Dividend is "+ getStockDividend()+"!");
		pw.println("Dividend is "+ getStockDividend()+"!");
		
	}
	/**
	 * return string 
	 */
	public String toString() {
		return (getID()+"\t"+getYearHired()+"\t\tManager\t$"+ getBaseSalary()+"\t\t$"+stockDividend_+ "\n"+"This is a manager.ID is " +getID()+", hired since "+ getYearHired()+" and annual bonus is $"+stockDividend_);
	}
	/**
	 * return total compensation
	 */
	public double CalcualteTotalCompensation() {
		return(getBaseSalary()+stockDividend_);
		
	}
	
	
	
	
}//end bracket of class