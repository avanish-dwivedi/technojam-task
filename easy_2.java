class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        for(int i=0; i<seats.length ; i++ ){
            for(int j=0;j<seats.length-1;j++){
                if(seats[j]<seats[j+1]){
                    int t=seats[j];
                    seats[j]=seats[j+1];
                    seats[j+1]=t;
                }
            }
        }
        for(int i=0; i<students.length ; i++ ){
            for(int j=0;j<students.length-1;j++){
                if(students[j]<students[j+1]){
                    int k=students[j];
                    students[j]=students[j+1];
                    students[j+1]=k;
                }
            }
        }
        int ans=0;
        for(int i=0;i<seats.length;i++){
            ans+=Math.abs(seats[i]-students[i]);
        }
        return ans;
    }
}