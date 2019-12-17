package fr.unilim.iut.atm;

public class FiftyBankNotesHandler extends BankNoteHandler {

	@Override
	public Money dispense(int amount, Money money) {
		
		if (amount >= 50) {
			int numberof50BankNotes = amount / 50;
			money = money.add(new BankNotesBundle(new BankNote (50,ATM.CURRENCY), numberof50BankNotes));
		}
		
		if (amount%50 != 0) {
			money = super.dispense(amount % 50, money);
		}
		
		return money;
	}
	
}
