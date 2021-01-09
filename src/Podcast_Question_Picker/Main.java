package Podcast_Question_Picker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends Application{

	public static void main(String[] args) {

		File directory = new File("./data");

		if (!directory.exists()){
			directory.mkdir();
			System.out.println("Directory is Created!");
		} else{
			System.out.println("Directory already exists.");
		}

		try{

			File generalFile = new File("./data/Podcast_General_Questions.txt");

			if (generalFile.createNewFile()){
				System.out.println("File is Created!");
			} else{
				System.out.println("File already exists.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		try{

			File careerFile = new File("./data/Podcast_Career_Questions.txt");

			if (careerFile.createNewFile()){
				System.out.println("File is Created!");
			} else{
				System.out.println("File already exists.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		try{

			File goalsFile = new File("./data/Podcast_Goals_Questions.txt");

			if (goalsFile.createNewFile()){
				System.out.println("File is Created!");
			} else{
				System.out.println("File already exists.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		try{

			File personalFile = new File("./data/Podcast_Personal_Questions.txt");

			if (personalFile.createNewFile()){
				System.out.println("File is Created!");
			} else{
				System.out.println("File already exists.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Podcast_Question_Picker.fxml"));
		primaryStage.setTitle("Podcast_Question_Picker");
		primaryStage.setScene(new Scene(root, 500, 300));
		primaryStage.show();
	}
}
