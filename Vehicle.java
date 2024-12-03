//Joshua Coleman

public class Vehicle {
    
    //manufactures name
    private String manuName;

    //Number of Cyclinders 
    private int cylinders;

    //Owners name
    private String ownersName;

    public Vehicle()
    {
        this.manuName = "none selected";
        this.cylinders = 1;
        this.ownersName = "none selected";
    }

    public Vehicle(String xManuName, int xCylinders, String xOwnersName)
    {
        this.setMaunName(xManuName);
        this.setCylinders(xCylinders);
        this.setOwnersName(xOwnersName);
    }

    //accessors
    public String getManuName()
        {return this.manuName;}

    public int getCylinders()
        {return this.cylinders;}

    public String getOwnersName()
        {return this.ownersName;}


    //mutatros
    public void setMaunName(String xManuName)
        {this.manuName = xManuName;}

    public void setCylinders(int xCylinders)
    {
        if(xCylinders > 0)
            {this.cylinders = xCylinders;}
        else
            {
               System.out.println("Error: Invalid Cylinder count!"); 
            }
    }

    public void setOwnersName(String xOwnersName)
        {this.ownersName = xOwnersName;}
    
    //methods
    public boolean equals(Vehicle v)
        {return this.manuName.equals(v.getManuName()) 
                && this.cylinders == v.getCylinders() 
                && this.ownersName.equals(v.getOwnersName());
        }

    public String toString()
    {
        return "Manufactuer's name: " + this.manuName
                +"\nCylinder Count: " + this.cylinders
                +"\nOwner's Name: " + this.ownersName;
    }

}

