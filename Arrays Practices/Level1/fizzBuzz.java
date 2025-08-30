class fizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        if(number<=0){
            System.out.println("Error");
            return;
        }
        String[] res=new String[number+1];
        for(int i=0;i<=number;i++){
            if(i%3==0 && i%5==0 && i!=0) res[i]="FizzBuzz";
            else if(i%3==0 && i!=0) res[i]="Fizz";
            else if(i%5==0 && i!=0) res[i]="Buzz";
            else res[i]=String.valueOf(i);
        }
        for(int i=0;i<=number;i++){
            System.out.println("Position "+i+" = "+res[i]);
        }
    }
}