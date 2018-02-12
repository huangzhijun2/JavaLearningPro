package leetcodeorlintcode.AddandSearchWord;

import java.util.HashMap;

public class TrieNode {
    HashMap<Character,TrieNode> children;
    boolean isEnd;
    public TrieNode(){
        this.children = new HashMap<Character,TrieNode>();
        this.isEnd = false;
    }
}
