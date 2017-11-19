/**
 * The Handler class which will be stored into hash table
 * @author Shan Ding (dszero)
 * @version 2017/11/18
 *
 */
public class Handler {
	private int position;
	
	/**
	 * initialize the handler
	 * @param position -- of record that stored in handler
	 */
	public Handler(int position)
	{
		this.position = position;
	}

	/**
	 * get the position of the handler
	 * @return position
	 */
	public int getPosition()
	{
		return position;
	}
}
