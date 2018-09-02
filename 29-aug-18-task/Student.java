public class Student {

    private int rollNo;
    private String sName;
    private int sub1;
    private int sub2;
    private int sub3;
    private static int passMarks = 33;
    private final int MAX_MARKS = 100;
    private static int totalStudents = 0;
    private static int sub1Pass = 0;
    private static int sub2Pass = 0;
    private static int sub3Pass = 0;
    private static int overallPass = 0;
    private int flag = 0;
    private int sub1flag = 0;
    private int sub2flag = 0;
    private int sub3flag = 0;
    private int overallflag = 0;
   
    public Student() {
   
    }
    public Student(int rollNo, String sName, int sub1, int sub2, int sub3) {
     this.rollNo = rollNo;
     this.sName = sName;
     this.sub1 = sub1;
     this.sub2 = sub2;
     this.sub3 = sub3;
     if (flag == 0) {
      flag = 1;
      totalStudents++;
     }
     if (this.sub1 >= passMarks) {
      if (sub1flag == 0) {
       sub1flag = 1;
       sub1Pass++;
      }
     }
     if (this.sub2 >= passMarks) {
      if (sub2flag == 0) {
       sub2flag = 1;
       sub2Pass++;
      }
     }
   
     if (this.sub3 >= passMarks) {
      if (sub3flag == 0) {
       sub3flag = 1;
       sub3Pass++;
      }
     }
     if (this.sub1 >= passMarks && this.sub2 >= passMarks && this.sub3 >= passMarks) {
      if (overallflag == 0) {
       overallflag = 1;
       overallPass++;
      }
     }
    }
     public void setData(int rollNo, String sName, int sub1, int sub2, int sub3, String status) {
      if (flag == 0) {
       flag = 1;
       totalStudents++;
      }
      this.rollNo = rollNo;
      this.sName = sName;
      this.sub1 = sub1;
      this.sub2 = sub2;
      this.sub3 = sub3;
   
      if (this.sub1 >= passMarks) {
       if (sub1flag == 0) {
        sub1flag = 1;
        sub1Pass++;
       }
      }
      if (this.sub2 >= passMarks) {
       if (sub2flag == 0) {
        sub2flag = 1;
        sub2Pass++;
       }
      }
   
      if (this.sub3 >= passMarks) {
       if (sub3flag == 0) {
        sub3flag = 1;
        sub3Pass++;
       }
      }
      if (this.sub1 >= passMarks && this.sub2 >= passMarks && this.sub3 >= passMarks) {
       if (overallflag == 0) {
        overallflag = 1;
        overallPass++;
       }
      }
    }
     public double calAverage() {
      int sum = sub1 + sub2 + sub3;
      double avg = sum / 3;
      return avg;
     }
   
     public static void passFail() {
      int fail = totalStudents - overallPass;
      System.out.println("....................RESULTS....................");
      System.out.println("SUB1  SUB2  SUB3");
      System.out.println(sub1Pass + "/" + totalStudents + " " + sub2Pass + "/" + totalStudents + "  " + sub3Pass + "/" + totalStudents);
   
      System.out.println("********overall Result********");
      System.out.println("Total Pass:" + " " + overallPass);
      System.out.println("Total Fail:" + " " + fail);
   
     }
   
     public void result() {
      System.out.println("Name:" + sName + " " + "ROLLNO:" + rollNo + " " + "SUB1:" + sub1 + " " + "SUB2:" + sub2 + " " + "SUB3:" + sub3 + " ");
      if (overallflag == 0)
       System.out.println("FAIL..SORRY");
      else
       System.out.println("PASSED");
   
     }
   
   
    }