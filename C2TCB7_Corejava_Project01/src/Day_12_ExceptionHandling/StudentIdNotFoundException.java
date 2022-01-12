package Day_12_ExceptionHandling;

public class StudentIdNotFoundException extends Exception {

		int sid;
		StudentIdNotFoundException(){
			
		}
	
		public StudentIdNotFoundException(int sid) {
			this.sid = sid;
		}

		@Override
		public String toString() {
			return "Exception::Student id not found!!";
		}

		@Override
		public String getMessage() {
			return "student with id "+sid+"Not found!!";

		}
		
}
