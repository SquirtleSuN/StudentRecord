
/**
 * Driver for the class StudentRecord
 *
 * @JKim 
 * @version (0.1)
 */
public class StudentRecordTester
{
    public static void main(String[] args)
    {
        int[] a={50,50,20,80,53};
        int[] b={20,50,50,53,80};
        int[] c={20,50,50,80};
        
        
        
        StudentRecord[] student= new StudentRecord[3];
        student[0]= new StudentRecord(a);
        student[1]= new StudentRecord(b);
        student[2]= new StudentRecord(c);
        
        double pop =student[0].finalAverage();
        System.out.println(pop);
        double gu =student[1].finalAverage();
        System.out.println(gu);
        double po =student[2].finalAverage();
        System.out.println(po);
    }
    
}
