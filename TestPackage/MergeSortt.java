package TestPackage;

public class MergeSortt {
    static void MergeSortF(int array[],int l,int h){
        System.out.println("here");
        if (l <  h){
            int mid=(l+h)/2;
            MergeSortF(array, l, mid);
            MergeSortF(array, mid+1, h);
            Merge(array,l,h);
        }
    }
    static void Merge(int array[], int l,int h){
        System.out.println("here2" +" " + l + " " + h);
        int mid=(l+h)/2;
        int i=l;
        int j=mid+1;
        int ans[]=new int [h-l+1];
        int k=0;
//        int k = l;
        while(i<=mid&&j<=h){
            if(array[i]<array[j]){
                ans[k++]=array[i++];
            }
            else{
                ans[k++]=array[j++];
            }
        }
        while(i<=mid){
            ans[k++]=array[i++];
        }
        while(j<=h){
            ans[k++]=array[j++];
        }
        for(int it=0;it<ans.length;it++){
            array[l+it]=ans[it];
//            System.out.print(ans[it] + " ");
        }
    }
    public static void main(String[] args) {
        int n = 6;
        int array[] = {5, 4, 6, 7, 2, 9};

        MergeSortF(array, 0, 5);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+ " ");
        }
    }
}
