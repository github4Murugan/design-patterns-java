package design.pattern.factory;

public class FactoryTest {

	public static void main(String[] args) {

		TransactionProcessor processor = TransactionProcessorFactory.getProcessor("APPLE");
		processor.process();

		processor = TransactionProcessorFactory.getProcessor("SAMSUNG");
		processor.process();

		processor = TransactionProcessorFactory.getProcessor("GOOGLE");
		processor.process();

		processor = TransactionProcessorFactory.getProcessor("CLOUD");
		processor.process();

		// Enum
		System.out.println(WalletType.APPLE);
		System.out.println(WalletType.APPLE.getType());
		System.out.println(WalletType.APPLE.toString());
		System.out.println(WalletType.APPLE.hashCode());
		System.out.println(WalletType.APPLE.hashCode());
		System.out.println(WalletType.SAMSUNG.hashCode());

		System.out.println(WalletType.APPLE.ordinal());
		System.out.println(WalletType.APPLE.name());

	}

}
