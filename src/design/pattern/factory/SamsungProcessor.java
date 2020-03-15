package design.pattern.factory;

public class SamsungProcessor implements TransactionProcessor {

	@Override
	public boolean process() {
		System.out.println("SamsungProcessor ......");
		return true;
	}

}
