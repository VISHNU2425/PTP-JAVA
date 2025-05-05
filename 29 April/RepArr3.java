import java.lang.NumberFormatException;
class RepArr3{
	public static void main(String...args){
	int a[]=new int[]{10,4,5,87,34,4,11,4,10,11};
	int num= 0;
	int count=0;
	for(int k=0;k<a.length;k++){
		for(int q= 0;q<a.length;q++){
			if(k != a[q])
				count ++;
			else{
				count = 0 ;
				break;
			}
		}
		if(count>0)
			num = k;
	}
	for(int i=0;i<a.length;i++){
		int p = 0;
		
		for(int j=i+1;j<a.length;j++){
		   if(a[i]==a[j] && a[i] != num) {

		   	if(p == 0){
		   		System.out.println("the repeated no: " + a[i]);
		   		p++;
		   	}
		   	a[j]= num;

   
		   }
		}
	}
  }
}