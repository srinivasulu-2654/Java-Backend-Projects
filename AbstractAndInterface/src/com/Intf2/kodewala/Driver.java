package com.Intf2.kodewala;


// let's say this application came in:
// 2010(1.6) ---> 2012(wanted to add new feature 'printpassBook')
interface IBanking {
	
	public void pay(); // 2010
	public void settle(); // 2010
	public void cancelTxn(); // 2010
	//public void printPassBook(); //(only rural bank need this) so here all the classes forced to implement --> but this want in only rural Bank
	
	public default void printPassBook() { // 2012 // this is keyword not access specifier
	   System.out.println("IBanking.printPassBook() - default functionality");
	}
}

class HDFC implements IBanking {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("HDFC.pay()");
	}

	@Override
	public void settle() {
		// TODO Auto-generated method stub
		System.out.println("HDFC.settle()");
	}
	
	@Override
	public void cancelTxn() {
		// TODO Auto-generated method stub
		System.out.println("HDFC.cancelTxn()");
	}

	
}

class punjabBank implements IBanking{

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("punjabBank.pay()");
	}

	@Override
	public void settle() {
		// TODO Auto-generated method stub
		System.out.println("punjabBank.settle()");
	}

	@Override
	public void cancelTxn() {
		// TODO Auto-generated method stub
		System.out.println("punjabBank.cancelTxn()");
	}

	
}

class RuralBank implements IBanking {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("RuralBank.pay()");
	}

	@Override
	public void settle() {
		// TODO Auto-generated method stub
		System.out.println("RuralBank.settle()");
	}

	@Override
	public void cancelTxn() {
		// TODO Auto-generated method stub
		System.out.println("RuralBank.cancelTxn()");
	}

	@Override
	public void printPassBook() {
		// TODO Auto-generated method stub
		System.out.println("RuralBank.printPassBook()"); // this only wants the printPassBook other no need
	}
	
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
