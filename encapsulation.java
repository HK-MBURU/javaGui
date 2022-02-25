public class encapsulation {
    private String name;

    public void setName(String newName){
        this.name=newName;

    }
    public String getName(){
        return name;
    }
    public static void main(String args[]){
        encapsulation p=new encapsulation();
        p.setName("John");
        System.out.println(p.getName());
    }
}
