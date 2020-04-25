import java.util.*;
import java.lang.*;

public class CircleQueueAlDriver
{
	public static void main(String[] args) {
		CircleQueueAL c = new CircleQueueAL();
		//Integer a = new Integer(1);
		c.add(new String("1"));
		c.add(new String("2"));
		c.add(new String("3"));
		System.out.println("object 1: " + c.getObject());
		c.setNext();
		System.out.println("object 2: " + c.getObject());
		c.setNext();
		System.out.println("object 3: " + c.getObject());
		c.setNext();
		System.out.println("object 1: " + c.getObject());
		c.setNext();
		System.out.println("object 2: " + c.getObject());
		c.delete();
		System.out.println("new first: " + c.getFirstObject());
		System.out.println("object 1: " + c.getObject());
		c.setNext();
		System.out.println("object 2: " + c.getObject());
		c.setNext();
		System.out.println("object 1: " + c.getObject());

	}
}
