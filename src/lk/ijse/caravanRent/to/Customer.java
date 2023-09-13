package lk.ijse.caravanRent.to;

public class Customer {
  private  String cust_id;
   private String name;
    private String dob;
  private   Double salary;
    private String address;
    private String city;
    private String province;
   private String postal_code;

    public Customer(String cust_id, String name, String dob, Double salary, String address, String city, String province, String postal_code) {
        this.cust_id = cust_id;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
        this.address = address;
        this.city = city;
        this.province = province;
        this.postal_code = postal_code;
    }

    public Customer() {
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cust_id='" + cust_id + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", postal_code='" + postal_code + '\'' +
                '}';
    }
}
