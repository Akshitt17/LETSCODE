class Solution {
    public long countSubstrings(String s, char c) {
         
        long ans=0;
        long increament =1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c) {
                ans+=increament;
                increament++;
            }

        }
        
        return ans;
        
//         int ans=0;
//         HashMap<Integer , Integer> map = new HashMap<>();
//         int count=0;          
//         for(int i=0;i<s.length() ;i++){
                      
//             if(s.charAt(i) == c){ 
//                 map.put(i , count+1);
//                 count++;
//             }
//             else map.put(i , count);            
//         }
        
//         int i=0;
       
//         for(int i=0;i<s.length;i++){
//             if(s.charAt(i) == c){
//                 ans +=map.get(i);
//             }            
//         }
//         return ans;
    }
}