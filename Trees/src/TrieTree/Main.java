package TrieTree;

public class Main {

    public static void main(String args[]){

        Trie trie = new Trie();

        String keys[] = {"the", "a", "there", "answer", "any",
                "by", "bye", "their"};

        String output[] = {"Not present in trie", "Present in trie"};

        TrieNode root = new TrieNode();

        // construct a trie tree
        for(int i = 0; i < keys.length; i++)
            trie.insertKeyToTrie(keys[i]);

    }
}
