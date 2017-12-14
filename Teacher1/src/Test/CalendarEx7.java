package Test;
import java.util.*; 

class CalendarEx7 { 
      public static void main(String[] args) { 
            int year  = 2017; 
            int month = 7; 
			//	�������� ����� ����
            Calendar sDay = Calendar.getInstance();       // ������ 
			//	�������� ����� ����
            Calendar eDay = Calendar.getInstance();       // ���� 

            // ���� ��� 0 ���� 11������ ���� �����Ƿ� 1�� ������Ѵ�. 
            // ���� ���, 2004�� 11�� 1���� sDay.set(2004, 10, 1);�� ���� ����� �Ѵ�. 
            sDay.set(year, month-1, 1, 0, 0, 0);     // �Է¿��� 1�Ϸ� �����Ѵ�.
            sDay.set(Calendar.MILLISECOND, 0);
            // �Է¿��� ���Ϸ� �����Ѵ�.
	        eDay.set(year, month-1,  sDay.getActualMaximum(Calendar.DATE), 0, 0, 0);	
            eDay.set(Calendar.MILLISECOND, 0);
			// 1���� ���� ���� �Ͽ��Ϸ� ��¥����.
            sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK) + 1);
            // ������ ���� ���� ����Ϸ� ��¥����	
            eDay.add(Calendar.DATE, 7 - eDay.get(Calendar.DAY_OF_WEEK));	

            System.out.println("      " + year +"�� " + month +"��"); 
            System.out.println(" SU MO TU WE TH FR SA"); 
     
            Calendar	car1 = Calendar.getInstance();
            Calendar	car2 = Calendar.getInstance();
            
			//���� �Ϻ��� ������ �ϱ���(sDay <= eDay) 1�Ͼ� ������Ű�鼭 ��(Calendar.DATE)�� ���
			for(int n=1; 
				sDay.before(eDay); 
	
					sDay.add(Calendar.DATE, 1)) {	//	��¥�� �Ϸ羿 �����ϸ鼭 �ݺ�
				int day = sDay.get(Calendar.DATE);
                System.out.print((day < 10)? "  "+day : " "+day ); 

				if(n++%7==0) System.out.println();	// 7��ġ�� ��� ���� ���� �ٲ۴�.
            } 
      } // main
} 
