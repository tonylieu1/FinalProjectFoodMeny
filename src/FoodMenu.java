

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.control.Tab;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import rick.FoodFactory;

public class FoodMenu extends Application {

 	private Image image2;
    public static void main(String[] args)throws InstantiationException,IllegalAccessException, ClassNotFoundException {
        launch(args);
        
    }

    @SuppressWarnings("unchecked")
	public void start(Stage primaryStage) {
    	//this is where the customor reicepts will be held 
    	TableView table = new TableView();
    	//table2 is the one that display what the waiter put in
    	TableView table2 = new TableView();
    	//table3 is the invoice tab for checks numbers
    	TableView table3 = new TableView();
    	TableView HistoryOrder = new TableView();
    	TableView Total = new TableView();
    	BackgroundFill backg = new BackgroundFill(Color.BLACK, null, null);
    	Background backgs = new Background(backg);
    	URL url = this.getClass().getResource("/images/Rest.jpg");
    	URL url2 = this.getClass().getResource("/images/winkel-coronavirus-post.jpg");
    	ImageView im2 = new ImageView();
    	Image image1 = null;
    	ImageView im = new ImageView();
		try {
			image1 = new Image(new FileInputStream(url.getPath()));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			image2 = new Image(new FileInputStream(url2.getPath()));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	im.setImage(image1);
    	im2.setImage(image2);
    	im2.setFitHeight(200);
    	im2.setFitWidth(200);
        TabPane tabPane = new TabPane();
        TabPane tabPane2 = new TabPane();
  
        SplitPane sp = new SplitPane();
        //this is for the user to see when he hit a button 
        TableColumn<String, Menu> t = new TableColumn<>("Food");
        t.setCellValueFactory(new PropertyValueFactory<>("Food"));
        TableColumn<String, Menu> P = new TableColumn("Price");
        P.setCellValueFactory(new PropertyValueFactory<>("price"));
        TableColumn t2 = new TableColumn("Food");
        t2.setCellValueFactory(new PropertyValueFactory<>("Food"));
        TableColumn p2 = new TableColumn("Prices");
        p2.setCellValueFactory(new PropertyValueFactory<>("price"));
        TableColumn CheckNum = new TableColumn("CheckNum");
        TableColumn HistoyOrders = new TableColumn("Total Check");
        //this the total of all checks
        TableColumn Totalamount = new TableColumn("Total");
        table.getColumns().addAll(t,P);
        //this is how item get added
       // table.getItems().add(new Menu("String<food>","String<price>"));
        table2.getColumns().addAll(t2,p2);
      ;
        table3.getColumns().addAll(HistoyOrders, CheckNum);
        Total.getColumns().add(Totalamount);
        t.setMinWidth(200);
        t.setMaxWidth(200);
        P.setMaxWidth(100);
        P.setMinWidth(100);
        t2.setMinWidth(200);
        t2.setMaxWidth(200);
        p2.setMaxWidth(100);
        p2.setMinWidth(100);
        

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
        Button button13 = new Button("Beef");
        Button button14 = new Button("Chicken");
        Button button15 = new Button("Shrimp");
        Button button16 = new Button("Salmon");
        Button button17 = new Button("Tuna");
        Button button18 = new Button("Fries ");
        Button button19 = new Button("Vegable Medly");
        Button button20 = new Button("Chicken Tender");
        Button button21 = new Button("Onion Rings");
        Button button22 = new Button("Rice");
        Button button23 = new Button("Bean ");
        Button button24 = new Button("Green Beans");
        Button button25 = new Button("Rice");
        Button button26 = new Button("Fruit");
        Button button27 = new Button("Honey mustard");
        Button button28 = new Button("BBQ sauce");
        Button button29 = new Button("Ranch");
        Button button30 = new Button("Blue Cheese");
        Button button31 = new Button("Bacon");
        Button button32 = new Button("Lettuce");
        Button button33 = new Button("Tomatoes");
        Button button34 = new Button("Onions");
        Button button35 = new Button("Salad");
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
        //this will be for the Recipet tab to have a payment or void button
        Button Payed = new Button("Payment");
        Button Void = new Button("Void");
        
     
        //this is for the tabs to have a grid sturtures
        GridPane G= new GridPane();
        GridPane G2 = new GridPane();
        GridPane G3 = new GridPane();
        GridPane G4 = new GridPane();
        GridPane G5 = new GridPane();
        //this set the distance inbetween the buttons on the grid
        G.setHgap(10);
        G.setVgap(20);
        G2.setHgap(20);
        G2.setVgap(20);
        G3.setVgap(50);
        G5.setHgap(20);
        G5.setVgap(20);
 
        //this make the tabs not closeable
        tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
        tabPane2.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
        Tab tab1 = new Tab("Food Specials", G);
        Tab tab2 = new Tab("Sides"  , G2);
        Tab tab3 = new Tab("Reciept" , G3);
        Tab tab4 = new Tab("Invoices", G4);
        Tab tab5 = new Tab("Displays", G5);
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
        //this is the background color
        G.setBackground(backgs);
        G2.add(button13, 1,1);
        G2.add(button14, 2,1);
        G2.add(button15, 3,1);
        G2.add(button16, 4,1);
        G2.add(button17, 1, 2);
        G2.add(button18, 2, 2);
        G2.add(button19, 3, 2);
        G2.add(button20, 4, 2);
        G2.add(button21, 1, 3);
        G2.add(button22, 2, 3);
        G2.add(button23, 3, 3);
        G2.add(button24, 4, 3);
        G2.add(button25, 1,4);
        G2.add(button26, 2,4);
        G2.add(button27, 3,4);
        G2.add(button28, 4,4);
        G2.add(button29, 1, 5);
        G2.add(button30, 2, 5);
        G2.add(button31, 3, 5);
        G2.add(button32, 4, 5);
        G2.add(button33, 1, 6);
        G2.add(button34, 2, 6); 
        G2.add(button35, 3, 6);
        G2.add(button36, 4, 6);
        G2.add(button37, 1, 7);
        G2.add(button38, 2, 7);
        G2.add(button39, 3, 7);
        G2.add(button40, 4, 7);
        G2.add(button41, 1, 8);
        G2.add(button42, 2, 8);
        G2.add(button43, 3, 8);
        G2.setBackground(backgs);
        G.add(im, 1, 0);
        G2.add(im2, 1, 0);
        G3.add(table, 0, 0);
        G3.add(Payed, 0, 1);
        G3.add(Void, 1, 1);
        G4.add(table3, 0, 0);
        G4.add(Total, 0, 1);
        G4.setBackground(backgs);
        G3.setBackground(backgs);
        G5.add(table2, 0, 0);
        GridPane.setHalignment(finalize1, HPos.RIGHT);
      
        G5.add(finalize1, 0, 1);
        G5.add(Delete, 1, 1 );
        //this is the delete button
     
        //these add the tabs to the panes
        tabPane.getTabs().add(tab1);
        tabPane.getTabs().add(tab2);
        tabPane.getTabs().add(tab3);
        tabPane.getTabs().add(tab4);
        tabPane2.getTabs().add(tab5);
        
        sp.getItems().add(tabPane);
        sp.getItems().add(tabPane2);
        VBox vBox = new VBox(sp);
        Scene scene = new Scene(vBox);
        primaryStage.setHeight(635);
        primaryStage.setWidth(1750);
        //this is what the buttons will do
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
			String FoodChose = button13.getText();
			FoodFactory f = new FoodFactory();
			f.setFood(FoodChose);
			String PricsDouble = Double.toString(3.00);
			PricsDouble = PricsDouble + "0";
			table.getItems().add(new Menu(FoodChose,PricsDouble));
			table2.getItems().add(new Menu(FoodChose,PricsDouble));
			}
        	
        };
       
       button13.setOnAction(event);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("FoodMenu");

        primaryStage.show();
    }

}
