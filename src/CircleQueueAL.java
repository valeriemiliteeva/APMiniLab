import java.util.*;

public class CircleQueueAL
{
	public ArrayList<LinkedList> cal;
	private LinkedList headNode;
	private LinkedList tailNode;
	private LinkedList currentNode;
	private int currIndex;

	public CircleQueueAL()
	{
		headNode = null;
		tailNode = null;
		currentNode = null;
		cal = new ArrayList<LinkedList>();
		currIndex = 0;
	}


	public Object getFirstObject()
	{
		if(headNode == null)
		{
			return null;
		}

		return (headNode).getObject();
	}

	public Object getLastObject()
	{
		if(tailNode == null)
		{
			return null;
		}

		return tailNode.getObject();
	}

	public Object getObject()
	{
		if(currentNode == null)
		{
			return null;
		}

		return currentNode.getObject();
	}

	public void setNext()
	{
		if(cal.size() > currIndex + 1)
		{
			currentNode = cal.get(currIndex + 1);
			currIndex++;
		}
		else
		{
			currIndex = 0;
			currentNode = headNode;
		}
	}

	public void setPrevious()
	{
		if((currIndex - 1) < 0)
		{
			currIndex = cal.size() - 1;
			currentNode = tailNode;
		}
		else
		{
			currIndex--;
			currentNode = cal.get(currIndex);
		}
	}

	public void add(Object opObj)
	{
		cal.add(new LinkedList(opObj, currentNode));

		if(currentNode == null)
		{
			currentNode = headNode;
		}

		if(cal.size() == 1)
		{
			headNode = cal.get(0);
			tailNode = cal.get(cal.size() - 1);
			currentNode = headNode;
		}

		tailNode = cal.get(cal.size() - 1);
	}

	public Object delete()
	{
		if(cal.size() == 0)
		{
			return null;
		}
		if(cal.size() == 1)
		{
			headNode = null;
			tailNode = null;
			return cal.remove(0);
		}

		headNode = cal.get(1);
		currIndex--;
		return cal.remove(0);
	}
}
