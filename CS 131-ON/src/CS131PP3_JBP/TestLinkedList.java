package CS131PP3_JBP;

public class TestLinkedList<T> {

	public static void main(String[] args) {
		
		GenericLinkedList <String> myList=new GenericLinkedList<String>();
		GenericLinkedList <Integer> a= new GenericLinkedList<Integer>();
		GenericLinkedList <Double> b = new GenericLinkedList<Double>();
		
		GenericNode aNode=new GenericNode();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new GenericNode();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		GenericNode bNode=new GenericNode();
		bNode.setData(1);
		a.addNode(bNode);
		bNode = new GenericNode();
		bNode.setData(12);
		a.addNode(bNode);
		
		GenericNode cNode=new GenericNode();
		cNode.setData(1.45);
		b.addNode(cNode);
		cNode = new GenericNode();
		cNode.setData(12.23);
		b.addNode(cNode);
		
		GenericNode tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		GenericNode atempnode=a.getList();
		do 
		{
			System.out.println(atempnode.getData());
			atempnode=atempnode.getNextNode();
		} while (atempnode!=null);
		GenericNode btempnode=a.getList();
		do 
		{
			System.out.println(btempnode.getData());
			btempnode=btempnode.getNextNode();
		} while (btempnode!=null);
	}//end main

}//end class
