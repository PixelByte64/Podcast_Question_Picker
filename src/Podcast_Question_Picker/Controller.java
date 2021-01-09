package Podcast_Question_Picker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Controller {
	@FXML
	private ChoiceBox<String> choiceBox;
	@FXML
	private TextField outputField;

	@FXML
	public void buttonClick(ActionEvent mouseEvent) throws FileNotFoundException {

		switch (choiceBox.getValue()){
			case "General":
				File generalFile = new File("./data/Podcast_General_Questions.txt");
				setOutputField(choose(generalFile));
				break;
			case "Career":
				File careerFile = new File("./data/Podcast_Career_Questions.txt");
				setOutputField(choose(careerFile));
				break;
			case "Goals":
				File goalsFile = new File("./data/Podcast_Goals_Questions.txt");
				setOutputField(choose(goalsFile));
				break;
			case "Personal":
				File personalFile = new File("./data/Podcast_Personal_Questions.txt");
				setOutputField(choose(personalFile));
				break;
			default:
				throw new IllegalStateException("Unexpected value: " + choiceBox.getValue());
		}
	}

	public static String choose(File f) throws FileNotFoundException
	{
		String result = null;
		Random rand = new Random();
		int n = 0;
		for(Scanner sc = new Scanner(f); sc.hasNext(); )
		{
			++n;
			String line = sc.nextLine();
			if(rand.nextInt(n) == 0)
				result = line;
		}

		return result;
	}

	public void setOutputField(String text){
		outputField.setText(text);
	}
}
