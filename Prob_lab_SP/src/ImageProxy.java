
public class ImageProxy extends Image{
     private String imageName;
     private Image realImage;
	public ImageProxy(String imageName) {
		super(imageName);
		this.imageName=imageName;
	} 
	public void print(){
		if (realImage==null)
		   this.realImage= new Image(imageName);
		realImage.print();
	}
}
