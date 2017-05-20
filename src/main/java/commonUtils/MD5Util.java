package commonUtils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * md5生存工具
 * @author chenll
 *
 */
public class MD5Util {
	
	
	/**
	 * 得到md5加密字符串
	 * @param source
	 * @return
	 */
	public static String getMD5(String source){
		String result="";
		try {
			//获取MD5摘要算法的 MessageDigest 对象
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			
			// 使用指定byte[]更新摘要
			messageDigest.update(source.getBytes("UTF8"));//转化成按utf-8编码的byte数组
			// 完成计算，返回结果数组
			result = toHexString(messageDigest.digest());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * 将产生的消息字节组数转成16进制字符串
	 * @param byteArray
	 * @return
	 */
	public static String toHexString(byte[] byteArray){
		StringBuffer md5StrBuff = new StringBuffer();  
		  
        for (int i = 0; i < byteArray.length; i++) {  
            if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)  //每个byte位与之后用2位16进制表示
                md5StrBuff.append("0").append(  
                        Integer.toHexString(0xFF & byteArray[i]));  
            else  
                md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));  
        }  
  
        return md5StrBuff.toString();  
	}

}
