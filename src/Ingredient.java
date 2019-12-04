import java.util.Calendar;

public abstract class Ingredient{
    protected Calendar produceday;
    protected String name;
    protected int bzday;
    public void setProduceday(Calendar p)
    {produceday=p; }
    @Override
    public String toString(){
        return ("Name "+name+" produceday "+produceday.get(Calendar.YEAR)+" "+(produceday.get(Calendar.MONTH) + 1)+" "+produceday.get(Calendar.DATE)+" bzday "+bzday);
    }
    public Calendar isguoqi(){
        Calendar p=this.produceday;
        p.add(Calendar.DATE,bzday);
        return p;
    }
}

