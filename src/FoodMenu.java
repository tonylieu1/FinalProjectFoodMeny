
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FoodMenu extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {

        TabPane tabPane = new TabPane();
        Button button1 = new Button("Hamburgers & Fries ");
        Button button2 = new Button("Chicken Club and Fries ");
        Button button3 = new Button("Chicken Salad ");
        Button button4 = new Button("Tuna and Vegetable medley ");
        Button button5 = new Button("Steaks and mash potatoes ");
        Button button6 = new Button("Burritos and Rice ");
        Button button7 = new Button("Chicken Florentine and Mash potatoes ");
        Button button8 = new Button("Chicken tenders and fries ");
        Button button9 = new Button("Shrimp Capellini");
        Button button10 = new Button("Shrimp PoBoy ");
        Button button11 = new Button("Banger and mash ");
        Button button12 = new Button("Salmon and Vegetable medley");
     
        //this is for the tabs to have a grid sturtures
        GridPane G= new GridPane();
        G.setHgap(20);
        G.setVgap(20);
        Tab tab1 = new Tab("Food Specials", G);
        Tab tab2 = new Tab("Sides"  , new Label(""));
        Tab tab3 = new Tab("Reciept" , new Label(""));
        Tab tab4 = new Tab("Invoices");
        //this is the button to put in the scenes and the row and colums in that order;fv b
        G.add(button1, 0,0);
        G.add(button2, 1,0);
        G.add(button3, 2,0);
        G.add(button4, 3,0);
        G.add(button5, 0, 1);
        G.add(button6, 1, 1);
        G.add(button7, 2, 1);
        G.add(button8, 3, 1);
        G.add(button9, 0, 2);
        G.add(button10, 1, 2);
        G.add(button11, 2, 2);
        G.add(button12, 3, 2);
        
        tabPane.getTabs().add(tab1);
        tabPane.getTabs().add(tab2);
        tabPane.getTabs().add(tab3);
        tabPane.getTabs().add(tab4);
        VBox vBox = new VBox(tabPane);
        Scene scene = new Scene(vBox);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("FoodMenu");

        primaryStage.show();
    }
}