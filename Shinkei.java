import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.util.*;

public class Shinkei extends Application{
	private String k[]=new String[16];
	private int a[]=new int[16];
	private int m1=0,s1=0;
	private String c1,c2,d1,d2,m2,s2;
	private int count=1;
	private Button button2=null;
	private Button button3=null;
	private Button bs=null;
	private Button b1=null;
	private Button b2=null;
	private Button b3=null;
	private Button b4=null;
	private Button b5=null;
	private Button b6=null;
	private Button b7=null;
	private Button b8=null;
	private Button b9=null;
	private Button b10=null;
	private Button b11=null;
	private Button b12=null;
	private Button b13=null;
	private Button b14=null;
	private Button b15=null;
	private Button b16=null;
	private Label ls=null;
	private Label sNo=null;
	private Label lm=null;
	private Label mNo=null;
	
	
	@Override
	public void start(Stage stage) throws Exception{
		stage.setTitle("Rep3");
		
		this.bs=new Button("START");bs.setPrefSize(160.0,80.0);		
		this.ls=new Label("SCORE:");ls.setPrefSize(80.0,80.0);
		this.sNo=new Label("");sNo.setPrefSize(80.0,80.0);
		
		this.b1=new Button("");b1.setPrefSize(80.0,80.0);
		this.b2=new Button("");b2.setPrefSize(80.0,80.0);
		this.b3=new Button("");b3.setPrefSize(80.0,80.0);
		this.b4=new Button("");b4.setPrefSize(80.0,80.0);
		this.b5=new Button("");b5.setPrefSize(80.0,80.0);
		this.b6=new Button("");b6.setPrefSize(80.0,80.0);
		this.b7=new Button("");b7.setPrefSize(80.0,80.0);
		this.b8=new Button("");b8.setPrefSize(80.0,80.0);
		this.b9=new Button("");b9.setPrefSize(80.0,80.0);
		this.b10=new Button("");b10.setPrefSize(80.0,80.0);
		this.b11=new Button("");b11.setPrefSize(80.0,80.0);
		this.b12=new Button("");b12.setPrefSize(80.0,80.0);
		this.b13=new Button("");b13.setPrefSize(80.0,80.0);
		this.b14=new Button("");b14.setPrefSize(80.0,80.0);
		this.b15=new Button("");b15.setPrefSize(80.0,80.0);
		this.b16=new Button("");b16.setPrefSize(80.0,80.0);
		
		this.lm=new Label("MISS:");lm.setPrefSize(80.0,80.0);
		this.mNo=new Label("");mNo.setPrefSize(240.0,80.0);
		
		bs.setOnAction(new MyEventHandler());
		b1.setOnAction(new MyEventHandler());
		b2.setOnAction(new MyEventHandler());
		b3.setOnAction(new MyEventHandler());
		b4.setOnAction(new MyEventHandler());
		b5.setOnAction(new MyEventHandler());
		b6.setOnAction(new MyEventHandler());
		b7.setOnAction(new MyEventHandler());
		b8.setOnAction(new MyEventHandler());
		b9.setOnAction(new MyEventHandler());
		b10.setOnAction(new MyEventHandler());
		b11.setOnAction(new MyEventHandler());
		b12.setOnAction(new MyEventHandler());
		b13.setOnAction(new MyEventHandler());
		b14.setOnAction(new MyEventHandler());
		b15.setOnAction(new MyEventHandler());
		b16.setOnAction(new MyEventHandler());
		
		HBox h1=new HBox();h1.getChildren().addAll(bs,ls,sNo);
		HBox h2=new HBox();h2.getChildren().addAll(b1,b2,b3,b4);
		HBox h3=new HBox();h3.getChildren().addAll(b5,b6,b7,b8);
		HBox h4=new HBox();h4.getChildren().addAll(b9,b10,b11,b12);
		HBox h5=new HBox();h5.getChildren().addAll(b13,b14,b15,b16);
		HBox h6=new HBox();h6.getChildren().addAll(lm,mNo);
		VBox vbox=new VBox();vbox.getChildren().addAll(h1,h2,h3,h4,h5,h6);
		
		
		stage.setScene(new Scene(vbox));
		stage.show();
	}

	class MyEventHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent event){
			Button button1=(Button)event.getSource();
		
			//startボタンが押されたら
			if(button1.getText().equals("START")){
				count=1;m1=0;s1=0;          
				b1.setText("1");b1.setDisable(false);
				b2.setText("2");b2.setDisable(false);
				b3.setText("3");b3.setDisable(false);
				b4.setText("4");b4.setDisable(false);
				b5.setText("5");b5.setDisable(false);
				b6.setText("6");b6.setDisable(false);
				b7.setText("7");b7.setDisable(false);
				b8.setText("8");b8.setDisable(false);
				b9.setText("9");b9.setDisable(false);
				b10.setText("10");b10.setDisable(false);
				b11.setText("11");b11.setDisable(false);
				b12.setText("12");b12.setDisable(false);
				b13.setText("13");b13.setDisable(false);
				b14.setText("14");b14.setDisable(false);
				b15.setText("15");b15.setDisable(false);
				b16.setText("16");b16.setDisable(false);
				sNo.setText("0");sNo.setDisable(false);
				mNo.setText("0");mNo.setDisable(false);
				ls.setText("SCORE:");ls.setDisable(false);
				lm.setText("MISS:");lm.setDisable(false);
				
				//1~16の乱数の生成
				Random r=new Random();
				for(int i=0;i<16;i++){
					a[i]=r.nextInt(16)+1;
					int x=a[i];
					for(i=0;i<16;i++)
					if(a[i]==x)break;
				}
				
				//生成した乱数にアルファベットを当てはめる
        			for(int i=0;i<16;i++){
        				if(a[i]==1||a[i]==2){k[i]="A";}
        				if(a[i]==3||a[i]==4){k[i]="B";}
        				if(a[i]==5||a[i]==6){k[i]="C";}
        				if(a[i]==7||a[i]==8){k[i]="D";}
        				if(a[i]==9||a[i]==10){k[i]="E";}
        				if(a[i]==11||a[i]==12){k[i]="F";}
        				if(a[i]==13||a[i]==14){k[i]="G";}
        				if(a[i]==15||a[i]==16){k[i]="H";}
        			}
        	}
        	//数字のボタンを押された時
        	else {
        		//めくったのが奇数回目のとき
        		if(count%2==1){
        			if(button2!=null&&button3!=null){
        				button2.setText(d1);
        				button3.setText(d2);
        			}
        			d1=button1.getText();	
        			c1=k[Integer.parseInt(d1)-1];
        			button1.setText(c1);
        			button2=button1;
        			count++;
        		}
        		else{
        			d2=button1.getText();
        			c2=k[Integer.parseInt(d2)-1];
        			button1.setText(c2);
        			button3=button1;
        			if(c1==c2){          //2枚のカードが同じだったら
        				button1.setDisable(true);          //ボタンを押せなくする
        				button2.setDisable(true);
        				count++;
        				button2=null;
        				button3=null;
        				s1=s1+2;
        				s2=String.valueOf(s1);
        				sNo.setText(s2);
        				if(s1==16){          //全部揃えることができたら
        					ls.setText("GAME");          //クリアの表示
        					lm.setText("");
        					sNo.setText("CLEAR!!!");
        					mNo.setText("PUSH START! PLAY AGAIN!");
        				}
        			}
        			else{
        				m1++;
        				m2=String.valueOf(m1);
        				mNo.setText(m2);
        				count++;
        				if(m1==8){//8回失敗した時
        					ls.setText("GAME");          //ゲームオーバーの表示
        					lm.setText("RETRY!!");
        					sNo.setText("OVER...");
        					mNo.setText("PUSH START! PLAY AGAIN!");
        					//ボタンを押せなくする
        					b1.setDisable(true);
        					b2.setDisable(true);
        					b3.setDisable(true);
        					b4.setDisable(true);
        					b5.setDisable(true);
        					b6.setDisable(true);
        					b7.setDisable(true);
        					b8.setDisable(true);
        					b9.setDisable(true);
        					b10.setDisable(true);
        					b11.setDisable(true);
        					b12.setDisable(true);
        					b13.setDisable(true);
        					b14.setDisable(true);
        					b15.setDisable(true);
        					b16.setDisable(true);
        				}
        			}
        		}
        				
        }
       }
     }
}
