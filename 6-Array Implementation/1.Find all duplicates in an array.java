//leetcode 442
class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> l = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[Math.abs(arr[i])-1]<0){
                l.add(Math.abs(arr[i]));
            }
            else{
                arr[Math.abs(arr[i])-1] = arr[Math.abs(arr[i])-1]*-1;
            }
        }
        return l;
    }
}
