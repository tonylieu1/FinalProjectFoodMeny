import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Observable;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.control.Tab;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class FoodMenu extends Application {
 	private Image image2;
 	int count = 0;
 	int count2 = 0;
 	int checkNum;
 	double totalCheckAmount;
 	double totalCheckAmount2;
 	ArrayList<Double> pricesTotal = new ArrayList();
    public static void main(String[] args)throws InstantiationException,IllegalAccessException, ClassNotFoundException {
        launch(args);     
    }
	public void start(Stage primaryStage) {
    	//this is where the customor reicepts will be held 
    	TableView table = new TableView();
    	//table2 is the one that display what the waiter put in
    	TableView table2 = new TableView();
    	//table3 is the invoice tab for checks numbers
    	TableView table3 = new TableView();
    	TableView HistoryOrder = new TableView();
    	TableView Total = new TableView();
    	TableView Topping = new TableView();
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
		TextField texts = new TextField();
		texts.setText("Total:" +totalCheckAmount);
    	im.setImage(image1);
    	im2.setImage(image2);
    	im2.setFitHeight(200);
    	im2.setFitWidth(200);
        TabPane tabPane = new TabPane();
        TabPane tabPane2 = new TabPane();
        TabPane tabPane3 = new TabPane();
        TabPane tabPane4 = new TabPane();
        SplitPane sp = new SplitPane();
        //this is for the user to see when he hit a button 
        TableColumn<String, Menu> t = new TableColumn<>("Food");
        t.setCellValueFactory(new PropertyValueFactory<>("Food"));
        TableColumn<String, Menu> P = new TableColumn<String, Menu>("Price");
        P.setCellValueFactory(new PropertyValueFactory<>("price"));
        TableColumn<String, Menu> t2 = new TableColumn<String, Menu>("Food");
        t2.setCellValueFactory(new PropertyValueFactory<>("Food"));
        TableColumn<String, Menu> p2 = new TableColumn<String, Menu>("Prices");
        p2.setCellValueFactory(new PropertyValueFactory<>("price"));
        TableColumn<Integer, invo> CheckNum = new TableColumn<Integer, invo>("CheckNum");
        CheckNum.setCellValueFactory(new PropertyValueFactory<>("CheckNum"));
        TableColumn<Integer, invo> totalCheck = new TableColumn<Integer, invo>("TotalCheck");
       totalCheck.setCellValueFactory(new PropertyValueFactory<>("TotalCheck"));
       	TableColumn<String, Menu> TopingPrices = new TableColumn<>("TPrice");
       	TopingPrices.setCellValueFactory(new PropertyValueFactory<>("TPrice"));
    	TableColumn<String, Menu> TopingName=new TableColumn<>("NPrice");
       	TopingName.setCellValueFactory(new PropertyValueFactory<>("NPrice"));
        //this the total of all checks
        TableColumn Totalamount = new TableColumn("Total");
        Totalamount.setCellFactory(new PropertyValueFactory<>("Total"));
        table.getColumns().addAll(t,P);
        Topping.getColumns().addAll(TopingName, TopingPrices);
        //this is how item get added
       // table.getItems().add(new Menu("String<food>","String<price>"));
        table2.getColumns().addAll(t2,p2);
        table3.getColumns().addAll(CheckNum,totalCheck);
        HistoryOrder.getColumns().add(totalCheck);
        Total.getColumns().add(Totalamount);
        t.setMinWidth(200);
        t.setMaxWidth(200);
        P.setMaxWidth(100);
        P.setMinWidth(100);
        t2.setMinWidth(200);
        t2.setMaxWidth(200);
        p2.setMaxWidth(100);
        p2.setMinWidth(100);
        CheckNum.setMinWidth(200);
        CheckNum.setMaxWidth(200);
        totalCheck.setMinWidth(100);
        totalCheck.setMaxWidth(100);
        Totalamount.setMinWidth(200);
        Totalamount.setMaxWidth(200);
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
        //this is for the second windw
        Button button44 = new Button("Beef");
        Button button45 = new Button("Chicken");
        Button button46 = new Button("Shrimp");
        Button button47 = new Button("Salmon");
        Button button48 = new Button("Tuna");
        Button button49 = new Button("Fries ");
        Button button50 = new Button("Vegable Medly");
        Button button51 = new Button("Chicken Tender");
        Button button52 = new Button("Onion Rings");
        Button button53 = new Button("Rice");
        Button button54 = new Button("Bean ");
        Button button55 = new Button("Green Beans");
        Button button56 = new Button("Rice");
        Button button57 = new Button("Fruit");
        Button button58 = new Button("Honey mustard");
        Button button59 = new Button("BBQ sauce");
        Button button60 = new Button("Ranch");
        Button button61= new Button("Blue Cheese");
        Button button62 = new Button("Bacon");
        Button button63 = new Button("Lettuce");
        Button button64 = new Button("Tomatoes");
        Button button65 = new Button("Onions");
        Button button66 = new Button("Salad");
        Button button67 = new Button("Crotons");   
        Button button68 = new Button("Add all meats ");
        Button button69 = new Button("Add all Vegetables ");
        Button button70 = new Button("Add Beans and Rice with gravity ");
        Button button71 = new Button("Add Fries and Onions rings ");
        Button button72 = new Button("Add Greens beans and Mash potatoes ");
        Button button73 = new Button("Add all sauces ");
        Button button74 = new Button("Add Green Beans and Vegetable Medley  ");
        //this button will remove the last order put in
        Button Delete = new Button("Remove");
        //this will finalize the pick for the food and send the data to an array
        Button finalize1 = new Button("Finalize");
        //this will be for the Recipet tab to have a payment or void button
        Button Payed = new Button("Payment");
        Button Void = new Button("Void");
        Button ToppingFinalRe = new Button("Remove");
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
        tabPane3.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
        tabPane4.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
        Tab tab1 = new Tab("Food Specials", G);
        Tab tab2 = new Tab("Sides"  , G2);
        Tab tab3 = new Tab("Reciept" , G3);
        //Tab tab4 = new Tab("Invoices", G4);
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
        G3.add(texts, 1, 0);
        G3.add(Payed, 0, 1);
        G3.add(Void, 1, 1);
       // G4.add(table3, 0, 0);
        //G4.add(Total, 0, 1);
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
       // tabPane.getTabs().add(tab4);
        tabPane2.getTabs().add(tab5);
        
        sp.getItems().add(tabPane);
        sp.getItems().add(tabPane2);
        VBox vBox = new VBox(sp);
        Scene scene = new Scene(vBox);
        primaryStage.setHeight(635);
        primaryStage.setWidth(1750);
        //this is what the buttons will do
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
			@SuppressWarnings("unchecked")
			@Override
			public void handle(ActionEvent e) {
			Button BName = (Button) e.getSource();
			String FoodChose = BName.getText();
			String PricsDouble = Double.toString(count);
			PricsDouble = PricsDouble + "0";
			table2.getItems().add(new Menu(FoodChose,PricsDouble));
			table.getItems().add(new Menu(FoodChose,PricsDouble));
			addCheck(PricsDouble);
			counting();
			}
        };
        //this remove the last entry for the food 
        EventHandler<ActionEvent> DeleteR = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				table2.getItems().remove(count-1);
				table.getItems().remove(count-1);
				subCheck();
				minusCount();
			}
        };
       //this one finazlie the food chosen
        EventHandler<ActionEvent> Finallize = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				if(table2.getItems().isEmpty()) {
					return;
				}
				else {
				table2.getItems().clear();
				count = 0;
				checkNum++;
				texts.setText("Total:" +totalCheckAmount);
				}
			}
        };
        //this will give the final stuff
        EventHandler<ActionEvent> payment = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(table2.getItems().isEmpty()) {
				table.getItems().clear();
				totalCheckAmount = 0;
				texts.setText("Total:" +totalCheckAmount);
				}
			}
        };
        EventHandler<ActionEvent> TopingGenerator = new EventHandler<ActionEvent>() {
     			@Override
     			public void handle(ActionEvent e) {
     				Button BName = (Button) e.getSource();
     				Button Yes = new Button("Yes");
     				Button No = new Button("No");
     				Button Done = new Button("Done");
     				GridPane Gp = new GridPane();
     				Gp.setVgap(20);
     				Gp.setHgap(20);
     				Gp.add(Yes, 0,1);
     				Gp.add(No,1,1);
     				Stage newWindow = new Stage();
     				Scene secondScene = new Scene(Gp, 230, 100);
     				newWindow.setTitle("Topping Window");
     				newWindow.setScene(secondScene);
     			   newWindow.setX(primaryStage.getX() + 200);
                   newWindow.setY(primaryStage.getY() + 100);
                   newWindow.show();
                   EventHandler<ActionEvent> NoButon = new EventHandler<ActionEvent>() {
    					@Override
    					public void handle(ActionEvent e) {
    						// TODO Auto-generated method stub
    						String FoodChose = BName.getText();
     						String PricsDouble = Double.toString(count);
     						PricsDouble = PricsDouble + "0";
     						table2.getItems().add(new Menu(FoodChose,PricsDouble));
     						table.getItems().add(new Menu(FoodChose,PricsDouble));
     						addCheck(PricsDouble);
     						counting();
    						newWindow.close();
    					}
    		        };   
    		     
     		       EventHandler<ActionEvent> Yesb = new EventHandler<ActionEvent>() {
    					@Override
    					public void handle(ActionEvent arg0) {
    						newWindow.close();
    	     				GridPane Gp2 = new GridPane();
    	     				GridPane Gp3 = new GridPane();
    	     				Gp2.setVgap(20);
    	     				Gp2.setHgap(20);
    	     				Gp3.setVgap(20);
    	     				Gp3.setHgap(20);
    	     				Gp2.add(button44, 0, 0);
    	     				Gp2.add(button45, 1, 0);
    	     				Gp2.add(button46, 2, 0);
    	     				Gp2.add(button47, 3, 0);
    	     				Gp2.add(button48, 4, 0);
    	     				Gp2.add(button49, 0, 1);
    	     				Gp2.add(button50, 1, 1);
    	     				Gp2.add(button51, 2, 1);
    	     				Gp2.add(button52, 3, 1);
    	     				Gp2.add(button53, 4, 1);
    	     				Gp2.add(button54, 0, 2);
    	     				Gp2.add(button55, 1, 2);
    	     				Gp2.add(button56, 2, 2);
    	     				Gp2.add(button57, 3, 2);
    	     				Gp2.add(button58, 4, 2);
    	     				Gp2.add(button59, 0, 3);
    	     				Gp2.add(button60, 1, 3);
    	     				Gp2.add(button61, 2, 3);
    	     				Gp2.add(button62, 3, 3);
    	     				Gp2.add(button63, 4, 3);
    	     				Gp2.add(button64, 0, 4);
    	     				Gp2.add(button65, 1, 4);
    	     				Gp2.add(button66, 2, 4);
    	     				Gp2.add(button67, 3, 4);
    	     				Gp2.add(button68, 4, 4);
    	     				Gp2.add(button69, 0, 5);
    	     				Gp2.add(button70, 1, 5);
    	     				Gp2.add(button71, 2, 5);
    	     				Gp2.add(button72, 3, 5);
    	     				Gp2.add(button73, 4, 5);
    	     				Gp2.add(button74, 0, 6);
    	     				Gp3.add(Topping, 0, 0);
    	     				Gp3.add(Done, 0 , 1);
    	     				Gp3.add(ToppingFinalRe, 1, 1);
    	     				SplitPane sp2 = new SplitPane();
    	     				Stage newWindow2 = new Stage();
    	     				Tab Tab1Toping = new Tab("Topping",Gp2);
    	     				Tab Tab2Pricing = new Tab("Display",Gp3);
    	     				tabPane3.getTabs().add(Tab1Toping);
    	     				tabPane4.getTabs().add(Tab2Pricing);
    	     				sp2.getItems().add(tabPane3);
    	     				sp2.getItems().add(tabPane4);
    	     				sp2.setDividerPositions(0.7);
    	                   VBox vBox2 = new VBox(sp2);
    	                   Scene scene = new Scene(vBox2);
    	                 newWindow2.setHeight(635);
    	                 newWindow2.setWidth(1750);
    	     				newWindow2.setTitle("Topping Window");
    	     				newWindow2.setScene(scene);
    	                   newWindow2.show();
    	                  
    					}
    		        };
    		        EventHandler<ActionEvent> FoodButtons = new EventHandler<ActionEvent>() {
     					@Override
     					public void handle(ActionEvent e) {
     						String FoodChose = BName.getText();
     						String PricsDouble = Double.toString(count);
     						PricsDouble = PricsDouble + "0";
     						table2.getItems().add(new Menu(FoodChose,PricsDouble));
     						table.getItems().add(new Menu(FoodChose,PricsDouble));
     						addCheck2(PricsDouble);
     						counting2();
     					}
     		        };
     		       EventHandler<ActionEvent> Remove2 = new EventHandler<ActionEvent>() {
     					@Override
     					public void handle(ActionEvent arg0) {
     						Topping.getItems().remove(count2-1);
     						subCheck();
     						minusCount();
     					}
     		        };
    		        
    		           EventHandler<ActionEvent> Dones = new EventHandler<ActionEvent>() {
     					@Override
     					public void handle(ActionEvent arg0) {
     						
     					}
     		        };
    		        No.setOnAction(NoButon);
    		        Yes.setOnAction(Yesb);
     			}
             };
       //this is the setOnAction for the buttons so the button have an action to do
       button1.setOnAction(TopingGenerator);
       button2.setOnAction(event);
       button3.setOnAction(event);
       button4.setOnAction(event);
       button5.setOnAction(event);
       button6.setOnAction(event);
       button7.setOnAction(event);
       button8.setOnAction(event);
       button9.setOnAction(event);
       button10.setOnAction(event);
       button11.setOnAction(event);
       button12.setOnAction(event);
       button13.setOnAction(event);
       button14.setOnAction(event);
       button15.setOnAction(event);
       button16.setOnAction(event);
       button17.setOnAction(event);
       button18.setOnAction(event);
       button19.setOnAction(event);
       button20.setOnAction(event);
       button21.setOnAction(event);
       button22.setOnAction(event);
       button23.setOnAction(event);
       button24.setOnAction(event);
       button25.setOnAction(event);
       button26.setOnAction(event);
       button27.setOnAction(event);
       button28.setOnAction(event);
       button29.setOnAction(event);
       button30.setOnAction(event);
       button31.setOnAction(event);
       button32.setOnAction(event);
       button33.setOnAction(event);
       button34.setOnAction(event);
       button35.setOnAction(event);
       button36.setOnAction(event);
       button37.setOnAction(event);
       button38.setOnAction(event);
       button40.setOnAction(event);
       button41.setOnAction(event);
       button42.setOnAction(event);
       button43.setOnAction(event);
       Delete.setOnAction(DeleteR);
       finalize1.setOnAction(Finallize);
       Payed.setOnAction(payment);
       Void.setOnAction(payment);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FoodMenu");
        primaryStage.show();
    }//these method is so the remove button will remove the last food entry is deleted from the menu
    public void counting() {
    	count++;
    }
    public void minusCount(){
    	if(count !=0) {
    		count--;
    	}
    }
    public void addCheck(String num) {
    	double number = Double.valueOf(num);
    	pricesTotal.add(number);
    	totalCheckAmount =  totalCheckAmount + number;
    }
    public void addCheck2(String num) {
    	double number = Double.valueOf(num);
    	pricesTotal.add(number);
    	totalCheckAmount2 =  totalCheckAmount2 + number;
    }
    public void subCheck() {
    	totalCheckAmount2 = totalCheckAmount2 - pricesTotal.get(count-1);
    }
    public void counting2() {
    	count2++;
    }
    public void minusCount2(){
    	if(count2 !=0) {
    		count2--;
    	}
    }
}
