package fr.unilim.iut.atm;

public class TenBankNotesHandler extends BankNoteHandler {

	@Override
	public Money dispense(int amount, Money money) {
		
		if (amount >= 10) {
			int numberof10BankNotes = amount / 10;
			money = money.add(new BankNotesBundle(new BankNote (10,ATM.CURRENCY), numberof10BankNotes));
		}
		
		if (amount%10 != 0) {
			money = super.dispense(amount % 10, money);
		}
		
		return money;
	}
	
}
