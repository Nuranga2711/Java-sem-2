public class Volunteer extends StaffMember{
	
	public Volunteer(String name, String phone){
		super(name, phone);
	}
	
	public double pay(){
		return super.pay();
	}
}