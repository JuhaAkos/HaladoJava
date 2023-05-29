package hu.me.counter;

public class CountedNumber extends Thread{
	public int countedNumber = 0;

	public int getCountedNumber() {
		return countedNumber;
	}

	public void setCountedNumber(int countedNumber) {
		this.countedNumber = countedNumber;
	}
	
	
}
