package fr.unilim.iut.atm;

public class TwentyBankNotesHandler extends BankNoteHandler {

	@Override
	public Money dispense(int amount, Money money) {
		
		if (amount >= 20) {
			int numberof20BankNotes = amount / 20;
			money = money.add(new BankNotesBundle(new BankNote (20,ATM.CURRENCY), numberof20BankNotes));
		}
		
		if (amount % 20 != 0) {
			money = super.dispense(amount % 20, money);
		}
		
		return money;
	}
}
