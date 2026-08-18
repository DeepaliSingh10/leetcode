class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        Stack <Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(stack.isEmpty()){
                stack.push(c);
            }
            else if(!stack.isEmpty()){
                int t=stack.peek();
                if(t==c)
                stack.pop();
                else
                stack.push(c);
            }

        }
        StringBuilder ans=new StringBuilder();
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}