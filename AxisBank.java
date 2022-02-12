package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit Amount --> AxisBAnk");
	}
public static void main (String[] args) {
	AxisBank axisbank = new AxisBank();
	BankInfo bankinfo = new BankInfo();
	axisbank.deposit();
	bankinfo.deposit();
	bankinfo.fixed();
}

}
