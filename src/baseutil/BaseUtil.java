package baseutil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �ַ���������
 * @author hutao
 *
 */
public class BaseUtil {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	/**
	 * �ж�һ���ַ�����Ϊ��
	 * @param str
	 * @return
	 */
	public static boolean isNotBlank(String str){
		if(str==null || str.length()==0){
			return false;
		}
		return true;
	}
	
	/**
	 * �ַ�������
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static String stringConcat(String str1,String str2){
		if(str1==null && str2==null){
			return "";
		}
		if(str1==null && str2!=null){
			return str2;
		}
		if(str2==null && str1!=null){
			return str1;
		}
		return str1.concat(str2);
	}
	
	/**
	 * �ַ���ת����
	 * @param str
	 * @return
	 */
	public static char[] string2Array(String str){
		if(isNotBlank(str)){
			return str.toCharArray();
		}
		return new char[0];
	} 
	
	/**
	 * �ַ�����ת
	 * @param str
	 * @return
	 */
	public static String string2Reverse(String str){
		if(isNotBlank(str)){
			return new StringBuilder(str).reverse().toString();
		}
		return "";
	}
	
	
	/**
	 * ����������ӣ������µ�����
	 * @param array1
	 * @param array2
	 * @return
	 */
	public static String[] array2arrays(String[] array1,String[] array2){
		if(array1==null || array1.length==0){
			return array2;
		}
		if(array2==null || array2.length==0){
			return array1;
		}else{
			String[] result = new String[array1.length+array2.length];
			for (int i = 0; i < array1.length; i++) {
				result[i] = array1[i];
			}
			for (int i = 0; i < array2.length; i++) {
				result[array1.length+i]=array2[i];
			}
			return result;
		}
	}
	
	/**
	 * �ַ���תʱ��
	 * @param str
	 * @return
	 */
	public static Date string2Date(String str){
		if(isNotBlank(str)){
			try {
				return sdf.parse(str);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * ʱ��ת�ַ���
	 * @param date
	 * @return
	 */
	public static String date2String(Date date){
		return sdf.format(date);
	}
	
	/**
	 * ʱ���תʱ���ַ���
	 * @param date
	 * @return
	 */
	public static String timeStamp2Date(long date){
		return sdf.format(new Date(date));
	}
	
	/**
	 * ʱ��ת����ʱ���
	 * @param date
	 * @return
	 */
	public static long date2timeStamp(Date date){
		return date.getTime();
	}
	
	/**
	 * �ַ���תLong��
	 * @param str
	 */
	public static long string2long(String str){
		return Long.parseLong(str);
	}
	
	/**
	 * long����ת�ַ���
	 * @param number
	 * @return
	 */
	public static String long2string(long number){
		return String.valueOf(number);
	}
	
	/**
	 * �ַ���תint��
	 * @param str
	 * @return
	 */
	public static Integer string2int(String str){
		return Integer.parseInt(str);
	}
	
	/**
	 * int��ת�ַ���
	 * @param number
	 * @return
	 */
	public static String int2string(int number){
		return String.valueOf(number);
	}
	
	/**
	 * ��ȡ�ļ���׺��
	 * @param filepath
	 * @return
	 */
	public static String getSuffix(String filepath){
		if(isNotBlank(filepath)){
			if(filepath.lastIndexOf(".")==-1){
				return "";
			}else{
				return filepath.substring(filepath.lastIndexOf(".")+1);
			}
		}
		return "";
	}
	
}
