class Soil{
	static String mineralsInPercentage;
	static int organicMater;
	String texture;
	String color;
	
	Soil(String texture,String color){
		System.out.println("Invoking String, String constructor in Soil");
		this.texture=texture;
		this.color=color;
	}
	
	static{
		mineralsInPercentage="45%";
		organicMater=5;	
	}
	
	static void staticSoil(){
		System.out.println("static variables in Soil");
		System.out.println("mineralsInPercentage is:"+mineralsInPercentage);
		System.out.println("organicMater is:"+organicMater);

	}
	void instanceSoil(){
		System.out.println("instance variables in Soil");
	    System.out.println("Price is:"+texture);
		System.out.println("color is:"+color);


	}
}
class SoilRunner{
	public static void main(String[] args){
		System.out.println("Running main in SoilRunner");
		
		Soil soil=new Soil("Loam","black");
		Soil.staticSoil();
		soil.instanceSoil();
		
		System.out.println("##################################");
		Soil soil1=new Soil("Clay","Reddish brown");
		Soil.staticSoil();
		soil1.instanceSoil();
		
	}
}