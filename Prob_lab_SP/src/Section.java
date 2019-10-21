import java.util.ArrayList;
import java.util.List;

public class Section extends Element {
 private String sectionName;
 private List<Element>listElement =new ArrayList<Element>();
 public Section(String name)
 {
	 sectionName=name;
 }
 public int add(Element e)
 {
	 listElement.add(e);
	 return listElement.indexOf(e);
 }
 public void remove(Element e)
 {
	 listElement.remove(e);
 }
public String getSectionName() {
	return sectionName;
}
public void setSectionName(String sectionName) {
	this.sectionName = sectionName;
}
public List<Element> getListElement() {
	return listElement;
}
public void setListElement(List<Element> listElement) {
	this.listElement = listElement;
}
public Element getElement(int index)
{
	return listElement.get(index);
}
public void print()
{
	System.out.println("Nume Section"+sectionName);
	for (Element x:listElement)
		x.print();
	
}
}
