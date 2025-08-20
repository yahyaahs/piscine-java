public class DeadCharacterException extends Exception{
    public final Character c;

    public DeadCharacterException(Character c){
        this.c= c;
    }
    public String getMessage(){
        String holder= "";
        if (c instanceof Templar){
            holder = "templar";
        }else if( c instanceof Monster){
            holder = "monster";
        }else{
            holder = "sorcerer";
        }
        return String.format("The %s %s is dead.",holder, c.getName());
    }
}