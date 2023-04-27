import java.util.Objects;

public class Notebook 
{
    private int RAM;
    private int HD;
    private String OS;
    private int Price;

    public Notebook(int RAM, int HD, String OS, int Price)
    {
        this.RAM = RAM;
        this.HD = HD;
        this.OS = OS;
        this.Price = Price;
        //System.out.println("Ноутбук RAM = " + RAM + ", HD = " + HD + ", OS = " + OS + " стоимостью " + Price + " рублей");
    }
//
    public int getRAM()
    {
        return RAM;
    }

    public void setRAM(int RAM)
    {
        this.RAM = RAM;
    }
//
    public int getHD()
    {
        return HD;
    }

    public void setHD(int HD)
    {
        this.HD = HD;
    }
//
    public String getOS()
    {
        return OS;
    }

    public void setOS(String OS)
    {
        this.OS = OS;
    }
//
    public int getPrice()
    {
        return Price;
    }

    public void setPrice(int Price)
    {
        this.Price = Price;
    }

    @Override
    public String toString()
    {
        //return RAM + " " + HD + " " + OS + " " + Price;
        return String.format("Ноутбук с RAM %d Гб, HD %d, OS %s и стоимостью %d рублей", RAM, HD, OS, Price);

    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        else if (obj == null)
        {
            return false;
        }
        else if (obj instanceof Notebook)
        {
            Notebook notebook = (Notebook) obj;
            return this.equals(notebook.getRAM()) && this.equals(notebook.getHD()) && this.equals(notebook.getOS()) && this.equals(notebook.getPrice());
        }
        return false;

        
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(RAM, HD, OS, Price);

    }
}