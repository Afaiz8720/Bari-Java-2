package ClassAndObject.Constructor;

class student {
    private int rollNo ;
    private String name ;
    private String dept ;
    private String subjects ;

    public student(int rollNo , String name , String dept , String Subject){
        this.rollNo = rollNo ;
        this.name = name ;
        this.dept = dept ;
        this.subjects = subjects ;
    }

    public int getRoll(){ return rollNo ;}
    public String getName(){ return name ;}
    public String getDept(){ return dept ;}
    public String getSubject(){ return subjects ;}


    public void setSubjects(String sub){  subjects = sub ;}

    public String toString(){
        return "\nRoll no : " + rollNo + "\nName : " + name + "\ndept : " + dept + "\nSubjects : " + subjects ;
     }
}
public class Students {
    public static void main(String[] args) {
        student stud[] = new student[3];
        stud[0] = new student(1, "Faiz Ahmad", "IT", "JAVA");
        stud[1] = new student(3, "Abu Hamza", "IT", "HTML/CSS");
        stud[2] = new student(7, "Armaan", "IT", "HTML");

        for (student student : stud) {
            System.out.println(student);
        }
    }
}
