package TrieTree;

public class TrieNode {
    static final int ALPHABET_SIZE = 26;

    TrieNode[] children = new TrieNode[ALPHABET_SIZE];

    boolean isEndOfWord;

    TrieNode(){
        isEndOfWord = false;
        for( int i = 0; i < ALPHABET_SIZE; i++){
            children[i] = null;
        }
    }
}
