import java.util.HashSet;

/**
 * 
 * @author myriam
 * utiliser assertEquals/ assertthrows/ assertnull
 */

public class Car {
	
	private final String brand; 
	private final long value;


	public Car(String brand, long value) {
		this.value = value;
		this.brand = brand;
		if (value <0) throw new IllegalArgumentException("Valeur négative");
		// TODO Auto-generated constructor stub
	}
	
	public String getBrand() {
		return brand;
	}

	public long getValue() {
		return value;
	}
	
	public String toString() {
		return "(La voiture : "+ brand +", Caractéristiques : "+ value +")";
	}
	
	public boolean equals(Car c) {
		return getBrand().equals(c.getBrand()) && getValue() == c.getValue();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Car)) 
			return false;
		
		return equals((Car) obj);
	}
	
	@Override
	public int hashCode() {
		return 0;
	}

	public boolean contains(Car car) {
		
		HashSet<Car> set = new HashSet<Car>();

		  for(Car c : set) {
			  if(c.contains(car)) {
					return true;
				}
		  }
		  
		return false;		
			
		}
	
	
	}

	
