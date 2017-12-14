package SQL;

public class FileBoardSQL {
	//	각각의 질의 명령에 사용할 코드값에 이름을 부여하자.
	public static final int	GET_TOTAL 			= 1101;
	public static final int	GET_BOARDLIST 	= 1102;
	public static final int	GET_NOWNO			= 1103;
	public static final int	GET_BOARDVIEW		= 1104;
	public static final int	GET_SEARCHTOTAL	= 1105;
	public static final int	GET_SEARCHLIST	= 1106;
	public static final int	GET_FILELIST		= 1201;
	public static final int	GET_FILEINFO		= 1202;
	public	static final int	INSERT_BOARD		= 2101;
	public	static final int	INSERT_FILEINFO	= 2201;
	public	static	final int	UPDATE_HIT			= 3101;
	public static final int	UPDATE_ISSHOW		= 3102;
	
	//	참고
	//		나는	코드값을 	?1 ?2  ??3		3개의 자리로 구분하고 싶다.
	//				?1	질의 명령의 종류		SELECT : 1, INSERT 2 : .....
	//				?2	작업 칸테고리			FileBoard : 1, FileInfo : 2, ....
	//				??3	작업의 일련번호
	//		이처럼 코드는 가독성이 있도록 만드는것이 좋다.
	
	//	질의 명령을 알려줄 함수
	public static String getSQL(int code) {
		StringBuffer	buff = new StringBuffer();
		switch(code) {
		case	GET_TOTAL:
			buff.append("SELECT ");
			buff.append("		COUNT(*) AS CNT ");
			buff.append("FROM ");
			buff.append("		FileBoard ");
			buff.append("WHERE ");
			buff.append("		f_IsShow = 'Y' ");
			break;
		case	GET_BOARDLIST:
			buff.append("SELECT ");
			buff.append("		f_NO		AS NO, ");
			buff.append("		f_Writer	AS WRITER, ");
			buff.append("		f_Title		AS TITLE, ");
			buff.append("		f_Date		AS WDAY, ");
			buff.append("		f_Hit		AS HIT, ");
			buff.append("		CNT		AS CNT ");
			buff.append("FROM ");
			buff.append("		FileBoard, ");
			buff.append("		(SELECT ");
			buff.append("			fi_OriNO	AS ORINO, ");
			buff.append("			COUNT(*)	AS CNT ");
			buff.append("		FROM ");
			buff.append("			FileInfo ");
			buff.append("		GROUP BY ");
			buff.append("			fi_OriNO) ");
			buff.append("WHERE ");
			buff.append("				f_IsShow='Y' ");
			buff.append("		AND 	f_NO = ORINO(+) ");
			buff.append("ORDER BY ");
			buff.append("		f_NO DESC ");
			break;
		case	GET_NOWNO:
			buff.append("SELECT 	");
			buff.append("		NVL(MAX(f_NO), 0) + 1 AS CNT ");
			buff.append("FROM  ");
			buff.append("		FileBoard ");
			break;
		case	INSERT_BOARD:
			buff.append("INSERT ");
			buff.append("INTO ");
			buff.append("		FileBoard ");
			buff.append("VALUES ");
			buff.append("		(?, ?, ?, ?, SYSDATE, 0, ?, 'Y') ");
			break;
		case	INSERT_FILEINFO:
			buff.append("INSERT ");
			buff.append("INTO ");
			buff.append("		FileInfo ");
			buff.append("VALUES ");
			buff.append("		( ( SELECT NVL(MAX(fi_NO), 0) + 1 FROM FileInfo ), ");
			buff.append("		?, ?, ?, ?, ?) ");
			break;
		case	GET_BOARDVIEW:
			buff.append("SELECT ");
			buff.append("		f_NO		AS NO,	 ");
			buff.append("		f_Writer	AS WRITER, ");
			buff.append("		f_Title		AS TITLE, ");
			buff.append("		f_Body		AS BODY, ");
			buff.append("		f_Date		AS WDAY, ");
			buff.append("		f_Hit		AS HIT ");
			buff.append("FROM ");
			buff.append("		FileBoard ");
			buff.append("WHERE ");
			buff.append("		f_NO = ? ");
			break;
		case	GET_FILELIST:
			buff.append("SELECT ");
			buff.append("		fi_NO				AS FNO,  ");
			buff.append("		fi_OriNO			AS ORINO, ");
			buff.append("		fi_OriName		AS ORINAME, ");
			buff.append("		fi_SaveName		AS SAVENAME, ");
			buff.append("		fi_Length			AS LENGTH, ");
			buff.append("		fi_Path			AS PATH ");
			buff.append("FROM ");
			buff.append("		FileInfo ");
			buff.append("WHERE ");
			buff.append("		fi_OriNo = ? ");
			break;
		case	GET_FILEINFO:
			buff.append("SELECT ");
			buff.append("		fi_NO				AS FNO,  ");
			buff.append("		fi_OriNO			AS ORINO, ");
			buff.append("		fi_OriName		AS ORINAME, ");
			buff.append("		fi_SaveName		AS SAVENAME, ");
			buff.append("		fi_Length			AS LENGTH, ");
			buff.append("		fi_Path			AS PATH ");
			buff.append("FROM ");
			buff.append("		FileInfo ");
			buff.append("WHERE ");
			buff.append("		fi_NO = ? ");
			break;
		case	UPDATE_HIT:
			buff.append("UPDATE ");
			buff.append("		FileBoard ");
			buff.append("SET ");
			buff.append("		f_Hit = f_Hit + 1 ");
			buff.append("WHERE ");
			buff.append("		f_NO = ? ");
			break;
		case	GET_SEARCHTOTAL:
			buff.append("SELECT ");
			buff.append("		COUNT(*) AS CNT ");
			buff.append("FROM ");
			buff.append("		FileBoard ");
			buff.append("WHERE ");
			buff.append("		!@#$ ");
			break;
		case	GET_SEARCHLIST:
			buff.append("SELECT ");
			buff.append("		f_NO		AS NO, ");
			buff.append("		f_Writer	AS WRITER, ");
			buff.append("		f_Title		AS TITLE, ");
			buff.append("		f_Date		AS WDAY, ");
			buff.append("		f_Hit		AS HIT, ");
			buff.append("		CNT		AS CNT ");
			buff.append("FROM ");
			buff.append("		FileBoard, ");
			buff.append("		(SELECT ");
			buff.append("			fi_OriNO	AS ORINO, ");
			buff.append("			COUNT(*)	AS CNT ");
			buff.append("		FROM ");
			buff.append("			FileInfo ");
			buff.append("		GROUP BY ");
			buff.append("			fi_OriNO) ");
			buff.append("WHERE ");
			buff.append("				f_IsShow='Y' ");
			buff.append("		AND 	f_NO = ORINO(+) ");
			buff.append("		AND 	!@#$ ");
			buff.append("ORDER BY ");
			buff.append("		f_NO DESC ");
			break;
		case	UPDATE_ISSHOW:
			buff.append("UPDATE ");
			buff.append("		FileBoard ");
			buff.append("SET ");
			buff.append("		f_IsShow = 'N' ");
			buff.append("WHERE ");
			buff.append("		f_NO = ? ");
			buff.append("		AND f_Password = ? ");
			break;
		}
		return buff.toString();
	}
}
