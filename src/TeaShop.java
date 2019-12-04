import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TeaShop implements Shop{
    private ArrayList<Bubble> bubbles;
    private ArrayList<Coconut> coconuts;
    public TeaShop(){
        bubbles=new ArrayList<Bubble>();
        coconuts=new ArrayList<Coconut>();
    }
    private void addIngredient(Bubble bubble)
    {
        bubbles.add(bubble);
    }
    private void addIngredient(Coconut coconut)
    {
        coconuts.add(coconut);
    }
    @Override
    public void insertIngredient(Ingredient ingredient){
        if (ingredient instanceof Bubble)
        {
            addIngredient((Bubble) ingredient);
        }
        if(ingredient instanceof Coconut)
        {
            addIngredient((Coconut)ingredient);
        }
    }
    public < T extends Ingredient> void sold(ArrayList<T> list) throws SoldOutException{
            Calendar now=Calendar.getInstance();
            T product;
            int op;
            //System.out.println(list.get(1));
            for(int i=0;i<list.size();i++)
            {
                op=now.compareTo(list.get(i).isguoqi());
                //System.out.println(op);
                if(op==1)
                    list.remove(i);
            }
            if(list.isEmpty()){
                    throw new SoldOutException();
            }
            else{
                list.remove(0);

            }
    }
    public void sell(String ncname,String name) throws SoldOutException{
            Calendar now=Calendar.getInstance();
            if(name.equals("Bubble"))
            {
                sold(bubbles);
                MilkTea milkTea=new MilkTea(ncname,name);
                System.out.println(milkTea);
                System.out.println("谢谢惠顾·");
            }
            else if(name.equals("Coconut"))
            {
                sold(coconuts);
                MilkTea milkTea=new MilkTea(ncname,name);
                System.out.println(milkTea);
                System.out.println("谢谢惠顾·");
            }
            else
            {
                System.out.println("没有（滚）");
            }
    }
}
