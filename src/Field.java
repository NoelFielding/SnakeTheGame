import java.util.ArrayList;

public class Field {
	public ArrayList objects;
	public FieldObject[][] field;
	private int height;
	private int width;
	
	public Field(int width, int height){
		objects = new ArrayList();
		field = new FieldObject[width][height];
		this.height = height;
		this.width = width;
		}
	
	public int getHeigth() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
}