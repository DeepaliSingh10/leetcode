class Solution {
    public String reorganizeString(String s) {
        
        int n = s.length();
        int freq[] = new int[26];


        for(int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }

  
        for(int i = 0; i < 26; i++) {
            if(freq[i] > (n + 1) / 2)
                return "";
        }

        int max = 0;
        for(int i = 1; i < 26; i++) {
            if(freq[i] > freq[max])
                max = i;
        }

        char ans[] = new char[n];
        int idx = 0;

        while(freq[max] > 0) {
            ans[idx] = (char)(max + 'a');
            freq[max]--;
            idx += 2;

            if(idx >= n)
                idx = 1;
        }

        for(int i = 0; i < 26; i++) {
            while(freq[i] > 0) {
                ans[idx] = (char)(i + 'a');
                freq[i]--;
                idx += 2;

                if(idx >= n)
                    idx = 1;
            }
        }

        return new String(ans);
    }
}