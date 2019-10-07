import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class A {
	public String name;
	private LocalDate data;
	public Collection<B>listOfB=new ArrayList();
	public LocalDate getDob() {return data;}
	public void setDob(LocalDate d) {data=d;}
	private C c=new C(name);

}
