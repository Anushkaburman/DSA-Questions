class Solution {
public:
    bool wordPattern(string pattern, string s) {
        vector<string>words;
        stringstream ss(s);
        string word;
        while(ss >> word){
           words.push_back(word); 
        }
        if(pattern.size()!=words.size()){
            return false; 
        }
        unordered_map<char,string>charToword;
        unordered_map<string,char>wordTochar;
       for(int i=0; i<pattern.size(); i++){
        char c = pattern[i];
        string w = words[i];
        if(charToword.count(c)){
            if(charToword[c]!=w){
                return false;
            }
        }
         else{
                charToword[c]=w;
            }
        if(wordTochar.count(w)){
                if(wordTochar[w]!=c){
                    return false;
                }
        }
        else{
                    wordTochar[w]=c;
                }
       }
       return true;
    }
};