package Lecture07;

public class BS_searchSpace {
    static boolean check(int speed,int dist,int time){
        return(speed*time>=dist);
        
    }
    static int reachcollege(int dist, int high, int time){
        int ans =-1;
        int low = 0;
        while(low<=high){
            int mid = high-(high-low)/2;
        
        if(check(mid,dist,time)){
            ans = mid;
            high = mid - 1;
        }else{
            low = mid + 1;
        }
        
    }
    return ans;
}
    public static void main(String[] args){
        int distance = 100;
        int maxSpeed=100;
        int time = 2;
        System.out.println(reachcollege(distance,maxSpeed,time));

    }

}


    

