public class ExerciseRunner {
    public static void main(String[] args) {
        System.out.println(DoOp.operate(new String[]{}));
        System.out.println(DoOp.operate(new String[]{"1","-","1"}));
        System.out.println(DoOp.operate(new String[]{"1","%","0"}));
        System.out.println(DoOp.operate(args));
    }
}