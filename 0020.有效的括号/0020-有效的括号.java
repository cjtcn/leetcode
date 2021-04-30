class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n % 2 == 1) return false;
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Deque<Character> stack = new LinkedList<>();
        for(int i = 0;i < n;i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                if(stack.isEmpty() || map.get(c) != stack.pop()){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }return stack.isEmpty();
    }
}