package packString;

public class Permutations {
	
public  void permute(String str,int leftIndex ,int rightIndex)
{
	if (leftIndex == rightIndex) 
        System.out.println(str);
	else
	{
	for(int i=leftIndex;i<=rightIndex;i++)
	{
		str=swap(str,leftIndex,i); //for swapping characters of both index
		permute(str,leftIndex+1,rightIndex); //for fetching all other permutations of the above str
	   str=swap(str,leftIndex,i); //for backtracking str after all permutations are done ,for next iteration
	}
	}
}

public String swap(String st ,int l ,int r)
{
	char temp; 
    char[] charArray = st.toCharArray(); 
    temp = charArray[l]; 
    charArray[l] = charArray[r]; 
    charArray[r] = temp; 
    return String.valueOf(charArray); 
}
}
