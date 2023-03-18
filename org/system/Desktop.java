package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("32 inch LED");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desktop callSuperclass = new Desktop();
		callSuperclass.computerModel();
		callSuperclass.desktopSize();
	}

}
