class Solution {
    public int[] plusOne(int[] arr) {
        int car = 0;
        int out[] = new int[arr.length + 1];
        if(arr[arr.length -1] >= 9){
            car = 1;
        }else{
            arr[arr.length -1] +=1;
        }

        for(int i=arr.length - 1; i>=0; i--){
            if(car > 0){
                arr[i] += 1;
                int rem = arr[i]%10;
                out[i+1] = rem; 
                car = arr[i]/10;
            }else{
                out[i+1] = arr[i];
            }
            
        }
        if(car == 1){
            out[0] = 1;
        }
        
        if(out[0] == 0){
            int temp[] = new int[arr.length];
            for(int i=1; i<out.length; i++){
                temp[i-1] = out[i];
            }
            return temp;
        }
        return out;

    }
}
