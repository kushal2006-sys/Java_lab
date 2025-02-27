# Java_lab
java lab reposity according to the weeks 
class car
{
	public String car_color;
	public String car_brand;
	public String fuel_type;
	public float mileage;
	public void start()
	{
		System.out.println("Car starts");
	}
	public void stop()
	{
		System.out.println("Car stops");
	}
	public void service()
	{
		System.out.println("Car service");
	}
	public static void main(String [] args){
  			// object one creation
			car car1= new car();
			car1.car_color="Red";
			car1.car_brand="BMW";
			car1.fuel_type="Petrol";
			car1.mileage=62.5F;
			//calling methods for object 1
			car1.start();
			car1.stop();
			car1.service();
			System.out.println("color of the car1 is "+car1.car_color);
			System.out.println("brand of the car1 is "+car1.car_brand);
			System.out.println("fuel type of the car1 is "+car1.fuel_type);
			System.out.println("mileage of the car1 is"+car1.mileage);
			// object two creation
			car car2= new car();
			car2.car_color="Blue";
			car2.car_brand="Audi";
			car2.fuel_type="Petrol";
			car2.mileage=64.5F;
			// calling methods for object 2
			car2.start();
			car2.stop();
			car2.service();
			System.out.println("color of the car2 is "+car2.car_color);
			System.out.println("brand of the car2 is "+car2.car_brand);
			System.out.println("fuel type of the car2 is "+car2.fuel_type);
			System.out.println("mileage of the car2 is"+car2.mileage);
			//object three creation
			car car3= new car();
			car3.car_color="Yellow";
			car3.car_brand="Benz";
			car3.fuel_type="Diesel";
			car3.mileage=66.5F;	
			// calling methods for object 3
			car3.start();
			car3.stop();
			car3.service();
			System.out.println("color of the car3 is "+car3.car_color);
			System.out.println("brand of the car3 is "+car3.car_brand);
			System.out.println("fuel type of the car3 is "+car3.fuel_type);
			System.out.println("mileage of the car3 is"+car3.mileage);
	}

}
