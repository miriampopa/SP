
public class Main {
	
	public static void main(String args[]) {
//    Book book=new Book("Disea Titanic");
//    Author author=new Author("Radu Paul");
//    book.addAuthor(author);
//    int indexOfChapter=book.CreateChapter("Chapter1");
//    Chapter chapt=book.getChapter(indexOfChapter);
//    /*
//    int indexOfSubChapter=chapt.CreateSubChapter("Chapter one");
//    SubChapter Subchapt=chapt.getChapter(indexOfChapter);
//    int indexParagraph=Subchapt.CreateParagraph("Paragraph");
//    int indexImage=Subchapt.CreateImage("Image");
//    int indexTable=Subchapt.CreateTable("Table");  
//    */
//    int indexSubChapterOneOne =chapt.CreateSubChapter("Subcahpter1.1.");
//    SubChapter scOneOne =chapt.getSubChapter(indexSubChapterOneOne);
//    scOneOne.CreateParagraph("Paragraph 1");
//    scOneOne.CreateParagraph("Paragraph 2");
//    scOneOne.CreateParagraph("Paragraph 3");
//    scOneOne.CreateImage("Image 1");
//    scOneOne.CreateParagraph("Paragraph 4");
//    scOneOne.CreateTable("Table 1");
//    scOneOne.CreateParagraph("Paragraph 5");
//    chapt.print();
		
	//lab4
//		Book noapteBuna=new Book("Noapte buna copii");
//		Author rpGheo = new Author("Radu Pavel Gheo");
//		noapteBuna.addAuthor(rpGheo);
//		
//		Section cap1 =new Section("Capitollul 1");
//		Section cap11 =new Section("Capitolul 1.1");
//		Section cap111 = new Section ("Capitolul 1.1.1");
//		Section cap1111 = new Section ("Capitolul 1.1.1.1");
//		noapteBuna.addContent(new Paragraph("Multumesc celor care au facut posibila ..."));
//		noapteBuna.addContent(cap1);
//		cap1.add(new Paragraph("Moto capitol"));
//		cap1.add(cap11);
//		cap11.add(new Paragraph("Text from subchapter 1.1"));
//		cap11.add(cap111);
//		cap111.add(new Paragraph("Text from subchapter 1.1.1"));
//		cap111.add(cap1111);
//		cap1111.add(new Image("Image subchapter 1.1.1.1."));
//		noapteBuna.print();
    
//	long startTime = System.currentTimeMillis();
//	Image img1 = new Image("Pamela Anderson");
//	Image img2 = new Image("Kim Kardashian");
//	Image img3 = new Image("Kirby Griffin");
//	Section playboyS1 = new Section("Front Cover");
//	playboyS1.add(img1);
//	Section playboyS2 = new Section("Summer Girls");
//	playboyS2.add(img2);
//	playboyS2.add(img3);
//	Book playboy = new Book("Playboy");
//	playboy.addContent(playboyS1);
//	playboy.addContent(playboyS2);
//	long endTime = System.currentTimeMillis();
//	System.out.println("Creation of the content took " + (endTime -
//	startTime) + " milliseconds");
//	startTime = System.currentTimeMillis();
//	playboyS1.print();
//	endTime = System.currentTimeMillis();
//	System.out.println("Printing of the section 1 took " + (endTime -
//	startTime) + " milliseconds");
//	startTime = System.currentTimeMillis();
//	playboyS1.print();
//	endTime = System.currentTimeMillis();
//	System.out.println("Printing again the section 1 took " + (endTime -
//	startTime) + " milliseconds");
//	
//	
	
	
	long startTime = System.currentTimeMillis();
	ImageProxy img1 = new ImageProxy("Pamela Anderson");
	ImageProxy img2 = new ImageProxy("Kim Kardashian");
	ImageProxy img3 = new ImageProxy("Kirby Griffin");
	Section playboyS1 = new Section("Front Cover");
	playboyS1.add(img1);
	Section playboyS2 = new Section("Summer Girls");
	playboyS2.add(img2);
	playboyS2.add(img3);
	Book playboy = new Book("Playboy");
	playboy.addContent(playboyS1);
	playboy.addContent(playboyS2);
	long endTime = System.currentTimeMillis();
	System.out.println("Creation of the content took " + (endTime -
	startTime) + " milliseconds");
	startTime = System.currentTimeMillis();
	playboyS1.print();
	endTime = System.currentTimeMillis();
	System.out.println("Printing of the section 1 took " + (endTime -
	startTime) + " milliseconds");
	startTime = System.currentTimeMillis();
	playboyS1.print();
	endTime = System.currentTimeMillis();
	System.out.println("Printing again the section 1 took " + (endTime -
	startTime) + " milliseconds");
	}
	
    
}
