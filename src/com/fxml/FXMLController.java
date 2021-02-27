package com.fxml;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class FXMLController implements Initializable {
//String name,surname,father,adress,number,mail;

    @FXML
    private ToggleGroup tunar;
    @FXML
    private Label nameLabel;
    @FXML
    private TextField nameTxt;
    @FXML
    private Label surLabel;
    @FXML
    private TextField surnameTxt;
    @FXML
    private TextField fatherTxt;
    @FXML
    private TextField adressTxt;
    @FXML
    private DatePicker dateTxt;
    @FXML
    private TextField numberTxt;
    @FXML
    private TextField mailTxt;
    @FXML
    private RadioButton maleTickTxt;
    @FXML
    private RadioButton feTick;
    @FXML
    private ComboBox<String> language;
    @FXML
    private CheckBox eeTick;
    @FXML
    private CheckBox seTick;
    @FXML
    private CheckBox fxTick;
    @FXML
    private CheckBox pyTick;
    @FXML
    private ComboBox<String> nationality;
    @FXML
    private Button cancel;
    @FXML
    private Button save;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        languagePr();
        nationPr();
    }

    public void languagePr() {
        ArrayList<String> languagen = new ArrayList<String>();
        languagen.add("Azerbaijani");
        languagen.add("Turkish");
        languagen.add("English");
        languagen.add("Russian");
        languagen.add("Japanese");
        languagen.add("IboBaldese");
        language.getItems().addAll(languagen);
        language.getSelectionModel().select(languagen.get(0));

    }

    public void nationPr() {
        ArrayList<String> nation = new ArrayList<String>();
        nation.add("Azerbaijani");
        nation.add("Turkish");
        nation.add("English");
        nation.add("Russian");
        nation.add("Japanese");
        nation.add("IboBaldese");
        nationality.getItems().addAll(nation);
        nationality.getSelectionModel().select(nation.get(0));
    }

    @FXML
    private void malePr(ActionEvent event) {

    }

    @FXML
    private void femalePr(ActionEvent event) {
    }

    @FXML
    private void eePr(ActionEvent event) {
    }

    @FXML
    private void sePr(ActionEvent event) {
    }

    @FXML
    private void fxPr(ActionEvent event) {
    }

    @FXML
    private void pyPr(ActionEvent event) {
    }

    @FXML
    private void cancelPr(ActionEvent event) {
        nameTxt.setText("");
        surnameTxt.setText("");
        fatherTxt.setText("");
        adressTxt.setText("");
        numberTxt.setText("");
        mailTxt.setText("");
        language.getSelectionModel().clearSelection();
        nationality.getSelectionModel().clearSelection();
        dateTxt.setValue(null);
        maleTickTxt.setSelected(false);
        feTick.setSelected(false);
        eeTick.setSelected(false);
        seTick.setSelected(false);
        fxTick.setSelected(false);
        pyTick.setSelected(false);

    }

    @FXML
    private void savePr(ActionEvent event) {
        String a = "";
        System.out.println("Ad: " + nameTxt.getText());
        System.out.println("Soyad: " + surnameTxt.getText());
        System.out.println("Ata adi: " + fatherTxt.getText());
        System.out.println("Adres: " + adressTxt.getText());
        System.out.println("Nomre: " + numberTxt.getText());
        System.out.println("Mail: " + mailTxt.getText());
        System.out.println("Dogum tarixi: "+dateTxt.getValue());
        
        if (maleTickTxt.isSelected()){
            System.out.println("Gender: Male"  );  
        }
        if (feTick.isSelected()){
            System.out.println("Gender: Female");
        }
        if (eeTick.isSelected()){
            a+=" Java Ee";
        }
        
         if (seTick.isSelected()){
            a+=" Java Se";
        }
        
        if (fxTick.isSelected()){
            a+=" JavaFx";
        }
         if (pyTick.isSelected()){
            a+=" Python";
        }
        System.out.println("Bildiyi diller: "+a);
        
        
        
        
        
    }
}
