
public class Car extends Vehicle{
    
    private double mileage;
    private int passengers;

    //default constructor
    public Car()
    {
        super();
        this.mileage = 1;
        this.passengers = 0;
    }

    //parameterized constructor
    public Car(String xManuName, int xCylinders, String xOwnersName, double xMileage, int xPassengers)
    {
        super(xManuName, xCylinders, xOwnersName);
        setMileage(xMileage);
        setPassengers(xPassengers);
    }

    //accessors
    public double getMileage()
        {return this.mileage;}

    public int getPassengers()
        {return this.passengers;}

    public void setMileage(double xMileage)
    {
        if(xMileage >= 0)
            {this.mileage = xMileage;}
        else
            {System.out.println("Error: Invalid gas mileage!");}
    }

    public void setPassengers(int xPassengers)
    {
        if(xPassengers >= 0)
            {this.passengers = xPassengers;}
        else
            {System.out.println("Error: Invalid number of passengers");}
    }

    public boolean equals(Car c)
    {
        return getManuName().equals(c.getManuName()) 
                && getCylinders() == c.getCylinders() 
                && getOwnersName().equals(c.getOwnersName())
                && this.mileage == c.getMileage()
                && this.passengers == c.getPassengers();
    }

    public String toString()
    {
        return super.toString() + "\nMileage: "+this.mileage
                    + "\nNumber of Passengers: "+this.passengers;
    }
}
