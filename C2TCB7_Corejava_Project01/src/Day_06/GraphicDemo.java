package Day_06;

abstract class GraphicObject{

	int x,y;
	void moveTo(int newX,int newY)
	{
		this.x=newX;
		this.y=newY;
	}
	abstract void draw();
	abstract void resize();
}
	class Rectangle extends GraphicObject
	{
		void show()
		{
			
		}

		@Override
		void draw() {

			
		}

		@Override
		void resize() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class Circle extends GraphicObject
	{

		@Override
		void draw() {
			
		}

		@Override
		void resize() {
			
		}
		
	}
public class GraphicDemo {

	public static void main(String[] args) {
		//GraphicObject obj=new GraphicObject();
		Rectangle obj1=new Rectangle();
		obj1.show();
	}

}
