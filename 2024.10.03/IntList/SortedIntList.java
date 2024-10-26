public class SortedIntList extends IntList{
	
	public SortedIntList(int list){
		super(list);
	}
	
	public void sorting(){
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
	}
}