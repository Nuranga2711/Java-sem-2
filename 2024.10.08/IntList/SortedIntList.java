public class SortedIntList extends IntList{
	
	public SortedIntList(int list){
		super(list);
	}
	
	
	public void add(int value){
		if(numElements == list.length){
			System.out.println("Can't add, list is full");
		}
		else{
			for(int i = 0; i < list.length; i++){
				if(value < list[i] || i == numElements){
					for(int k = list.length -2; k >= i; k--){
						list[k + 1] = list[k];
					}
					list[i] = value;
					numElements++;
					break;
				}
			}
		}
	}
	
	/*public void sorting(){
		for(int i=1; i<super.numElements; i++){
			int j = i - 1;
			int key = list[i];
			while(j>=0 && key<list[j]){
				list[j+1] = list[j];
				j--;
			}
			list[j+1] = key;
		}
	}
	
	public String toString(){
		sorting();
		String returnString = "";
		for(int i=0; i<numElements; i++)
			returnString += i + ": " + list[i] + "\n";
		return returnString;
	}*/
}