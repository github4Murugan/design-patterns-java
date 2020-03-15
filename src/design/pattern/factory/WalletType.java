package design.pattern.factory;

public enum WalletType {

	APPLE("APPLE"), SAMSUNG("SAMSUNG"), GOOGLE("GOOGLE"), CLOUD("CLOUD");

	private String type;

	private WalletType(String wallet) {
		this.type = wallet;
	}

	public String getType() {
		return type;
	}
	
	public static WalletType getType1(String str) {
		if(str.equalsIgnoreCase(WalletType.APPLE.toString())) {
			return WalletType.APPLE;
		}
		else if(str.equalsIgnoreCase(WalletType.SAMSUNG.toString())) {
			return WalletType.SAMSUNG;
		}
		else if(str.equalsIgnoreCase(WalletType.GOOGLE.toString())) {
			return WalletType.GOOGLE;
		}
		else if(str.equalsIgnoreCase(WalletType.CLOUD.toString())) {
			return WalletType.CLOUD;
		}
		return null;
	}

}
