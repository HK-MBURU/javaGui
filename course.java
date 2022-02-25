public class Name{
    public String fName="Haron";
    public String sName="mburu";
}
public class course extends Name{
    public String courseDone="Computer Science";
    public void display(){
        System.out.println("the first name is:"+fName+" and the second is"+sName+" and the course is "+courseDone);

    }
    public static void main(String[] args) {
        course course=new course();
        course.display();
        
    }

}