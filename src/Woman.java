public class Woman extends Person{
    private String maidenlastName;

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.maidenlastName = lastName;
    }
    public void registerPartnership(Person partner){
        super.setLastName(partner.getLastName());
    }

    public void  deregisterPartnership(Boolean divorceHappend){
        if (divorceHappend){
            this.setLastName(maidenlastName);
        }
    }

    public String getMaidenlastName() {
        return maidenlastName;
    }

    public void setMaidenlastName(String maidenlastName) {
        this.maidenlastName = maidenlastName;
    }
}
