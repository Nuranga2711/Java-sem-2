public abstract class StaffMember{
	private String name;
	private String phone;
	
	public StaffMember(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
	
	public abstract double pay();
}