package lk.ijse.caravanRent.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import lk.ijse.caravanRent.util.Navigation;
import lk.ijse.caravanRent.util.Routes;

import java.io.IOException;

public class DashBoardFormController {

    @FXML
    private AnchorPane pane;
    public void btnAddCustomer(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.CUSTOMER, pane);

    }

    public void btnPlaceBooking(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.PLACE_BOOKING, pane);
    }

    public void btnAddVehicle(ActionEvent actionEvent) {

    }
}
