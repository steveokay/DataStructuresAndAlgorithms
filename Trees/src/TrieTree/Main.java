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

        // lets search for the foll keys
        if(trie.searchKey("the") == true)
            System.out.println("the --- " + output[1]);
        else
            System.out.println("the --- " + output[0]);

        if(trie.searchKey("these") == true)
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);

        if(trie.searchKey("their") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);

        if(trie.searchKey("thaw") == true)
            System.out.println("thaw --- " + output[1]);
        else System.out.println("thaw --- " + output[0]);

    }
}
