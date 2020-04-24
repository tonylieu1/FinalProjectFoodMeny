
public class Test {

    public static void main(String[] args) {
        MenuItem example = new Order();
        example = new Side(example);
        example = new Side(example);
        example = new Side(example);
        example = new Side(example);
        example = new Side(example);
        
        System.out.printf("$%2.2f\n",example.givePrice());

    }}


