package DataStructures.trieDataStructure;

public class Create {
    static class TrieNode{
        boolean isEnd;
        TrieNode[] children = new TrieNode[26];
    }

    public static void main(String[] args){

        String[] ans = {"pankaj","kajal","palak","kunal","manoj","santosh"};
        TrieNode root = new TrieNode();
        for (String an : ans) {
            create(an, root);
        }
        boolean present = isPresent("krishna",root);
        System.out.println(present);
        present = isPresent("pankja",root);
        System.out.println(present);
        present = isPresent("kajal",root);
        System.out.println(present);
        remove("kajal",root);
        present = isPresent("kajal",root);
        System.out.println(present);

    }
    static void create(String word , TrieNode root){
        TrieNode node = root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(node.children[c-'a'] == null){
                node.children[c-'a'] = new TrieNode();
            }
            node = node.children[c-'a'];
        }
        node.isEnd = true;
    }
    static boolean isPresent(String word,TrieNode root){
        TrieNode node = root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(node.children[c - 'a'] == null){
                return false;
            }
            node = node.children[c-'a'];
        }
        return node.isEnd;
    }
    static void remove(String word , TrieNode root){
        if(isPresent(word, root)){
            TrieNode node = root;
            for(int i=0;i<word.length();i++){
                char c = word.charAt(i);
                node = node.children[c-'a'];
            }
            node.isEnd = false;
        }

    }
    static boolean startsWith(String word , TrieNode root){
        TrieNode node = root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
           if(node.children[c -'a'] == null){
               return false;
           }
           node = node.children[c-'a'];
        }
        return true;
    }
}
