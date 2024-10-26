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