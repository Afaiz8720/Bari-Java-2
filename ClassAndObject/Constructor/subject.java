package ClassAndObject.Constructor;


class subjects{
    private String subID ;
    private String name ;
    private int maxMarks ;
    private int marksObtain ;

    public subjects(String subID , String name , int maxMarks){
        this.subID = subID ;
        this.name = name ;
        this.maxMarks = maxMarks ;
    }

    public String getSubID(){ return subID ;}
    public String getName(){ return name ;}
    public int getMaxMarks(){ return maxMarks ;}
    public int getMarksObtain(){ return marksObtain ;}

    public void setMaxMarks(int mm){ maxMarks = mm ; }
    public void setMarksObtain(int m){ marksObtain = m ; }
    boolean isQualified(int m){ return m >= maxMarks; }
    public String toString(){
        return "\nSubject ID : " + subID + "\nName : " + name + "\nMarks Obtained : " + marksObtain ;
     }
}
public class subject {
    public static void main(String[] args) {
        subjects subs[] = new subjects[3];
        subs[0] = new subjects("s101", "DATA STRUCTURE", 100);
        subs[1] = new subjects("s102", "OPERATING SYSTEM", 100);
        subs[2] = new subjects("s103", "COMPUTER NETWORK", 100);  

        for (subjects subjects : subs) {
            System.out.println(subjects);
        }
}
}
