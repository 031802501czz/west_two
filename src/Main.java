import java.util.Calendar;

public class Main {
    public static void main(String[] args){
        TeaShop teaShop=new TeaShop();
        Ingredient []ingredients=new Ingredient[3];
        Calendar cal=Calendar.getInstance();
        cal.add(Calendar.DATE,-50);
        ingredients[0]=new Bubble(cal);
        cal=Calendar.getInstance();
        cal.add(Calendar.DATE,-1);
        ingredients[1]=new Coconut(cal);
        ingredients[2]=new Bubble(cal);
        for (int i=0;i<3;i++){
            teaShop.insertIngredient(ingredients[i]);
        }
        String ncname1,name1,ncname2,ncname3,name2,name3;
        ncname1="奶茶1";name1="Bubble";
        ncname2="奶茶2";name2="Coconut";
        ncname3="奶茶3";name3="Coconut";
        try
        {
            teaShop.sell(ncname1,name1);
            teaShop.sell(ncname2,name2);
            teaShop.sell(ncname3,name3);
        }catch (SoldOutException e)
        {
            System.out.println("不好意思,卖光了");
        }
        finally {
            System.out.println("再见");
        }
    }
}
