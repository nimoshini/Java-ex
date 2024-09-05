

class Num{
    public static void main(String[] args) {
       char a='3';
       if(Character.isLetter(a))
       {
        System.err.println("alphabet");
       }
       else if(Character.isDigit(a))
       {
        System.out.println("number");
       }
       else
       {
        System.out.println("special chracter");
       }
    }
}