package week3.day1.Assignment3;

public class AxisBank extends BankInfo {
	
	public void deposit(int a, int b) {
		int c = a*b;
		int d = c + 2;
		System.out.println(d + "%");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AxisBank callsuperclass = new AxisBank();
		callsuperclass.deposit(23,12);
		
		BankInfo callownclass = new BankInfo();
		callownclass.deposit(23, 12);
	}

}
