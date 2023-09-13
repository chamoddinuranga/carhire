package lk.ijse.caravanRent.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import lk.ijse.caravanRent.model.CustomerModel;
import lk.ijse.caravanRent.to.Customer;

import java.sql.SQLException;

public class AddCustomerFormController {

    public TextField txtId;
    public TextField txtName;
    public TextField txtDob;
    public TextField txtSalary;
    public TextField txtAddress;
    public TextField txtCity;
    public TextField txtProvince;
    public TextField txtPostalCode;
    public AnchorPane pane;

    public void btnAddCustomer(ActionEvent actionEvent) {
        String cust_id = txtId.getText();
        String name = txtName.getText();
        String dob = txtDob.getText();
        double salary = Double.parseDouble(txtSalary.getText());
        String address = txtAddress.getText();
        String city = txtCity.getText();
        String province = txtProvince.getText();
        String postalCode = txtPostalCode.getText();

        Customer customer = new Customer(cust_id,name,dob,salary,address,city,province,postalCode);
        try {
            boolean isAdded = CustomerModel.save(customer);
            if(isAdded) {
                new Alert(Alert.AlertType.CONFIRMATION, "Customer Added!").show();
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnBack(ActionEvent actionEvent) {
    }
}
