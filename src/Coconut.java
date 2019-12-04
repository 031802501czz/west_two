import java.util.Calendar;

public class Coconut extends Ingredient{
    public Coconut(Calendar produceday)
    {   this.name="Coconut";
        this.produceday=produceday;
        this.bzday=7;}
    public Coconut()
    {this.name="Coconut";
        this.bzday=7;}
        @Override
    public String toString(){
        return super.toString();
    }
    public Calendar isguoqi(){return super.isguoqi();}
}
