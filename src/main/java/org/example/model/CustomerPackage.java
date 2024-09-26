package org.example.model;

import javafx.beans.property.*;

import java.util.ArrayList;

public class CustomerPackage {

    private final StringProperty firstName = new SimpleStringProperty(this, "firstName", "");
    private final StringProperty lastName = new SimpleStringProperty(this, "lastName", "");
    private final StringProperty address = new SimpleStringProperty(this, "address", "");

    private StringProperty selectedSpeed = new SimpleStringProperty();
    private StringProperty selectedBandwidth = new SimpleStringProperty();
    private StringProperty selectedDuration = new SimpleStringProperty();

    private BooleanProperty speed_2 = new SimpleBooleanProperty(false);
    private BooleanProperty speed_5 = new SimpleBooleanProperty(false);
    private BooleanProperty speed_10 = new SimpleBooleanProperty(false);
    private BooleanProperty speed_20 = new SimpleBooleanProperty(false);
    private BooleanProperty speed_50 = new SimpleBooleanProperty(false);
    private BooleanProperty speed_100 = new SimpleBooleanProperty(false);

    private BooleanProperty bandwidth_1 = new SimpleBooleanProperty(false);
    private BooleanProperty bandwidth_5 = new SimpleBooleanProperty(false);
    private BooleanProperty bandwidth_10 = new SimpleBooleanProperty(false);
    private BooleanProperty bandwidth_100 = new SimpleBooleanProperty(false);
    private BooleanProperty bandwidthFlat = new SimpleBooleanProperty(false);

    private BooleanProperty duration_1 = new SimpleBooleanProperty(false);
    private BooleanProperty duration_2 = new SimpleBooleanProperty(false);

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public String getAddress() {
        return address.get();
    }

    public StringProperty addressProperty() {
        return address;
    }

    public void setAddress(String address) {
        this.address.set(address);
    }

    public String getSelectedSpeed() {
        return selectedSpeed.get();
    }

    public StringProperty selectedSpeedProperty() {
        return selectedSpeed;
    }

    public void setSelectedSpeed(String selectedSpeed) {
        this.selectedSpeed.set(selectedSpeed);
    }

    public String getSelectedBandwidth() {
        return selectedBandwidth.get();
    }

    public StringProperty selectedBandwidthProperty() {
        return selectedBandwidth;
    }

    public void setSelectedBandwidth(String selectedBandwidth) {
        this.selectedBandwidth.set(selectedBandwidth);
    }

    public String getSelectedDuration() {
        return selectedDuration.get();
    }

    public StringProperty selectedDurationProperty() {
        return selectedDuration;
    }

    public void setSelectedDuration(String selectedDuration) {
        this.selectedDuration.set(selectedDuration);
    }

    public boolean isSpeed_2() {
        return speed_2.get();
    }

    public BooleanProperty speed_2Property() {
        return speed_2;
    }

    public void setSpeed_2(boolean speed_2) {
        this.speed_2.set(speed_2);
    }

    public boolean isSpeed_5() {
        return speed_5.get();
    }

    public BooleanProperty speed_5Property() {
        return speed_5;
    }

    public void setSpeed_5(boolean speed_5) {
        this.speed_5.set(speed_5);
    }

    public boolean isSpeed_10() {
        return speed_10.get();
    }

    public BooleanProperty speed_10Property() {
        return speed_10;
    }

    public void setSpeed_10(boolean speed_10) {
        this.speed_10.set(speed_10);
    }

    public boolean isSpeed_20() {
        return speed_20.get();
    }

    public BooleanProperty speed_20Property() {
        return speed_20;
    }

    public void setSpeed_20(boolean speed_20) {
        this.speed_20.set(speed_20);
    }

    public boolean isSpeed_50() {
        return speed_50.get();
    }

    public BooleanProperty speed_50Property() {
        return speed_50;
    }

    public void setSpeed_50(boolean speed_50) {
        this.speed_50.set(speed_50);
    }

    public boolean isSpeed_100() {
        return speed_100.get();
    }

    public BooleanProperty speed_100Property() {
        return speed_100;
    }

    public void setSpeed_100(boolean speed_100) {
        this.speed_100.set(speed_100);
    }

    public boolean isBandwidth_1() {
        return bandwidth_1.get();
    }

    public BooleanProperty bandwidth_1Property() {
        return bandwidth_1;
    }

    public void setBandwidth_1(boolean bandwidth_1) {
        this.bandwidth_1.set(bandwidth_1);
    }

    public boolean isBandwidth_5() {
        return bandwidth_5.get();
    }

    public BooleanProperty bandwidth_5Property() {
        return bandwidth_5;
    }

    public void setBandwidth_5(boolean bandwidth_5) {
        this.bandwidth_5.set(bandwidth_5);
    }

    public boolean isBandwidth_10() {
        return bandwidth_10.get();
    }

    public BooleanProperty bandwidth_10Property() {
        return bandwidth_10;
    }

    public void setBandwidth_10(boolean bandwidth_10) {
        this.bandwidth_10.set(bandwidth_10);
    }

    public boolean isBandwidth_100() {
        return bandwidth_100.get();
    }

    public BooleanProperty bandwidth_100Property() {
        return bandwidth_100;
    }

    public void setBandwidth_100(boolean bandwidth_100) {
        this.bandwidth_100.set(bandwidth_100);
    }

    public boolean isBandwidthFlat() {
        return bandwidthFlat.get();
    }

    public BooleanProperty bandwidthFlatProperty() {
        return bandwidthFlat;
    }

    public void setBandwidthFlat(boolean bandwidthFlat) {
        this.bandwidthFlat.set(bandwidthFlat);
    }

    public boolean isDuration_1() {
        return duration_1.get();
    }

    public BooleanProperty duration_1Property() {
        return duration_1;
    }

    public void setDuration_1(boolean duration_1) {
        this.duration_1.set(duration_1);
    }

    public boolean isDuration_2() {
        return duration_2.get();
    }

    public BooleanProperty duration_2Property() {
        return duration_2;
    }

    public void setDuration_2(boolean duration_2) {
        this.duration_2.set(duration_2);
    }

    public CustomerPackage() {
    }

    public CustomerPackage(String firstName) {
        this.firstName.set(firstName);
    }
    public CustomerPackage(String firstName, String lastName) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
    }

    public CustomerPackage(String firstName, String lastName, String address) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
        this.address.set(address);
    }

    public CustomerPackage(StringProperty selectedSpeed, StringProperty selectedBandwidth, StringProperty selectedDuration) {
        this.selectedSpeed = selectedSpeed;
        this.selectedBandwidth = selectedBandwidth;
        this.selectedDuration = selectedDuration;
    }

    public CustomerPackage(StringProperty selectedSpeed, StringProperty selectedBandwidth, StringProperty selectedDuration, BooleanProperty speed_2, BooleanProperty speed_5, BooleanProperty speed_10, BooleanProperty speed_20, BooleanProperty speed_50, BooleanProperty speed_100, BooleanProperty bandwidth_1, BooleanProperty bandwidth_5, BooleanProperty bandwidth_10, BooleanProperty bandwidth_100, BooleanProperty bandwidthFlat, BooleanProperty duration_1, BooleanProperty duration_2) {
        this.selectedSpeed = selectedSpeed;
        this.selectedBandwidth = selectedBandwidth;
        this.selectedDuration = selectedDuration;
        this.speed_2 = speed_2;
        this.speed_5 = speed_5;
        this.speed_10 = speed_10;
        this.speed_20 = speed_20;
        this.speed_50 = speed_50;
        this.speed_100 = speed_100;
        this.bandwidth_1 = bandwidth_1;
        this.bandwidth_5 = bandwidth_5;
        this.bandwidth_10 = bandwidth_10;
        this.bandwidth_100 = bandwidth_100;
        this.bandwidthFlat = bandwidthFlat;
        this.duration_1 = duration_1;
        this.duration_2 = duration_2;
    }

    private final ObjectProperty<ArrayList<String>> errorList = new SimpleObjectProperty<>(this, "errorList", new ArrayList<>());

    public ObjectProperty<ArrayList<String>> errorsProperty() {
        return errorList;
    }

    @Override
    public String toString() {
        return "CustomerPackage{" +
                "firstName=" + getFirstName() +
                ", lastName=" + getLastName() +
                ", address=" + getAddress() +
                ", selectedSpeed=" + getSelectedSpeed() +
                ", selectedBandwidth=" + getSelectedBandwidth() +
                ", selectedDuration=" + getSelectedDuration() +
                '}';
    }
}
