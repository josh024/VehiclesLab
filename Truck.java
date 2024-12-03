
public class Truck extends Vehicle{
    
    //Load capacity: a nonnegative number of tons represented by a decimal number
    private double loadCap;

    //Towing capacity: a nonnegative number of tons represented by a decimal
    private double towCap;

    //default constructor
    public Truck()
    {
        super();
        this.loadCap = 1;
        this.towCap = 1;
    }

    //parameterized constructor
    public Truck(String xManuName, int xCylinders, String xOwnersName, double xLoadCap, double xTowCap)
    {
        super(xManuName, xCylinders, xOwnersName);
        this.setLoadCap(xLoadCap);
        this.setTowCap(xTowCap);
    }

    //accesors
    public double getLoadCap()
        {return this.loadCap;}

    public double getTowCap()
        {return this.towCap;}

    //mutators
    public void setLoadCap(double xLoadCap)
    {
        if(xLoadCap >= 0)
            {this.loadCap = xLoadCap;}
        else
        {
            System.out.println("Error: Invalid load cpacity");
        }
    }

    public void setTowCap(double xTowCap)
    {
        if(xTowCap >= 0)
            {this.towCap = xTowCap;}
        else
        {
            System.out.println("Error: Invalid towing cpacity");
        }
    }

    //methods
    public boolean equals(Truck t)
    {
        return getManuName().equals(t.getManuName()) 
                && getCylinders() == t.getCylinders() 
                && getOwnersName().equals(t.getOwnersName())
                && this.loadCap == t.getLoadCap()
                && this.towCap == t.getTowCap();
    }

    public String toString()
    {
        return super.toString() + "\nLoad Capacity: "+this.loadCap
                    + "\nTowing Capacity: "+this.towCap;
    }

}
