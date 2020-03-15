package design.pattern.factory;

public class AppleProcessor implements TransactionProcessor {

	@Override
	public boolean process() {
		System.out.println("AppleProcessor ......");
		return true ;
	}

}
