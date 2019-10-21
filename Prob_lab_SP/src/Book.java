import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Book {
     private String  Title;
     private List<Chapter>listChapter=new ArrayList<Chapter>();
     public Book(String title) {Title=title;};
     List <Element> listElement =new ArrayList<Element>();
     public int CreateChapter(String title)
     {
  	   Chapter chp=new Chapter(title);
  	   listChapter.add(chp);
  	   return listChapter.indexOf(chp);
     }
     private List<Author>listAuthor=new ArrayList<Author>();
     public void  addAuthor(Author author)
     {
  	   
  	   listAuthor.add(author);
  	   
     }
     Chapter getChapter(int indexOfChapter)
     {
    	 return listChapter.get(indexOfChapter);
     }
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	
	public void print()
	{
		System.out.println("Afisare Book");
		System.out.println("Title"+Title);
//		for (Chapter x:listChapter)
//			x.print();
		for (Author a:listAuthor)
			a.print();
		for (Element x:listElement)
			x.print();
		
	}
	public void addContent(Element e)
	{
		listElement.add(e);
	}
}
