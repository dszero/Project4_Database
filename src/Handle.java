/**
 * The Handle class which will be stored into hash table
 * @author Shan Ding (dszero)
 * @version 2017/11/18
 *
 */
public class Handle {
	private int position;
	
	/**
	 * initialize the handler
	 * @param position -- of record that stored in handler
	 */
	public Handle(int position)
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
