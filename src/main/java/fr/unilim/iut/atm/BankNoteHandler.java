package fr.unilim.iut.atm;

public abstract class BankNoteHandler {

	public BankNoteHandler next;
	
	public Money dispense(int amount, Money money) {
		
		if (next != null) {
			money = next.dispense(amount, money);
		}
	
		return money;
	}
	
	public void setNext(BankNoteHandler next) {
		this.next = next;
	}
}
