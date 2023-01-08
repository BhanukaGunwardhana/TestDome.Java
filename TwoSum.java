package Java_Advanced.TestDomeTests;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        try {
            int [] arr=new int [2];
            for (int i=0;i<list.length;i++){
                int s=0;
                if(i>sum){continue;}
                for (int j=i+1;j<list.length;j++){
                    if(list[j]<sum){
                        if(list[i]+list[j]==sum){
                            arr[0]=i;
                            arr[1]=j;
                            return arr;
                        }
                    }
                    else{
                        continue;
                    }
                    

                }
            }
            return null;
            
        } catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
        
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}