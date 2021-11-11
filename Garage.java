import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Garage {
	
	private ArrayList<Car> list_car = new ArrayList<Car>();
	private final int ID;
	private Car car;
	private static int numero = 0;


	public Garage() {
		// TODO Auto-generated constructor stub
		this.ID = numero++;
	}
	
	/*
	 * Méthode qui permet d'ajouter une voiture au garage
	 */
	public void AddCar(Car car) {
		list_car.add(car);
		this.car = Objects.requireNonNull(car, "car ne doit pas être null");
	}
	
	public int SumCar() {
		int sum = 0;
		
		for (int i=0; i<list_car.size(); i++) {
			sum = sum +1;
		}
		
		return sum;
		
	}
	
	public String firstCarByBrand(String brand) {
		
		for (Car c: list_car) {

			if (c.getBrand() == brand) {
				brand = c.toString();
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
		
		for (Car c: list_car) {
			sb.append("\n");
			sb.append(c.toString());
		}
		
		sb.append("\nValeur Garage " + getID() + "= " + SumCar()).append("\n");

		return sb.toString();
		
	}
	
	public void remove(Car car) {
		list_car.remove(car);
	}
	
	public static void main(String[] args) {
	
		Car a = new Car("Audi",10000);
		Car b = new Car("BMW",9000);
		Car c = new Car("BMW",9000);
		Car d = a;
		
		System.out.println(a==b);//false
		System.out.println(b==c);//Pas de référence au même objet : false
		System.out.println(a==d);// true
		
		System.out.println(a.equals(b));//false
		System.out.println(b.equals(c));//true
		System.out.println(a.equals(d));//true
		
		ArrayList<Car> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		System.out.println(list.indexOf(a));
		System.out.println(list.indexOf(b));
		System.out.println(list.indexOf(c));
		System.out.println(b.equals(c));

		HashSet<Car> set = new HashSet<Car>();
		set.add(b);
		System.out.println(set.contains(c)); //false
		
		/*Garage g0 = new Garage();
		g0.AddCar(a);
		g0.AddCar(b);
		
		Garage g1 = new Garage();
		g1.AddCar(c);
		g1.AddCar(d);

		System.out.println(g0.toString());
		System.out.println(g1.toString());
		
		System.out.println(g0.firstCarByBrand("BMW"));
		
		g0.remove(a);
		System.out.println(g0.toString());*/

	}


}
