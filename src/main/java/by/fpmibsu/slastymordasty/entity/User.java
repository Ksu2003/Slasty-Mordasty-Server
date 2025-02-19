package by.fpmibsu.slastymordasty.entity;

public class User extends Entity{
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private int role;
    private String addressStreet;

    private String numHouseFlat;

    public User() {
    }

    public User(long id, String name, String email, String phoneNumber, String password, int role, String addressStreet,String numHouseFlat) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.role = role;
        this.addressStreet = addressStreet;
        this.numHouseFlat = numHouseFlat;
    }

    public User(String name, String email, String phoneNumber, String password, int role, String addressStreet,String numHouseFlat) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.role = role;
        this.addressStreet = addressStreet;
        this.numHouseFlat = numHouseFlat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getNumHouseFlat() {
        return numHouseFlat;
    }

    public void setNumHouseFlat(String numHouseFlat) {
        this.numHouseFlat = numHouseFlat;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if(id != ((User) o).id) return false;

        User user = (User) o;

        if (role != user.role) return false;
        //if (!name.equals(user.name)) return false;
        if (!email.equals(user.email)) return false;
        if (!phoneNumber.equals(user.phoneNumber)) return false;
        if (!password.equals(user.password)) return false;
        //if (!addressStreet.equals(user.addressStreet)) return false;
        return numHouseFlat.equals(user.numHouseFlat);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = (int) (31 * result + id);
        result = 31 * result + email.hashCode();
        result = 31 * result + phoneNumber.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + role;
        result = 31 * result + addressStreet.hashCode();
        result = 31 * result + numHouseFlat.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + email + " " + phoneNumber + " " + role + " " + addressStreet + " " + numHouseFlat;
    }
}
