class AreaCircum{
	public static void main(String args[]){
		int length,breadth;
		length = Integer.parseInt(args[0]);
		breadth = Integer.parseInt(args[1]);
		int area = length*breadth;
		int circum = 2*(length+breadth);
		System.out.println("Length of rectangle="+length);
		System.out.println("Breadth of rectangle="+breadth);
		System.out.println("Area of rectangle="+area);
		System.out.println("Circumference of rectangle="+circum);
	}
}