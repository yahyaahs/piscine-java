public class BaseRaclette implements Raclette{
    
    public int getCalories() {
        return 1000;

    }
    public String getIngredients(){
        return "Patate, fromage à raclette";
    }
    @Override
    public String toString() {
        return getIngredients() + " pour " + getCalories() + " calories";
    }
        public static void main(String[] args)  {
        Raclette r = new BaseRaclette();
        System.out.println(r);
        r = new WithPickles(r);
        System.out.println(r);
        r = new WithColdMeats(r);
        System.out.println(r);
    }
}