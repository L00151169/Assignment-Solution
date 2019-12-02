package ie.lyit.bank;

public abstract class Person {
	protected Name name;		
	protected Date dateOfBirth;	


	public Person(){
		name = new Name();
		dateOfBirth = new Date();
	}
	
	
	public Person(Name n, Date dob){
		name = n;
		dateOfBirth=dob;
	}
    
	
	@Override  
	public String toString(){
		return name.toString() + "," + dateOfBirth;
	}

	
	@Override  
	public boolean equals(Object obj){
		Person pObject;
		if (obj instanceof Person)
			pObject = (Person)obj;
		else
			return false;
	   
		return(name.equals(pObject.name) &&
			   dateOfBirth.equals(pObject.dateOfBirth));
	}
	
	
	public void setName(Name nameIn){
		name = nameIn;
	}
	public Name getName(){
		return name;
	}
	public void setDateOfBirth(Date dateOfBirthIn){
		dateOfBirth = dateOfBirthIn;
	}
	public Date getDateOfBirth(){
		return dateOfBirth;
	}	
}