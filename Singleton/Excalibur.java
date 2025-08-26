class Excalibur{
    public String name;
    public static Excalibur instance;
    private Excalibur(){
        this.name = "Sword";
    }
    private Excalibur(String name){
        this.name = name;
    }

    public static Excalibur getInstance(){
        if(instance == null){
            instance = new Excalibur();
        }
        return instance;
    }
    public String getName(){
        return this.name;
    }
        public static void main(String[] args)  {
        System.out.println(Excalibur.getInstance().getName());
    }
}