package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Student;
import model.StudentData;

public class VentanaB {
	
	
	@FXML
    private Button addBTN;

    @FXML
    private TextField codeTF;

    @FXML
    private TextField nameTF;

    @FXML
    private TextField natIDTF;

    @FXML
    void addNewEstudent(ActionEvent event) {
    	int cedula = Integer.parseInt(natIDTF.getText());
    	String name = nameTF.getText();
    	String code = codeTF.getText();
    	Student student = new Student(name, code, cedula);
    	StudentData.data.add(student);
    	
    	Stage stage = (Stage) nameTF.getScene().getWindow();
    	stage.close();

    }
}
