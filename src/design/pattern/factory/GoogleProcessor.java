package design.pattern.factory;

public class GoogleProcessor implements TransactionProcessor {

	@Override
	public boolean process() {
		System.out.println("GoogleProcessor ......");
		return true;
	}

}
