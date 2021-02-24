package TrieTree;

public class Trie {

    static TrieNode root = new TrieNode();

    // insert key to trie if not present
    // else if key is prefix of trie node, just marks leaf node
    void insertKeyToTrie(String key){

        int level;
        int length = key.length();
        int index;

        TrieNode pCrawl = root;

        for(level = 0; level < length; level++){
            index = key.charAt(level) - 'a';

            if(pCrawl.children[index] == null )
                pCrawl.children[index] = new TrieNode();

            pCrawl = pCrawl.children[index];
        }

        //mark last word as leaf
        pCrawl.isEndOfWord = true;
    }
}
