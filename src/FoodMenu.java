
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.control.Tab;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FoodMenu extends Application {
	CustomorReciepts Receipt = new CustomorReciepts();
	ArrayList<CustomorReciepts> invocies = new ArrayList();
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
    	//this is where the customor reicepts will be held 
    	TableView table = new TableView();
    	TableView table2 = new TableView();
    	TableView table3 = new TableView();
    	TableView HistoryOrder = new TableView();
    	BackgroundFill backg = new BackgroundFill(Color.BLACK, null, null);
    	Background backgs = new Background(backg);
    	ImageView im = new ImageView();
    	Image image1 = null;
		try {
			image1 = new Image(new FileInputStream("C:\\Users\\catboot\\Pictures\\Rest.jpg"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	im.setImage(image1);
    	ArrayList<Object> R= new ArrayList();
        TabPane tabPane = new TabPane();
        //this is for the user to see when he hit a button 
        TableColumn t = new TableColumn("Food");
        TableColumn P = new TableColumn("Prices");
        TableColumn Display1 = new TableColumn("Display");
        TableColumn Display2 = new TableColumn("Display");
        table.getColumns().addAll(P,t);
        table2.getColumns().add(Display1);
        table3.getColumns().add(Display2);
        t.setMinWidth(200);
        t.setMaxWidth(200);
        P.setMaxWidth(100);
        P.setMinWidth(100);
        Display1.setMinWidth(250);
        Display1.setMaxWidth(250);
        Display2.setMinWidth(250);
        Display2.setMaxWidth(250);
        //these are the buttons for the food
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
        Button button13 = new Button("Beef ");
        Button button14 = new Button("Chicken ");
        Button button15 = new Button("Shrimp ");
        Button button16 = new Button("Salmon");
        Button button17 = new Button("Tuna");
        Button button18 = new Button("Fries ");
        Button button19 = new Button("Vegable Medly ");
        Button button20 = new Button("Chicken Tender ");
        Button button21 = new Button("Onion Rings");
        Button button22 = new Button("Rice");
        Button button23 = new Button("Bean ");
        Button button24 = new Button("Green Beans ");
        Button button25 = new Button("Rice");
        Button button26 = new Button("Fruit");
        Button button27 = new Button("Honey mustard ");
        Button button28 = new Button("BBQ sauce ");
        Button button29 = new Button("Ranch ");
        Button button30 = new Button("Blue Cheese ");
        Button button31 = new Button("Bacon ");
        Button button32 = new Button("Lettuce");
        Button button33 = new Button("Tomatoes ");
        Button button34 = new Button("Onions ");
        Button button35 = new Button("Salad ");
        Button button36 = new Button("Crotons");   
        Button button37 = new Button("Add all meats ");
        Button button38 = new Button("Add all Vegetables ");
        Button button39 = new Button("Add Beans and Rice with gravity ");
        Button button40 = new Button("Add Fries and Onions rings ");
        Button button41 = new Button("Add Greens beans and Mash potatoes ");
        Button button42 = new Button("Add all sauces ");
        Button button43 = new Button("Add Green Beans and Vegetable Medley  ");
        //this button will remove the last order put in
        Button Delete = new Button("Remove");
        //this will finalize the pick for the food and send the data to an array
        Button finalize1 = new Button("Finalize");
        Button finalize2 = new Button("Finalize");
        //this will be for the Recipet tab to have a payment or void button
        Button Payed = new Button("Payment");
        Button Void = new Button("Void");
        
     
        //this is for the tabs to have a grid sturtures
        GridPane G= new GridPane();
        GridPane G2 = new GridPane();
        GridPane G3 = new GridPane();
        //this set the distance inbetween the buttons on the grid
        G.setHgap(20);
        G.setVgap(20);
        G2.setHgap(20);
        G2.setVgap(20);
        G3.setVgap(50);
 
        //this make the tabs not closeable
        tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
        Tab tab1 = new Tab("Food Specials", G);
        Tab tab2 = new Tab("Sides"  , G2);
        Tab tab3 = new Tab("Reciept" , G3);
        Tab tab4 = new Tab("Invoices");
        //this is the button to put in the scenes and the row and colums in that order;fv b
        G.add(button1, 1,1);
        G.add(button2, 2,1);
        G.add(button3, 3,1);
        G.add(button4, 4,1);
        G.add(button5, 1, 2);
        G.add(button6, 2, 2);
        G.add(button7, 3, 2);
        G.add(button8, 4, 2);
        G.add(button9, 1, 3);
        G.add(button10, 2, 3);
        G.add(button11, 3, 3);
        G.add(button12, 4, 3);
        G.setBackground(backgs);
        G2.add(button13, 0,0);
        G2.add(button14, 1,0);
        G2.add(button15, 2,0);
        G2.add(button16, 3,0);
        G2.add(button17, 0, 1);
        G2.add(button18, 1, 1);
        G2.add(button19, 2, 1);
        G2.add(button20, 3, 1);
        G2.add(button21, 0, 2);
        G2.add(button22, 1, 2);
        G2.add(button23, 2, 2);
        G2.add(button24, 3, 2);
        G2.add(button25, 0,3);
        G2.add(button26, 1,3);
        G2.add(button27, 2,3);
        G2.add(button28, 3,3);
        G2.add(button29, 0, 4);
        G2.add(button30, 1, 4);
        G2.add(button31, 2, 4);
        G2.add(button32, 3, 4);
        G2.add(button33, 0, 5);
        G2.add(button34, 1, 5); 
        G2.add(button35, 2, 5);
        G2.add(button36, 3, 5);
        G2.add(button37, 0, 6);
        G2.add(button38, 1, 6);
        G2.add(button39, 2, 6);
        G2.add(button40, 3, 6);
        G2.add(button41, 0, 7);
        G2.add(button42, 1, 7);
        G2.add(button43, 2, 7);
        //this is for first display on the food specials
        G.add(table2, 0, 0);
        G.add(im, 1, 0);
        G.add(finalize1, 0, 4);
        G2.add(table3, 0, 8);
        G2.add(finalize2, 0, 9);
        G3.add(table, 0, 0);
        G3.add(Payed, 0, 1);
        G3.add(Void, 1, 1);
        //this is the delete button
        G.add(Delete,1,4);
        //these add the tabs to the panes
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