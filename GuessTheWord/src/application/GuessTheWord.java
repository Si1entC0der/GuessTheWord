package application;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.regex.Pattern;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class GuessTheWord extends Application {
	
	public static void main(String[] args) {
    	
        launch(args);
        
    } 
	
	String[] words_list = {
        "ABACK","ABAFT","ABOON","ABOUT","ABOVE","ABUSE","ABYSS","ACCEL","ADIEU","ADMIT","ADOPT","ADORE","ADOWN","ADULT","AFOOT","AFORE","AFOUL","AFTER","AGAIN","AGAPE","AGENT","AGOGO","AGONE","AGREE","AHEAD","AHULL","ALIFE","ALIKE","ALLOW","ALOFT","ALONE","ALONG","ALOOF","ALOUD","ALTER","AMISS","AMONG","AMPLE","AMPLY","ANGER","ANKLE","APACE","GREET","APART","VALID","THESE","APPLE","APPLY","APTLY","AREAR","ARGUE","ARISE","AROMA","ASIDE","ASKEW","AUDIO","AUDIT","AURAL","AVOID","AWARD","FEVER","THREE","AWFUL","BADLY","BALLY","BASIS","BEACH","BEGAN","BEGIN","BELOW","BIRTH","BLAME","BLOCK","BLOOD","BLUNT","BOARD","BRAID","BRAIN","BREAD","BREAK","BRING","BRISK","BLACK","BROWN","BRUSH","BUILD","BUMPY","BURST","BUYER","CANNY","CARRY","CATCH","CAUSE","CHAIN","CHAIR","CHEAP","CHECK","CHEST","CHIEF","CHILD","CHINA","CHIVE","CHORD","CIRCA","CLAIM","CLASP","CLASS","CLEAN","CLEAR","CLICK","CLIMB","CLOCK","CLOSE","CLOUD","COACH","COAST","COUNT","COURT","COVER","COYLY","CRAVE","CREAM","CREST","CRIME","CROSS","CROWD","CROWN","CUMIN","CYCLE","HOVER","HELLO","DAILY","DANCE","DEATH","DEPTH","DIARY","DIMLY","DIRTY","DITTO","DOUBT","DRAFT","DRAMA","DRAPE","DREAM","DREGS","DRESS","DRINK","DRIVE","DRYLY","DULLY","DUMPY","DUSKY","DWELL","EARLY","EARTH","ELITE","EMBER","ENACT","ENEMY","ENJOY","ENTER","ENTRY","ERROR","EVADE","EVENT","EVOKE","EXIST","EXTRA","FABLE","FAITH","FALSE","FATLY","FAULT","FEYLY","FIELD","FIGHT","FINAL","FIRST","FITLY","FLAIR","FLOOR","FLUKE","FLUTE","FOCUS","FOLLY","FORCE","FORTE","FORTH","FRAME","FRANK","FRESH","FRONT","FRUIT","FULLY","FUNNY","GAILY","GAUZE","GAYLY","GHOST","GIDDY","GLASS","GLOOM","GODLY","GORGE","GRANT","GRAPE","GRASS","GREAT","GREEN","GROUP","GUESS","GUIDE","GUSTY","HAPLY","HAPPY","HASTE","HEART","HEAVY","HELLA","HENCE","HENRY","HILLY","HIPPY","HORSE","HOTEL","HOTLY","HOUSE","HOVEL","HUNCH","ICILY","IMAGE","IMPLY","INDEX","INEPT","INERT","INFRA","INPUT","INTL.","IRATE","ISSUE","IVORY","JADED","JAPAN","JAZZY","JILDI","JOLLY","JONES","JOUST","JUDGE","JUICE","JUMPY","KINKY","KNACK","KNAVE","KNEAD","KNIFE","KUDOS","LANKY","LATCH","LAUGH","LAURA","LAXLY","LAYER","LEARN","LEAVE","LENTO","LEVEL","LEWIS","LIGHT","LIMIT","LOLLY","LOUIE","LOWLY","LUNCH","LURID","MADLY","MAJOR","MARCH","MARRY","MATCH","MAYBE","METAL","MINUS","MIRTH","MODEL","MONEY","MONTH","MOODY","MOTOR","MOURN","MOUTH","MOWER","MUGGY","MUSIC","NANNY","NAPPY","NEATH","NERVE","NEVER","NEWLY","NIFTY","NIGHT","NOBLY","NOISE","NORTH","NOVEL","NUDGE","NURSE","OCCUR","ODDLY","OFFER","OFTEN","OLIVE","ONSET","OOMPH","ORDER","OREAD","OTHER","OUGHT","OUNCE","OVALS","OWNER","PANEL","PAPER","PARTY","PEACE","PEPPY","PETER","PHASE","PHONE","PIANO","PIECE","PILOT","PIOUS","PIQUE","PITCH","PIZZA","PLACE","PLAIN","PLANE","PLANT","PLATE","PLONK","PLUMB","PLUSH","POINT","POISE","POUND","POWER","PRESS","PRICE","PRIDE","PRIOR","PRIZE","PROOF","PROVE","QUAIL","QUAKE","QUEEN","QUEER","QUELL","QUICK","QUILL","QUIRK","QUITE","RADIO","RAISE","RAMEN","RANGE","RAPID","RATIO","RAVEL","REACH","REDLY","REEDY","REFER","RELAX","REPLY","RIGHT","RIVER","ROUGH","ROUND","ROUTE","RUDDY","RUGBY","RUNIC","SABLE","SADLY","SALAD","SAUCE","SCALE","SCENE","SCOPE","SCORE","SECUS","SELLY","SENSE","SERVE","SHALL","SHAPE","SHARE","SHARP","SHEEP","SHEER","SHEET","SHIFT","SHILY","SHIRT","SHOCK","SHOES","SHOOT","SHORT","SHYLY","SIGHT","SILLY","SIMON","SINCE","SKILL","SLEEK","SLEEP","SLYLY","SMALL","SMILE","SMITH","SMOKE","SNACK","SNAKE","SOLVE","SOUND","SOUTH","SPACE","SPANG","SPEAK","SPEED","SPEND","SPICE","SPICY","SPITE","SPLIT","SPOON","SPORT","SQUAD","STAFF","STAGE","STAND","STARK","START","STATE","STEAM","STEEL","STICK","STILL","STILT","STOCK","STONE","STORE","STORM","STOUR","STUDY","STUFF","STYLE","SUGAR","SUPER","SWATH","SWIRL","TABLE","TALLY","TANTO","TASTE","TEACH","TERRY","THANK","THEME","THERE","THICK","THING","THINK","THROW","TIGER","TIGHT","TITLE","TOAST","TODAY","TOMOZ","TONIC","TOTAL","TOUCH","TOWER","TRACK","TRADE","TRAIN","TREAT","TREND","TRIAD","TRIAL","TRULY","TRUST","TRUTH","TRYST","TWEAK","TWICE","UNCLE","UNDER","UNION","UNITY","UNTIL","URATE","UTTER","VALUE","VERRY","VIDEO","VISIT","VOICE","WANLY","WASTE","WATCH","WATER","WETLY","WHALE","WHEEL","WHERE","WHILE","WHITE","WHOLE","WOMAN","WORLD","WORRY","WOULD","WRITE","WRONG","WRYLY","YOUTH"
	};
	List<String> list_check = Arrays.asList(words_list);
	
	int ran = (int)(Math.random()*list_check.size());
	
	final String secret_word = list_check.get(ran);
    private TextField[][] textFields;
    private int currentLine = 0;
    private int currentField = 0;

    
    @Override
    public void start(Stage primaryStage) {

//    	System.out.println(secret_word);
        
    	primaryStage.getIcons().add(
    			   new Image(
    			      GuessTheWord.class.getResourceAsStream( "icon.png" ))); 
    	
        GridPane root = new GridPane();
        root.setHgap(5);
        root.setVgap(5);
        root.setPadding(new Insets(30));
        
        int numLines = 5;
        int numFieldsPerLine = 5;
        textFields = new TextField[numLines][numFieldsPerLine];
        
        Pattern pattern = Pattern.compile("[a-zA-Z]*");
        UnaryOperator<TextFormatter.Change> filter = c -> {
            if (pattern.matcher(c.getControlNewText()).matches()) {
                return c;
            } else {
                return null ;
            }
        };
        
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < numFieldsPerLine; j++) {
                TextField textField = createSingleCharacterTextField(i, j);
                TextFormatter<String> formatter = new TextFormatter<>(filter);
                textField.setMinHeight(50);
                textField.setMinWidth(50);              	
            	textField.setDisable(true);
            	textField.setTextFormatter(formatter);
                textFields[i][j] = textField;
                root.add(textField, j, i);
            }
        }
        
        textFields[0][0].setDisable(false);

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("GuessTheWord.css").toExternalForm());
        primaryStage.setTitle("Guess the Word");
        primaryStage.setScene(scene);
        
		Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Instructions!");
        alert.setHeaderText(null);
        alert.setGraphic(null);
        alert.setContentText("1) Enter a 5-letter word.\n2) Check the tile colors.\n--> A green tile indicates that you've guessed the correct letter in the correct place in the word.\n--> A yellow tile means you've guessed a letter that's in the word, but not in the right spot.\n3) Guess another word.\n--> Use the clues you got from your first guess to try again.\n--> Letters can appear more than once in the same word.\n"
        		+ "4) Continue entering your guesses until all letters are green.");
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(
            new Image(this.getClass().getResource("icon.png").toString()));
        alert.showAndWait();
        
        primaryStage.show();
        primaryStage.setResizable(false);
        
        
    }
    
    private TextField createSingleCharacterTextField(int line, int field) {
        TextField textField = new TextField();
        textField.getStyleClass().add("custom");
        textField.setPrefColumnCount(1);
        
        textField.textProperty().addListener((observable, oldValue, newValue) -> {
//			System.out.println(newValue);
	        if (newValue.length() > 0) {    			
	    		Character tmpBuilder = newValue.charAt(0);
	    		
	    		if (Character.isUpperCase(tmpBuilder)) {
	            	if (newValue.length() == 1 && currentField < textFields[currentLine].length - 1) {
	                    currentField++;
	                    textFields[currentLine][currentField].setDisable(false);
	                    textFields[currentLine][currentField].requestFocus();
	            		}
	    			else {
	    				textField.setText(tmpBuilder.toString());
					}
	            }

	    		
	    		else if (oldValue.isEmpty() && !newValue.isEmpty()) {
    				textField.setText(tmpBuilder.toString().toUpperCase());	
	
	    		}
//	    		System.out.println(currentField);
	            }
	        });
        
        
        textField.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                if (currentField == textFields[currentLine].length - 1 && !textFields[currentLine][currentField].getText().isEmpty()) {
                    if (currentLine < textFields.length - 1) {
                        currentLine++;
                        currentField = 0;
                        textFields[currentLine][currentField].setDisable(false);
                        textFields[currentLine][currentField].requestFocus();
                    }
                }
                
                StringBuilder rowString = new StringBuilder();
                StringBuilder checkString = new StringBuilder();
                String result = "";

                for (int i = 0; i < textFields.length; i++) {
                    for (int j = 0; j < textFields[i].length; j++) {
                        rowString.append(textFields[i][j].getText());
                        checkString.append(textFields[i][j].getText());
                    }
                    
                    
//                    System.out.println("Check String: " + checkString + " i: "+i);
                    if (checkString.length() == 5) {
                    	result = checkString.toString();
                    	for (int k=0; k<5; k++) {
                    		if (checkString.charAt(k) == secret_word.charAt(k)){
                    			textFields[i][k].getStyleClass().add("success");
                    		}
                    		else if (secret_word.indexOf(checkString.charAt(k)) != -1) {
                    			textFields[i][k].getStyleClass().add("orange");
							}
                    	}
                    	
                    }

                    checkString.setLength(0); 
//                    System.out.println(result);

                    if (i < textFields.length - 1) {
                        rowString.append("\n");                      
                    }
                    
//                    System.out.println("Row String: " + rowString.toString());
                }
                
//                System.out.println(result + " | " + list_check.contains(result));
                int len = rowString.toString().replaceAll("\n", "").length();
                if (result.length()!=0 && len%5==0){
                	
                	if (result.equals(secret_word)){
                		Alert alert = new Alert(AlertType.INFORMATION);
                        alert.setTitle("Congrats!!!");
                        alert.setHeaderText(null);
                        alert.setGraphic(null);
                        alert.setContentText(" CONGRATULATIONS!! YOU GUESSED THE CORRECT WORD <3");
                        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
                        stage.getIcons().add(
                            new Image(this.getClass().getResource("icon.png").toString()));
                        alert.showAndWait();
                        javafx.application.Platform.exit();
					}
                	
                	else if (len == 25) {
              		  	Alert alert = new Alert(AlertType.ERROR);
                        alert.setTitle("Better luck next time");
                        alert.setHeaderText(null);
                        alert.setContentText("Oops!! YOU HAVE USED UP ALL THE 5 CHANCES \n\n\t THE CORRECT WORD IS "+secret_word);
                        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
                        stage.getIcons().add(
                            new Image(this.getClass().getResource("icon.png").toString()));
                        alert.showAndWait();
                        javafx.application.Platform.exit();
                	}
                	else if (!list_check.contains(result)){
              		  	Alert alert = new Alert(AlertType.WARNING);
                        alert.setTitle("Word Not Found");
                        alert.setHeaderText(null);
                        alert.setContentText("\""+result+"\" IS NOT ON OUR WORD LIST.");
                        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
                        stage.getIcons().add(
                            new Image(this.getClass().getResource("icon.png").toString()));
                        alert.showAndWait();
                        
//                        System.out.println(currentLine);
                    	for (int i = 0; i < textFields.length; i++) {
                    		textFields[len/5-1][i].getStyleClass().remove("success");
                    		textFields[len/5-1][i].getStyleClass().remove("orange");
                    		textFields[len/5-1][i].clear();
                            textFields[len/5-1][i].setDisable(true);
                            }
                    	textFields[len/5-1][0].setDisable(false);
                    	textFields[len/5][0].setDisable(true);
                    	textFields[len/5-1][0].requestFocus();
                		currentLine--;
                    		
					}
                } 
                
            }
            
        });
    return textField;
    }
}




