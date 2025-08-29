public class Context{
    private OperationStrategy OperationStrategy;
    public Context(){
        this.OperationStrategy = new AddStrategy();
    }
    public void changeStrategy(OperationStrategy OperationStrategy){
        this.OperationStrategy = OperationStrategy;
    }
    public int execute(int a, int b){
        return this.OperationStrategy.execute(a, b);
    }
      public static void main(String[] args)  {
    Context context = new Context();
    System.out.println(context.execute(23, 43));

    context.changeStrategy(new MaxStrategy());
    System.out.println(context.execute(23, 43));

    context.changeStrategy(new ConcatStrategy());
    System.out.println(context.execute(23, 43));
  }
}