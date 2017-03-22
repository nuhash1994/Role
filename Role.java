import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;

public class Role extends Application {
	public void start(Stage primaryStage) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setHeaderText("Role Confirmation");
		ChoiceDialog<String> dialog = new ChoiceDialog<>("", "Administrator", "Staff", "Faculty", "Student", "Guest");
		dialog.setTitle("Role");
		dialog.setHeaderText("Role Selection");
		dialog.setContentText("Please select your role");
		dialog.showAndWait();
		String choice = dialog.getResult();
		switch (choice) {
		case "Administrator":
			alert.setContentText("Welcome Administrator!");
			alert.showAndWait();
			break;
		case "Staff":
			alert.setContentText("Welcome Staff!");
			alert.showAndWait();
			break;
		case "Faculty":
			alert.setContentText("Welcome Faculty!");
			alert.showAndWait();
			break;
		case "Student":
			alert.setContentText("Welcome Student!");
			alert.showAndWait();
			break;
		case "Guest":
			alert.setContentText("Welcome Guest!");
			alert.showAndWait();
			break;

		}

	}

}
