package myProject;

public class MyClass<T> {

	//after ignore
	
	//2nd\
	
//	werwerwer
	private T[] array ;
	public void setT(T[]array){
		this.array=array;
	}
	public T[] getT(){
		return array;
	}
	public static void main(String[] args){
		MyClass<String> a=new MyClass<String>();
		String[] array={"cy1","cy2","cy3","cy4"};
		a.setT(array);
		for(int i=0;i<a.getT().length;i++){
			System.out.println(a.getT()[i]);
		}
	}
	
	}