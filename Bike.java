import java.util.HashSet;

public class Bike implements Vehicule {
	
	private final String brand; 
	private static long value = 100;


	public Bike(String brand, long value) {
		this.brand = brand;
		Bike.value = 100;
	}

	public String getBrand() {
		return brand;
	}

	public long getValue() {
		return value;
	}
	
	public void setValue(long value) {
		Bike.value=value;
	}
	
	
	public String toString() {
		return "(Le velo : "+ brand +", Caractéristiques : "+ value +")";
	}
	
	
	public boolean equals(Bike b) {
		return getBrand().equals(b.getBrand()) && getValue() == b.getValue();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Bike)) 
			return false;
		
		return equals((Bike) obj);
	}
	
	@Override
	public int hashCode() {
		return 0;
	}

	public boolean contains(Bike bike) {
		
		HashSet<Bike> set = new HashSet<Bike>();

		  for(Bike b : set) {
			  if(b.contains(bike)) {
					return true;
				}
		  }
		  
		return false;		
			
		}

}
