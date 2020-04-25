package oren;



public class Test {

	public static void main(String[] args) {
		MenuItem example = new TunaSpecial();
		example = new Ranch(example);
		example = new BBQSauce(example);
		example = new Onions(example);
		example = new Shrimp(example);
		example = new Fries(example);
		
		System.out.printf("$%2.2f\n",example.givePrice());

	}

}
