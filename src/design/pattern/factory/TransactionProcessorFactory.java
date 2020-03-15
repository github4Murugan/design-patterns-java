package design.pattern.factory;

public class TransactionProcessorFactory {

	public static TransactionProcessor getProcessor(String walletType) {
		TransactionProcessor transactionProcessor = null;

		switch (WalletType.getWallettype(walletType)) {
		case APPLE:
			transactionProcessor = new AppleProcessor();
			break;
		case SAMSUNG:
			transactionProcessor = new SamsungProcessor();
			break;
		case GOOGLE:
			transactionProcessor = new GoogleProcessor();
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
