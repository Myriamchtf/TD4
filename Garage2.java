import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Garage2 {
	
	private static ArrayList<Vehicule> list_Vehicule = new ArrayList<Vehicule>();
	private final int ID;
	private Vehicule vehicule;
	private static int numero = 0;


	public Garage2() {
		// TODO Auto-generated constructor stub
		this.ID = numero++;
	}
	
	public void AddVehicule(Vehicule vehicule) {
		list_Vehicule.add(vehicule);
		this.vehicule = Objects.requireNonNull(vehicule, "car ne doit pas être null");
	}
	
	public int SumVehicule() {
		int sum = 0;
		
		for (int i=0; i<list_Vehicule.size(); i++) {
			sum = sum +1;
		}
		
		return sum;
		
	}
	
	public String firstVehiculeByBrand(String brand) {
		
		for (Vehicule v: list_Vehicule) {

			if (v.getBrand() == brand) {
				brand = v.toString();
			}
		}
		
		return brand ;
		
	}
	
	public long getID() {
		return ID;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Garage " + getID() );
		
		for (Vehicule v: list_Vehicule) {
			sb.append("\n");
			sb.append(v.toString());
		}
		
		sb.append("\nValeur Garage " + getID() + "= " + SumVehicule()).append("\n");

		return sb.toString();
		
	}
	
	public void remove(Vehicule vehicule) {
		list_Vehicule.remove(vehicule);
	}
	
	/*public void protectionism(String brand) {
		
		Iterator<Vehicule> iter = list_Vehicule.iterator();
				
	    while(iter.hasNext()){	 
	    	
	    	if (vehicule.getBrand() == (String)brand) {
				list_Vehicule.remove(vehicule);
			}
	    	
	    }
	}*/
	
	public static void main(String[] args) {
	
		Car a = new Car("Audi",10000);
		Car b = new Car("BMW",9000);
		Car c = new Car("BMW",9000);
		Car d = a;
		//Car essaiprotectionism1 = new Car("Mercedes",10000);
		
		Bike bike1 =new Bike("Giant", 100);
		//Bike bike2 = new Bike("Scott",100);
				
		Garage2 g0 = new Garage2();
		g0.AddVehicule(a);
		g0.AddVehicule(b);
		g0.AddVehicule(bike1);
		//g0.AddVehicule(essaiprotectionism1);
		
		System.out.println(g0.toString());
		
		/*g0.protectionism("Mercedes");
		System.out.println(g0.toString());*/

	
	}


}
