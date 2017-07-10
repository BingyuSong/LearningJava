package java_practice;

public class Student_Attendance_Record_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PPLLAL";
		boolean ans = checkRecord(s);
		System.out.print(ans);

	}
	public static boolean checkRecord(String s) {
		return !s.matches(".*LLL.*|.*A.*A.*");

    }

}
