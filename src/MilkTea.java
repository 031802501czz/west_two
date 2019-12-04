public class MilkTea {
    private String  p;
    private String ncname;
    public MilkTea(String name,String  p)
    {
        this.ncname=name;
        this.p=p;
    }
    public String toString()
    {
        return ("name "+ncname+" Ingredient "+p);
    }
}
