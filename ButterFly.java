class ButterFly{
	static String eyeType;
	static int legs;
	String name ;
	int lifeSpanInWeeks;
	
	ButterFly(String name,int lifeSpanInWeeks){
		System.out.println("Invoking String,int constructor in ButterFly");
		this.name=name;
		this.lifeSpanInWeeks=lifeSpanInWeeks;
	}
	
	static{
		eyeType="Compound";
		legs=6;	
	}
	
	static void staticButterFly(){
		System.out.println("static variables in ButterFly");
		System.out.println("ButterFly eye type is:"+eyeType);
		System.out.println("ButterFly Legs is:"+legs);

	}
	void instanceButterFly(){
		System.out.println("instance variables in ButterFly");
	    System.out.println("Name is:"+name);
		System.out.println("Life Span In Weeks is:"+lifeSpanInWeeks);


	}
}
class ButterFlyKiller{
	public static void main(String[] args){
		System.out.println("Running main in ButterFlyKiller");
		
		ButterFly butterFly=new ButterFly("Monarch ButterFly",2);
		ButterFly.staticButterFly();
		butterFly.instanceButterFly();
		
		System.out.println("##################################");
		
		ButterFly butterFly1=new ButterFly("Apollo",1);
		ButterFly.staticButterFly();
		butterFly1.instanceButterFly();
		
	}
}