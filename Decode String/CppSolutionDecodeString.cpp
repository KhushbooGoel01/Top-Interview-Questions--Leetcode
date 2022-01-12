//https://leetcode.com/problems/decode-string/

class Solution {
public:
    string decode(string s,int &index){
        string str;
        while(index<s.length()){
            if(s[index]==']') return str;
            while(s[index]>='a'&&s[index]<='z'){
                str+=s[index];
                index++;
            }
            if(s[index]>'0'&&s[index]<='9'){
                int n=0;
                while(s[index]!='['){
                    n=n*10+(s[index]-'0');
                    index++;
                }
                index++;
                string q=decode(s,index);
                index++;
                while(n--) {str+=q;}
            }
        }
        return str;
    }
    string decodeString(string s) {
        int index=0;
        return decode(s,index);
    }
};
