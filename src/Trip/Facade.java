package Trip;
import Foodfacto.FoodFacto;

public class Facade { 
    
    // Private methods: //
    private void FoodFactory(String[] foods) {
        FoodFacto ff = FoodFacto.getFood();
        for (int i = 0; i < foods.length; i++) {
            String FoodName = foods[i];
            ff.setCompany(FoodName);
        }
    }
    
    
    // Public methods for adding combo's: //
    public void AddAllMeats () {
        String[] foods = {"Beef", "Chicken", "Shrimp", "Salmon", "Tuna"};
        FoodFactory(foods);
    }
    
    public void AddAllSauces () {
        String[] foods = {"Honeymustard", "BBQsauce", "Ranch", "BlueCheese"};
        FoodFactory(foods);
    }
    
    public void AddAllVegetables () {
        String[] foods = {"GreenBeans", "Lettuce", "Tomatoes"};
        FoodFactory(foods);
    }
    
    public void AddBeansRiceGravy () {
        String[] foods = {"Bean", "Rice"};
        FoodFactory(foods);
    }
    
    public void AddFriesOnionRings () {
        String[] foods = {"Fries", "OnionRings"};
        FoodFactory(foods);
    }
    
    public void AddGreenBeansMashPotatoes () {
        String[] foods = {"GreenBeans"};
        FoodFactory(foods);
    }
    
    public void AddGreenBeansVegMedley () {
        String[] foods = {"GreenBeans", "VegtableMedly"};
        FoodFactory(foods);
    }

}