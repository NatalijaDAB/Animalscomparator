public class Animal1 implements Comparable<Animal1> {

    private String type;
    private int age;
    private boolean isWild;

    public Animal1(String type, int age, boolean isWild){
        this.type = type;
        this.age=age;
        this.isWild=isWild;
    }

    public int getAge(){
        return age;
    }
    @Override
    public int compareTo (Animal1 o){
        return this.getAge()-o.age;
    }
    @Override
    public String toString(){
        return "Animal1{type="+type+", age="+age+", is wild="+isWild+"}";
       }

}

