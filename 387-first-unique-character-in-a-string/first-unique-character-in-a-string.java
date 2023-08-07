class Solution {
    public int firstUniqChar(String s) {
        int count=0;
        int ans=0;
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                int value=map.get(c);
                map.replace(c,value+1);
            }
            else{
                map.put(c,1);
            }
        }
        System.out.println(map);
            for(char i: s.toCharArray()){
                count++;
                if((map.get(i)).equals(1)){
                    
                    ans=map.get(i);
                    System.out.println(ans);
                    System.out.println(count);
                    break;
                }
            }
            if(s.length()==1){
                return 0;
            }
            for(char f:map.keySet()){
                if(map.get(f)==1){
                    return count-1;
                }

            }
            return -1;
            // if(count==s.length()){
            //     return -1;
            // }
            // return count-1;
        
    }  
} 
//         int i=0;
//         Map<Integer,Character> map=new ConcurrentHashMap<>();
//         for(char u:s.toCharArray()){
//             map.put(i,u);
//             i++;
//         }
// i=-1;
// for (int j : map.keySet()) {
//                 char v=map.get(j);
//             i++;
//             System.out.println(i);
//              map.remove(j);
//             if(!map.containsValue(v)){
//                 return i;
//             }
//                       //  map.remove(j);

//         }
        
// return -1;