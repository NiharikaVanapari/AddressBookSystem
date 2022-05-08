package addressBook;


public class Contact
{

		private String firstName, lastName, address, city, state, email, zip;
		long phoneNumber;

		public Contact(String firstName, String lastName, String address, String city, String state, String email,
				String phoneNumber2, String zip)
		{
			setFirstName(firstName);
			setLastName(lastName);
			setAddress(address);
			setCity(city);
			setState(state);
			setEmail(email);
			setPhoneNumber(phoneNumber2);
			setZip(zip);

		}

		private void setPhoneNumber(String phoneNumber2) {
			// TODO Auto-generated method stub
			
		}

		public Contact()
		{

		}

		public String getFirstName1() 
		{
			return firstName;
		}

		public void setFirstName(String firstName) 
		{
			this.firstName = firstName;                                           
		}

		public String getLastName() 
		{
			return lastName;
		}

		public void setLastName(String lastName)
		{
			this.lastName = lastName;
		}

		public String getAddress()
		{
			return address;
		}

		public void setAddress(String address) 
		{
			this.address = address;
		}

		public String getCity() 
		{
			return city;
		}

		public void setCity(String city) 
		{
			this.city = city;
		}

		public String getState()
		{
			return state;
		}

		public void setState(String state) 
		{
			this.state = state;
		}

		public String getEmail() 
		{
			return email;
		}

		public void setEmail(String email)
		{
			this.email = email;
		}

		public String getZip()
		{
			return zip;
		}

		public void setZip(String zip) 
		{
			this.zip = zip;
		}

		public long getPhoneNumber()
		{
			return phoneNumber;
		}

		public void setPhoneNumber(long phoneNumber2) 
		{
			this.phoneNumber = phoneNumber2;
		}

		public void setZipcode(int zip2) {
			// TODO Auto-generated method stub
			
		}

		public Object getFirstName() {
			// TODO Auto-generated method stub
			return null;
		}
}