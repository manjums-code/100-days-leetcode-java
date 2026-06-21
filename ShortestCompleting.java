public class ShortestCompleting {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int []arr1=new int[26];
        for(int i=0;i<licensePlate.length();i++)
        {
            if(Character.isLetter(licensePlate.charAt(i)))
            {
                arr1[Character.toLowerCase(licensePlate.charAt(i))-'a']++;
            }
        }
        int max=Integer.MAX_VALUE;
        String res="";
        for(int i=0;i<words.length;i++)
        {
            int []arr2=new int[26];
            for(int j=0;j<words[i].length();j++)
        {
            if(Character.isLetter(words[i].charAt(j)))
            {
                arr2[Character.toLowerCase(words[i].charAt(j))-'a']++;
            }
        }
        System.out.println(iscompleting(arr1,arr2));
        if(iscompleting(arr1,arr2))
        {
          if(words[i].length()<max)
          {res=words[i];
          max=res.length();
          }
        }
        }
        return res;
    }
    public boolean iscompleting(int []arr1,int []arr2)
    {
        for(int i=0;i<26;i++)
        {
            if(arr2[i]<arr1[i])
            {
                return false;
            }
        }
        return true;
    }
}
