import java.util.*;
class StringManipulation
{
	String sentence;
	StringManipulation()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter the sentence:: \n");
		sentence = in.nextLine();
	}
	void occurence()
	{
		String sentence = this.sentence;
        String[] array = sentence.split(" ");
        Set<String> set = new HashSet<>(Arrays.asList(array));
        for(String i : set)
        {
            int count = 0;
            for(String j : array)
                if((i.compareTo(j)) == 0)
                    count++;
            System.out.println(i+":: "+ count);
        }
	}
	void replaceWord()
	{
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the word that need to be replaced:: ");
        String word = sc.nextLine();
        System.out.print("Enter the word that need to be placed:: ");
        String rword = sc.nextLine();
        String sentence = this.sentence;
        String sent="";
        String[] array = sentence.split(" ");
        for(int i=0; i<array.length; i++)
        {
            if((array[i].compareTo(word))==0)
                array[i] = rword;
            sent = sent +  array[i] + " ";
        }
        this.sentence = sent;
        System.out.println("The modified sentence::\n"+this.sentence);
	}

	void reverseWords()
	{
		String sentence = this.sentence;
        String sent="";
        String temp;
        String[] array = sentence.split(" ");
        
        for(int i=0;i<array.length;i++){;
            temp="";
            String[] temparray = array[i].split("");
            for(int j=array[i].length()-1;j>=0;j--){
                temp = temp + temparray[j];
            }
            sent = sent +  temp + " ";
        }
        this.sentence = sent;
        System.out.println("The modified sentence::\n"+this.sentence);
	}
}
class P8
{
	public static void main(String[] args)
	{
		StringManipulation str = new StringManipulation();
		int ch;
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.print("\n1. Count the number of occurence of each word\n2. Replace a word with another\n3. Reverse each word\n4. Exit\nEnter your choice::");
			ch = in.nextInt();
			switch(ch)
			{
				case 1: str.occurence(); break;
				case 2: str.replaceWord(); break;
				case 3: str.reverseWords(); break;
				case 4: System.out.println("Exiting..."); break;
				default: System.out.println("Invalid choice!!!");
			}
		}while(ch!=4);
	}
}

// Here is the text which is a text that is again a text