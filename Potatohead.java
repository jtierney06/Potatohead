public class Potatohead{
    private boolean mouth;
    private String colorEars;
    private int arms;
    private boolean shoes;

    public Potatohead(){
        mouth = true;
		colorEars = "black";
		arms = 2;
		shoes = true;
    }
    public Potatohead (boolean m, String cE, int a, boolean s){
        mouth = m;
        colorEars = cE;
        arms = a;
        shoes = s;

    }
    public boolean getmMouth(){
        return mouth;
    }
    public String getColorEars(){
        return colorEars;
    }
    public int getArms(){
        return arms;
    }
    public boolean getShoes(){
        return shoes;
    }
    public void setMouth(boolean mo){
        mouth = mo;
    }
    public void setColorEars(String coE){
        colorEars = coE;
    }
    public void setArms(int ar){
        arms = ar;
    }
    public void setShoes(boolean sh){
        shoes = sh;
    }

    public void talk(){
        System.out.println("Hello my name is bob");
    }
    private int feet;
    public void jump(int f){
        feet = f;
        feet++;
        System.out.println("I jumped " + feet + " feet");
    }
    private int miles;
    public String run(){
        miles++;
        return "I ran " + miles + " miles";
    }
    public String toString(){
        return "The color of my ears is " + colorEars + " Do I have a mouth? " + mouth + " I have " + arms + " arms" + " Do I have shoes? " + shoes;
    }
    public static void main(String[] args){
        Potatohead bob = new Potatohead(false,"pink",2,true);
        System.out.println(bob.toString());
        bob.setArms(3);
        bob.setColorEars("Red");
        System.out.println(bob.toString());
        bob.talk();
        bob.jump(3);
        System.out.println(bob.run());
        
    }

}