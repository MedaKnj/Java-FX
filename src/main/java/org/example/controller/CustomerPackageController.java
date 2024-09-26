package org.example.controller;

import javafx.application.Platform;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.model.CustomerPackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class CustomerPackageController implements Initializable {

    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField address;
    @FXML
    private ToggleGroup groupSpeed;
    @FXML
    private ToggleGroup groupBandwidth;
    @FXML
    private ToggleGroup groupDuration;
    @FXML
    private ToggleButton speed_2;
    @FXML
    private ToggleButton speed_5;
    @FXML
    private ToggleButton speed_10;
    @FXML
    private ToggleButton speed_20;
    @FXML
    private ToggleButton speed_50;
    @FXML
    private ToggleButton speed_100;
    @FXML
    private ToggleButton bandwidth_1;
    @FXML
    private ToggleButton bandwidth_5;
    @FXML
    private ToggleButton bandwidth_10;
    @FXML
    private ToggleButton bandwidth_100;
    @FXML
    private ToggleButton bandwidthFlat;

    @FXML
    private RadioButton duration_1;
    @FXML
    private RadioButton duration_2;

    @FXML
    private Button saveBtn;
    @FXML
    private Button clearBtn;
    @FXML
    private Button deleteBtn;

    @FXML
    TableView <CustomerPackage> packageTableView;

    @FXML
    private TableColumn<CustomerPackage, String> firstNameColumn;
    @FXML
    private TableColumn<CustomerPackage, String> lastNameColumn;
    @FXML
    private TableColumn<CustomerPackage, String> addressColumn;
    @FXML
    private TableColumn<CustomerPackage, String> speedColumn;
    @FXML
    private TableColumn<CustomerPackage, String> bandwidthColumn;
    @FXML
    private TableColumn<CustomerPackage, String> durationColumn;

    ObservableList<CustomerPackage> customerPackages;

    CustomerPackage customerPackage = new CustomerPackage();

    public CustomerPackageController() {
    }

    public CustomerPackageController(CustomerPackage customerPackage) {
        this.customerPackage = customerPackage;
    }

    @FXML
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        customerPackages = FXCollections.<CustomerPackage>observableArrayList();

        // Povezivanje kolone sa odgovarajućim svojstvom u CustomerPackage klasi
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<>("address"));

        speedColumn.setCellValueFactory(new PropertyValueFactory<>("selectedSpeed"));
        bandwidthColumn.setCellValueFactory(new PropertyValueFactory<>("selectedBandwidth"));
        durationColumn.setCellValueFactory(new PropertyValueFactory<>("selectedDuration"));

        firstName.textProperty().bindBidirectional(customerPackage.firstNameProperty());
        lastName.textProperty().bindBidirectional(customerPackage.lastNameProperty());
        address.textProperty().bindBidirectional(customerPackage.addressProperty());

        speed_2.selectedProperty().bindBidirectional(customerPackage.speed_2Property());
        speed_5.selectedProperty().bindBidirectional(customerPackage.speed_5Property());
        speed_10.selectedProperty().bindBidirectional(customerPackage.speed_10Property());
        speed_20.selectedProperty().bindBidirectional(customerPackage.speed_20Property());
        speed_50.selectedProperty().bindBidirectional(customerPackage.speed_50Property());
        speed_100.selectedProperty().bindBidirectional(customerPackage.speed_100Property());

        bandwidth_1.selectedProperty().bindBidirectional(customerPackage.bandwidth_1Property());
        bandwidth_5.selectedProperty().bindBidirectional(customerPackage.bandwidth_5Property());
        bandwidth_10.selectedProperty().bindBidirectional(customerPackage.bandwidth_10Property());
        bandwidth_100.selectedProperty().bindBidirectional(customerPackage.bandwidth_100Property());
        bandwidthFlat.selectedProperty().bindBidirectional(customerPackage.bandwidthFlatProperty());

        duration_1.selectedProperty().bindBidirectional(customerPackage.duration_1Property());
        duration_2.selectedProperty().bindBidirectional(customerPackage.duration_2Property());

        duration_1.setSelected(true);

        groupSpeed.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {

            if(newValue != null) {

                // Resetuj sve propertije na false
                customerPackage.speed_2Property().set(false);
                customerPackage.speed_5Property().set(false);
                customerPackage.speed_10Property().set(false);
                customerPackage.speed_20Property().set(false);
                customerPackage.speed_50Property().set(false);
                customerPackage.speed_100Property().set(false);

                ToggleButton selected = (ToggleButton) newValue;

                selected.getToggleGroup();

                //System.out.println("Izabrana brzina: " + selected.getId());

                switch(selected.getId()) {
                    case "speed_2":
                        customerPackage.speed_2Property().set(true);
                        customerPackage.setSelectedSpeed("2");
                        break;
                    case "speed_5":
                        customerPackage.speed_5Property().set(true);
                        customerPackage.setSelectedSpeed("5");
                        break;
                    case "speed_10":
                        customerPackage.speed_10Property().set(true);
                        customerPackage.setSelectedSpeed("10");
                        break;
                    case "speed_20":
                        customerPackage.speed_20Property().set(true);
                        customerPackage.setSelectedSpeed("20");
                        break;
                    case "speed_50":
                        customerPackage.speed_50Property().set(true);
                        customerPackage.setSelectedSpeed("50");
                        break;
                    case "speed_100":
                        customerPackage.speed_100Property().set(true);
                        customerPackage.setSelectedSpeed("100");
                        break;
                }
            }
        });

        groupBandwidth.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue instanceof ToggleButton) {
                // Resetuj sve propertije na false
                customerPackage.bandwidth_1Property().set(false);
                customerPackage.bandwidth_5Property().set(false);
                customerPackage.bandwidth_10Property().set(false);
                customerPackage.bandwidth_100Property().set(false);
                customerPackage.bandwidthFlatProperty().set(false);

                ToggleButton selected = (ToggleButton) newValue;
                switch(selected.getId()) {
                    case "bandwidth_1":
                        customerPackage.bandwidth_1Property().set(true);
                        customerPackage.setSelectedBandwidth("1");
                        break;
                    case "bandwidth_5":
                        customerPackage.bandwidth_5Property().set(true);
                        customerPackage.setSelectedSpeed("5");
                        break;
                    case "bandwidth_10":
                        customerPackage.bandwidth_10Property().set(true);
                        customerPackage.setSelectedBandwidth("10");
                        break;
                    case "bandwidth_100":
                        customerPackage.bandwidth_100Property().set(true);
                        customerPackage.setSelectedBandwidth("100");
                        break;
                    case "bandwidthFlat":
                        customerPackage.bandwidthFlatProperty().set(true);
                        customerPackage.setSelectedBandwidth("Flat");
                        break;
                }
            }
        });

        groupDuration.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {

            if(newValue instanceof RadioButton) {
                // Resetuj sve propertije na false
                customerPackage.duration_1Property().set(false);
                customerPackage.duration_2Property().set(false);

                RadioButton selected = (RadioButton) newValue;
                switch(selected.getId()) {
                    case "duration_1":
                        customerPackage.duration_1Property().set(true);
                        customerPackage.setSelectedDuration("1 year");
                        break;
                    case "duration_2":
                        customerPackage.duration_2Property().set(true);
                        customerPackage.setSelectedDuration("2 years");
                        break;
                }
            }
        });
    }

    private final ObjectProperty<ArrayList<String>> errorList = new SimpleObjectProperty<>(this, "errorList", new ArrayList<>());

    public ObjectProperty<ArrayList<String>> errorsProperty() {
        return errorList;
    }

    @FXML
    private void savePackage() {

        String name = firstName.getText();
        String lastname = lastName.getText();
        String addressTxt = address.getText();

        if (!isValidText(name) || !isValidText(lastname) || !isValidAddress(addressTxt)) {
            System.out.println("The data entered is not valid. Name and surname can only contain letters.");

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Package can't be saved!");
            alert.setHeaderText(null);
            alert.setContentText("The data entered is not valid. Name and surname can only contain letters. " +
                    "The address can only contain letters, numbers and spaces.");
            alert.showAndWait();
            clearData();
        } else {

            if (isValid()) {

                // Kreiraj novi objekat CustomerPackage sa trenutnim podacima iz polja za unos
                CustomerPackage newCustomerPackage = new CustomerPackage();
                newCustomerPackage.setFirstName(firstName.getText());
                newCustomerPackage.setLastName(lastName.getText());
                newCustomerPackage.setAddress(address.getText());


                if (speed_2.isSelected()) {
                    newCustomerPackage.setSelectedSpeed("2");
                } else if (speed_5.isSelected()) {
                    newCustomerPackage.setSelectedSpeed("5");
                } else if (speed_10.isSelected()) {
                    newCustomerPackage.setSelectedSpeed("10");
                } else if (speed_20.isSelected()) {
                    newCustomerPackage.setSelectedSpeed("20");
                } else if (speed_50.isSelected()) {
                    newCustomerPackage.setSelectedSpeed("50");
                } else if (speed_100.isSelected()) {
                    newCustomerPackage.setSelectedSpeed("100");
                }

                // Ažuriraj podatke o propusnosti
                if (bandwidth_1.isSelected()) {
                    newCustomerPackage.setSelectedBandwidth("1");
                } else if (bandwidth_5.isSelected()) {
                    newCustomerPackage.setSelectedBandwidth("5");
                } else if (bandwidth_10.isSelected()) {
                    newCustomerPackage.setSelectedBandwidth("10");
                } else if (bandwidth_100.isSelected()) {
                    newCustomerPackage.setSelectedBandwidth("100");
                } else if (bandwidthFlat.isSelected()) {
                    newCustomerPackage.setSelectedBandwidth("Flat");
                }

                // Ažuriraj podatke o trajanju
                if (duration_1.isSelected()) {
                    newCustomerPackage.setSelectedDuration("1 year");
                } else if (duration_2.isSelected()) {
                    newCustomerPackage.setSelectedDuration("2 years");
                }
                // Dodaj novi objekat u listu customerPackages
                customerPackages.add(newCustomerPackage);

                packageTableView.setItems(customerPackages);

                clearData();

            } else {
                //Ako podaci nisu validni, prikaži odgovarajuću poruku korisniku
                System.out.println("The data entered is not valid. Please check and try again.");

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Package can't be saved!");
                alert.setHeaderText(null);
                alert.setContentText("The data entered is not valid. Please try again and make sure you have selected all required fields (Speed, Bandwidth and Duration).");
                alert.showAndWait();
            }
        }
    }

    @FXML
    private void deletePackage() {

        customerPackages = packageTableView.getItems();

        int index = packageTableView.getSelectionModel().getSelectedIndex();

        if (index < 0) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText(null);
            alert.setContentText("Please select the row to delete.");
            alert.showAndWait();
        } else {
            customerPackages.remove(index);
        }
    }

    @FXML
    private void closeForm() { Platform.exit(); }

    @FXML
    public void clearData() {

        firstName.clear();
        lastName.clear();
        address.clear();
        speed_2.setSelected(false);
        speed_5.setSelected(false);
        speed_10.setSelected(false);
        speed_20.setSelected(false);
        speed_50.setSelected(false);
        speed_100.setSelected(false);

        bandwidth_1.setSelected(false);
        bandwidth_5.setSelected(false);
        bandwidth_10.setSelected(false);
        bandwidth_100.setSelected(false);
        bandwidthFlat.setSelected(false);

        duration_1.setSelected(false);
        duration_2.setSelected(false);
    }

    public boolean isValid() {

        boolean isValid = true;

        if(firstName.getText() != null && firstName.getText().equals("")) {
            errorList.getValue().add("First name can't be empty!");
            isValid = false;
        }
        if(lastName.getText().equals("")) {
            errorList.getValue().add("Last name can't be empty!");
            isValid = false;
        }
        if(address.getText().equals("")) {
            errorList.getValue().add("Address can't be empty!");
            isValid = false;
        }
        if (groupSpeed.getSelectedToggle() == null) {
            errorList.getValue().add("At least one speed option must be selected!");
            isValid = false;
        }
        if (groupBandwidth.getSelectedToggle() == null) {
            errorList.getValue().add("At least one bandwidth option must be selected!");
            isValid = false;
        }
        if (groupDuration.getSelectedToggle() == null) {
            errorList.getValue().add("At least one duration option must be selected!");
            isValid = false;
        }
        return isValid;
    }

    public boolean isValidText(String text) {

        // Regex za proveru da li tekst sadrži samo slova (bez obzira na veličinu slova)
        String regex = "^[a-zA-Z\\p{L}]+$";

        // Provera da li tekst odgovara regex-u
        return text.matches(regex);
    }
    public boolean isValidAddress(String address) {
        // Regex za proveru da li adresa sadrži samo slova, brojeve i razmake
        String regex2 = "^[a-zA-Z0-9\\s\\p{L}]+$";

        // Provera da li adresa odgovara regex-u
        return address.matches(regex2);
    }
}
