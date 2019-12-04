import java.util.Calendar;

public class Bubble extends Ingredient{
    public Bubble(Calendar produceday)
    {   this.name="Bubble";
        this.produceday=produceday;
        this.bzday=7;}
    public Bubble()
    {this.name="Bubble";
    this.bzday=7;}
    @Override
    public String toString(){
        return super.toString();
    }
    @Override
    public Calendar isguoqi(){return super.isguoqi();}
}
