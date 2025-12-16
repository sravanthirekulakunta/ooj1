import java.util.Scanner;
interface Sortable{
    void sort(int arr[]);
}

class BubbleSort implements Sortable{
    
    public void sort(int arr[]){
        System.out.println("Elements Before Sorting: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i; j<arr.length;j++){
                if (arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("Elements After Sorting: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
class sortingprogram{
    public static void main(String[] args) {
        int n;
        int myarray[];
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        n=s.nextInt();
        myarray=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            myarray[i]=s.nextInt();
        }
        Sortable b= new BubbleSort();
        b.sort(myarray);

    }
}