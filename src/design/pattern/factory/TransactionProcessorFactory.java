package design.pattern.factory;

public class TransactionProcessorFactory {

	public static TransactionProcessor getProcessor(String walletType) {
		TransactionProcessor transactionProcessor = null;

		switch (WalletType.getType1(walletType)) {
		case APPLE:
			transactionProcessor = new AppleProcessor();
			break;

		case SAMSUNG:
			transactionProcessor = new GoogleProcessor();
			break;

		case GOOGLE:
			transactionProcessor = new SamsungProcessor();
			break;

		case CLOUD:
			transactionProcessor = new CloudProcessor();
			break;

		default:
			break;
		}
		return transactionProcessor;
	}

}
