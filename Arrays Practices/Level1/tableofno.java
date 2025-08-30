class tableofno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        int[] res=new int[4];
        for(int i=6;i<=9;i++){
            res[i-6]=number*i;
        }
        for(int i=6;i<=9;i++){
            System.out.println(number+" * "+i+" = "+res[i-6]);
        }
    }
}