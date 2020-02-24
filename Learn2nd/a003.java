class a003{
    public static void main(String[] args){
        int[] x = {1,2,6,3,4,5};
        int max = x[0];
        for(int i=1;i<x.length;i++){        //max
            if(x[i]>max){       
                max = x[i];
            }
        }
        System.out.println(max);
    }
}

