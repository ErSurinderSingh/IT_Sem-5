package P12;

public class RegisterAction {
private String roll, contact, name, dob;

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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


public String execute(){
	int i=RegisterDao.save(this);
	if(i>0){
	return "success";
	}
	return "error";
}
}
