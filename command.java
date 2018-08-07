class command
{
	public static void main(String args[]){
			int s=0;
			for(int i=0;i<args.length;i++)
			{
				int x = Integer.parseInt(args[i].trim());
				s+=x;
			}
			System.out.println("Sum of arguments is "+ s);
		}
	
}