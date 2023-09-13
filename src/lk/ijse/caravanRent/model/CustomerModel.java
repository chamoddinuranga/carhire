package lk.ijse.caravanRent.model;

import lk.ijse.caravanRent.to.Customer;
import lk.ijse.caravanRent.util.CrudUtil;

import java.sql.SQLException;

public class CustomerModel {
    public static boolean save(Customer customer) throws SQLException, ClassNotFoundException {


        return CrudUtil.execute("INSERT INTO Customer VALUES(?, ?, ?, ?, ?, ?, ?, ?)",
                customer.getCust_id(),
                customer.getName(),
                customer.getDob(),
                customer.getSalary(),
                customer.getAddress(),
                customer.getCity(),
                customer.getProvince(),
                customer.getPostal_code()
        );
    }
}
