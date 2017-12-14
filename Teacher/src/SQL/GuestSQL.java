package SQL;

public class GuestSQL {
	public static final int	INSERT_BOARD 	= 2101;
	public static final int	SELECT_BOARD 	= 1101;
	public static String getSQL(int code) {
		StringBuffer	buff = new StringBuffer();
		switch(code) {
		case INSERT_BOARD :
			buff.append("INSERT ");
			buff.append("INTO ");
			buff.append("	guest ");
			buff.append("VALUES ");
			buff.append("	( (SELECT NVL(MAX(g_NO), 0) + 1 FROM guest), ?, ?) ");
			break;
		case SELECT_BOARD :
			buff.append("SELECT ");
			buff.append("	g_NO		AS NO, ");
			buff.append("	g_Title	AS TITLE, ");
			buff.append("	g_Body	AS BODY ");
			buff.append("FROM ");
			buff.append("	guest ");
			break;
		};
		return buff.toString();
	}
}
