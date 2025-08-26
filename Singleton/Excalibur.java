class Excalibur{
    private String name;
    private static Excalibur INSTANCE = new Excalibur("Sword");
    private Excalibur(String name){
        this.name = name;
    }

    public static Excalibur getInstance(){
        return INSTANCE;
    }
    public String getName(){
        return this.name;
    }
        public static void main(String[] args)  {
        System.out.println(Excalibur.getInstance().getName());
    }
}