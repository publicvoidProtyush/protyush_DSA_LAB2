package gl.com.dsa.lab.service;

public class SortDsc {
	void sort(int arr[], int left,int right) {
	
	int temp =0;
for (int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]<arr[j]) {
			temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			
		}
	}
}
		}
}
