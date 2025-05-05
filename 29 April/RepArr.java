import java.lang.NumberFormatException;
class RepArr{
	public static void main(String...args){
	int a[]=new int[]{10,4,5,87,34,4,11,4,10,11};
	for(int i=0;i<a.length;i++){
		int p = 0;
		int symbol=-1;
		for(int j=i+1;j<a.length;j++){
		   if(a[i]==a[j] && a[i] != symbol) {

		   	if(p == 0){
		   		System.out.println("the repeated no: " + a[i]);
		   		p++;
		   	}
		   	a[j]= symbol;

   
		   }
		}
	}
  }
}