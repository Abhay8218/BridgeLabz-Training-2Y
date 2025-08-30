class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[10];
        double total=0.0;
        int index=0;
        while(true){
            double val=sc.nextDouble();
            if(val<=0 || index==10) break;
            nums[index]=val;
            index++;
        }
        for(int i=0;i<index;i++){
            total+=nums[i];
            System.out.println(nums[i]);
        }
        System.out.println("Sum = "+total);
    }
}