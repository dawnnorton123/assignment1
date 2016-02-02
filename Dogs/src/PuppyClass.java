import java.security.SecureRandom;
public class PuppyClass {
	
	private String lab;
	private String beagle;
	private String boxer;
	private String male;
	private String female;
	private int id;
	String breed;
	
	
	public PuppyClass() {
		super();
	}
	public PuppyClass(String lab, String beagle, String boxer, String male, String female) { //constructor
		super();
		this.lab = lab;
		this.beagle = beagle;
		this.boxer = boxer;
		this.male = male;
		this.female = female;
	}
	public String getLab() {                   ///beginning of getters and setters
		return lab;
	}
	public void setLab(String lab) {
		this.lab = lab;
	}
	public String getBeagle() {
		return beagle;
	}
	public void setBeagle(String beagle) {
		this.beagle = beagle;
	}
	public String getBoxer() {
		return boxer;
	}
	public void setBoxer(String boxer) {
		this.boxer = boxer;
	}
	public String getMale() {
		return male;
	}
	public void setMale(String male) {
		this.male = male;
	}
	public String getFemale() {
		return female;
	}
	public void setFemale(String female) {
		this.female = female;
	}
	public int getId() {
		setId();
		return id;
	}
	public void setId() {
		SecureRandom  randomNumbers = new SecureRandom();             ///end of getters and setters
		 id = randomNumbers.nextInt(9);                               /// random number method
		//this.id = (int)(Math.random());
		//System.out.println("Here is your unique ID " + id);
		
	
	
	}

}
