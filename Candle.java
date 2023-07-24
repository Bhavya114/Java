class  Candle{
	static String company;
	static String fuel;
	int price;
	String type;
	
	Candle(int price,String type){
		System.out.println("Invoking int , String constructor in Candle");
		this.price=price;
		this.type=type;
	}
	
	static{
		company="PAMCO";
		fuel="Wax";	
	}
	
	static void staticCandle(){
		System.out.println("static variables in Candle");
		System.out.println("company is:"+company);
		System.out.println("fuel is:"+fuel);

	}
	void instanceCandle(){
		System.out.println("instance variables in Candle");
	    System.out.println("Price is:"+price);
		System.out.println("type is:"+type);


	}
}
class CandleRunner{
	public static void main(String[] args){
		System.out.println("Running main in CandleRunner");
		
		Candle candle=new Candle(150,"Hammer");
		Candle.staticCandle();
		candle.instanceCandle();
		
		System.out.println("##################################");
		Candle candle1=new Candle(300,"Doji");
		Candle.staticCandle();
		candle1.instanceCandle();
		
	}
}