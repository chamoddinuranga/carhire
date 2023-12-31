package lk.ijse.caravanRent.util;


import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigation {
    private static AnchorPane pane;

    public static void navigate(Routes route, AnchorPane pane) throws IOException {
        Navigation.pane = pane;
        Navigation.pane.getChildren().clear();
        Stage window = (Stage)Navigation.pane.getScene().getWindow();

        switch (route) {
            case CUSTOMER:
                window.setTitle("Customer Manage");
                initUI("AddCustomer.fxml");
                break;
            case PLACE_BOOKING:
                window.setTitle("Place Booking");
                initUI("PlaceBooking.fxml");
                break;
            case DASHBOARD:
                window.setTitle("Dashboard");
                initUI("DashBoardForm.fxml");
                break;
            case VEHICLE:
                window.setTitle("Manage Vehicle");
                initUI("AddVehicleForm.fxml");
                break;
            default:
                new Alert(Alert.AlertType.ERROR, "UI Not Found!").show();
        }
    }
    public static void initUI(String location) throws IOException {
        Navigation.pane.getChildren().add(FXMLLoader.load(Navigation.class.getResource("lk/ijse/caravanRent/view" + location)));
    }
}
