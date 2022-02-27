class Solution {
    public int romanToInt(String s) {
        int fin = 0;
        for(int i = 0; i < s.length(); i++){
            int a = values(s.charAt(i));
            if(i+1 < s.length()){
                int b = values(s.charAt(i+1));
                if(a>=b){
                    fin +=a;
                }
                else{
                    fin -= a;
                }
            }
            else{
                fin += a;
            }
        }
        return fin;
    }

    public int values(char c){
        int val=0;
        if(c == 'I'){
            val = 1;
        }
        if(c == 'V'){
            val = 5;
        }
        if(c=='X'){
            val =10;
        }
        if(c=='L'){
            val = 50;
        }
        if(c=='C'){
            val = 100;
        }
        if(c=='D'){
            val =500;
        }
        if(c=='M'){
            val =1000;
        }
        return val;
        
    }
    
}