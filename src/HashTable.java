
public class HashTable {
	
	private int size;
	private int tableSize;
	private Handle[] hash;
	
	public HashTable(int tableSize)
	{
		this.tableSize = tableSize;
		hash = new Handle[tableSize];
	}
	
	/**
	 * Use folding on a string, summed 4 bytes at a time
	 * @param s -- string will be hashed
	 * @param M -- size of hash table
	 * @return the home slot position
	 */
	long sfold(String s, int M) {
	  int intLength = s.length() / 4;
	  long sum = 0;
	  for (int j = 0; j < intLength; j++) {
	    char c[] = s.substring(j * 4, (j * 4) + 4).toCharArray();
	    long mult = 1;
	    for (int k = 0; k < c.length; k++) {
	      sum += c[k] * mult;
	      mult *= 256;
	    }
	  }

	  char c[] = s.substring(intLength * 4).toCharArray();
	  long mult = 1;
	  for (int k = 0; k < c.length; k++) {
	    sum += c[k] * mult;
	    mult *= 256;
	  }

	  return(Math.abs(sum) % M);
	}
	/**
	 * check for the size of the handle
	 */
	public void checkCapacity()
	{
		if (size + 1 > tableSize / 2)
		{
			Handle[] temp = hash;
			hash = new Handle[tableSize * 2];
			tableSize = tableSize * 2;
			rehash(temp);
		}
	}
	
	public void rehash(Handle[] temp)
	{
		
	}

}
