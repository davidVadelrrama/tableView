package control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import main.Main;
import model.Student;
import model.StudentData;

public class MainWindow implements Initializable {

	@FXML
	private Button deleteBTN;

	@FXML
	private TableColumn<Student, String> codeCOL;

	@FXML
	private TableColumn<Student, String> nameCOL;

	@FXML
	private TableColumn<Student, Integer> natIDCOL;

	@FXML
	private TableView<Student> studentTable;
	
	private Student stClick;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		nameCOL.setCellValueFactory(new PropertyValueFactory<>("name"));
		natIDCOL.setCellValueFactory(new PropertyValueFactory<>("natID"));
		codeCOL.setCellValueFactory(new PropertyValueFactory<>("code"));

		studentTable.setItems(StudentData.data);

		studentTable.setOnMouseClicked(event -> {
			Student stClick = studentTable.getSelectionModel().getSelectedItem();
			System.out.println(stClick.getName());
		});

	}

	@FXML
	void deleteStudent(ActionEvent event) {
		
		StudentData.data.remove(stClick);

	}

	@FXML
	void changeColor(MouseEvent event) {

		if (deleteBTN.getStyle() == "-fx-background-color: #000080; ") {
			deleteBTN.setStyle("-fx-background-color: #ff8000; ");
		} else {
			deleteBTN.setStyle("-fx-background-color: #000080; ");
			
		}

	}

	@FXML
	void addNewStudent(ActionEvent event) throws IOException {

		// Cargador del FXML
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/VentanaB.fxml"));

		// Contenido ventana
		loader.setController(new VentanaB());

		Parent parent;

		parent = (Parent) loader.load();

		Stage stage = new Stage();

		Scene scene = new Scene(parent);

		stage.setScene(scene);

		stage.show();

	}

	@FXML
	void closeMenu(ActionEvent event) {
		Platform.exit();
		System.exit(0);

	}

}
