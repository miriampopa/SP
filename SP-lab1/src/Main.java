import java.time.LocalDate;

public class Main {
//LocalDate.now()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.name="Name";
		B b=new B();
		B b1=new B();
		int idreq=6;
		b.setId(idreq);
		b1.setId(idreq+4);
		a.listOfB.add(b);
		a.listOfB.add(b1);
		a.setDob(LocalDate.of(2019,12,3));
		LocalDate dob=a.getDob();
		a.setDob(dob);
		System.out.println("Show  obj of A type " +a.name+" "+a.getDob());
		for (B ob:a.listOfB)
		{
			System.out.println(""+ob.getId());
		}
		

	}

}
