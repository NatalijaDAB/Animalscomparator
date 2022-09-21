public class Animal {
    private String type;
    private int age;
    private boolean isWild;

    public Animal(String type, int age, boolean isWild){
        this.type = type;
        this.age=age;
        this.isWild=isWild;
    }
    public String getType(){
        return type;
    }
    public int getAge(){
        return age;
            }
    public boolean isWild(){
        return isWild;
    }

}
