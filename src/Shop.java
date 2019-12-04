public interface Shop {
    default void insertIngredient(Ingredient ingredient){};

    default void sell(String ncname,String name) throws SoldOutException{}
}
