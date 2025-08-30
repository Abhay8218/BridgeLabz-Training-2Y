import java.util.*;
class maxheight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names={"Amar","Akbar","Anthony"};
        int[] ages=new int[3];
        int[] heights=new int[3];
        for(int i=0;i<3;i++){
            ages[i]=sc.nextInt();
            heights[i]=sc.nextInt();
        }
        int minAge=ages[0], minIdx=0, maxHeight=heights[0], maxIdx=0;
        for(int i=1;i<3;i++){
            if(ages[i]<minAge){
                minAge=ages[i];
                minIdx=i;
            }
            if(heights[i]>maxHeight){
                maxHeight=heights[i];
                maxIdx=i;
            }
        }
        System.out.println("Youngest: "+names[minIdx]);
        System.out.println("Tallest: "+names[maxIdx]);
    }
}