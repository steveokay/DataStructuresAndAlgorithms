#include <iostream>

using namespace std;

const int ALPHABET_SIZE = 26;

struct TrieNode{
    struct TrieNode* children[ALPHABET_SIZE];
    bool isEndOfWord;
};


struct TrieNode* getNode(void){
    struct TrieNode* pNode = new TrieNode;

    pNode->isEndOfWord = false;

    for(int i = 0; i < ALPHABET_SIZE; i++)
        pNode->children[i] = NULL;

    return pNode;
};

// method inserts key into trie-tree if it doesnt Exist
void insertToTrie(struct TrieNode* root, string key){

    struct TrieNode* pCrawl = root;

    for(int i = 0; i < key.length(); i++ ){
        int index = key[i] - 'a';

        if(!pCrawl->children[index])
            pCrawl->children[index] = getNode();

        pCrawl = pCrawl->children[index];
    }
    pCrawl->isEndOfWord = true;
};

// search for key exist and return
bool searchTrie(struct TrieNode* root, string key){

    struct TrieNode* pCrawl = root;

    for(int i = 0; i < key.length(); i++){
        int index = key[i] - 'a';

        if(!pCrawl->children[index])
            return false;

        pCrawl = pCrawl->children[index];
    }
    return (pCrawl != NULL && pCrawl->isEndOfWord);
}

//ret true if root has no children
bool isEmptyRoot(TrieNode* root){

    for(int i = 0; i < ALPHABET_SIZE; i++){
        if(root->children[i])
            return false;
        return true;
    }
}

// delete key from trie recurssively
TrieNode* removeKeyFromTrie(TrieNode* root, string key, int depth = 0){
    // if empty ret null
    if(!root){
        return NULL;
    }

    // if last character
    if(depth == key.size()){

        if(root->isEndOfWord)
            root->isEndOfWord = false;

        if(isEmptyRoot(root)){
            delete (root);
            root = NULL;
        }

        return root;
    }

    // if not last character
    int index = key[depth] - 'a';
    root->children[index] =
         removeKeyFromTrie(root->children[index], key, depth + 1);

    // root has no child
    if(isEmptyRoot(root) && root->isEndOfWord == false){
        delete(root);
        root = NULL;
    }

    return root;
}

int main(){
    // Input keys (use only 'a' through 'z'
    // and lower case)
    string keys[] = { "the", "a", "there",
                      "answer", "any", "by",
                      "bye", "their", "hero", "heroplane" };

    int n = sizeof(keys) / sizeof(keys[0]);

    struct TrieNode* root = getNode();

    // construct trie tree
    for(int i = 0; i < n; i++){
        insertToTrie(root,keys[i]);
    }

    searchTrie(root, "the") ? cout << "Yes\n" : cout << "No\n";
    searchTrie(root, "these") ? cout << "Yes\n" : cout << "No\n";

    removeKeyFromTrie(root, "heroplane");
    searchTrie(root, "hero") ? cout << "Yes\n" : cout << "No\n";

    return 0;
}
