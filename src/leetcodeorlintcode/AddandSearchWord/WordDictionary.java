package leetcodeorlintcode.AddandSearchWord;
/*
Design a data structure that supports the following two operations: addWord(word) and search(word)
search(word) can search a literal word or a regular expression string containing only letters a-z or ..
A . means it can represent any one letter.
Example
addWord("bad")
addWord("dad")
addWord("mad")
search("pad")  // return false
search("bad")  // return true
search(".ad")  // return true
search("b..")  // return true
Note
You may assume that all words are consist of lowercase letters a-z.
Tags Expand
Trie
*/

import java.util.Map;
/*
Build the WordDictionary like a TrieTree.
Note: the '.' indicates any letter, which means we'd have to traverse through all possible letters in current level.
Only one of the returning search results needs to be true
Note:
TrieNode contains that char, boolean, and HashMap of children
*/
public class WordDictionary {
    TrieNode root;
    public WordDictionary(){
        this.root = new TrieNode();

    }
    // Adds a word into the data structure.
    public void addWord(String word) {
        TrieNode node = root;
        for (int i =0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!node.children.containsKey(c)) {
                node.children.put(c, new TrieNode());
            }
            node = node.children.get(c);
        }
        node.isEnd = true;
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return searchHelper(root, word, 0);
    }

    public boolean searchHelper(TrieNode root, String word, int index) {
        if (index == word.length()) {
            return root.isEnd;
        }
        TrieNode node = root;
        char c = word.charAt(index);
        //border conditon:
        if (node.children.containsKey(c)) {
            return searchHelper(node.children.get(c), word, index + 1);
        } else if (c == '.'){
            for (Map.Entry<Character, TrieNode> entry : node.children.entrySet()) {
                if (searchHelper(entry.getValue(), word, index + 1)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("word");
        boolean j = wordDictionary.search("....");
        System.out.println(j);
    }

}
