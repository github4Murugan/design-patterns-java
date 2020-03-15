package design.pattern.factory;

public class CloudProcessor implements TransactionProcessor	 {

	@Override
	public boolean process() {
		System.out.println("SamsungProcessor ......");
		return true;
	}

}
