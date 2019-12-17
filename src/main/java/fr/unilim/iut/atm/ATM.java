package fr.unilim.iut.atm;


public class ATM {

	public static final String CURRENCY = "Euros";
	BankNoteHandler fiftyHandler;
	
	public ATM() {
		this.fiftyHandler = new FiftyBankNotesHandler();
		BankNoteHandler twentyHandler = new TwentyBankNotesHandler();
		fiftyHandler.setNext(twentyHandler);
		BankNoteHandler tenHandler = new TenBankNotesHandler();
		twentyHandler.setNext(tenHandler);
	}

	public Money withdraw(int amount) {

		Money money = Money.NO;

		money = fiftyHandler.dispense(amount, money);
		
		return money;
	}

}
