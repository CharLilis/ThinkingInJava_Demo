package com.lilith.thinkinginjava.unit12;

import com.lilith.tool.Print;
/**
 * P261	
 * 一个简单的容器
 * @author Perform
 *
 */
public class DynanicFields {
	private Object[][] fields;
	public DynanicFields(int initialSize) {
		fields = new Object[initialSize][2];
		for(int i=0; i<fields.length; i++) {
			fields[i] = new Object[] {null, null};
		}
	}
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for(Object[] obj : fields) {
			sb.append(obj[0]);
			sb.append(":");
			sb.append(obj[1]);
			sb.append("\n");
		}
		return sb.toString();
	}
	/**
	 * 检查是否有指定对象，有就返回它的位置，没有返回-1
	 * @param id
	 * @return
	 */
	private int hasFiled(String id) {
		for(int i = 0; i < fields.length; i++) {
			if(id.equals(fields[i][0])) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * 封装了一层异常，如果hasFiled方法返回的时-1，则抛出自定义异常
	 * @param id
	 * @return
	 * @throws DynamicFieldsException
	 */
	private int getFieldNumber(String id) throws NoSuchFieldException{
		int fieldNum = hasFiled(id);
		if(fieldNum == -1) {
			throw new NoSuchFieldException();
		}
		return fieldNum;
	}
	/**
	 * 放入参数
	 * @param id
	 * @return
	 */
	private int makeField(String id) {
		for(int i = 0; i < fields.length; i++) {
			if(fields[i][0] == null) {
				fields[i][0] = id;
				return i;
			}
		}
		
		Object[][] temp = new Object[fields.length + 1][];
		for(int i =  0; i < fields.length; i++) {
			temp[i] = fields[i];
		}
		for(int i = fields.length; i < temp.length; i++) {
			temp[i] = new Object[]{null, null};
		}
		fields = temp;
		return makeField(id);
	}
	/**
	 * 获得保存的对象
	 * @param id
	 * @return
	 * @throws DynamicFieldsException 
	 */
	public Object getField(String id) throws NoSuchFieldException {
		return fields[getFieldNumber(id)][1];
	}
	/**
	 * 存放新数据，并将旧数据返回
	 * @param id
	 * @param value
	 * @return
	 * @throws DynamicFieldsException
	 */
	public Object setField(String id, Object value) throws DynamicFieldsException {
		if(value == null) {
			DynamicFieldsException dfe = new DynamicFieldsException();
			dfe.initCause(new NullPointerException());
			throw dfe;
		}
		int fieldNumber = hasFiled(id);
		if(fieldNumber == -1) {
			fieldNumber = makeField(id);
		}
		Object result = null;
		try {
			result = getField(id);
		} catch (NoSuchFieldException e) {
			throw new RuntimeException(e);
		}
		fields[fieldNumber][1] = value;
		return result;
	}
	
	public static void main(String[] args) {
		DynanicFields df = new DynanicFields(3);
		Print.println(df);
		try {
			df.setField("d", "A value for d");
			df.setField("number", 47);
			df.setField("number2", 48);
			Print.println(df);
			df.setField("d", "A value for d");
			df.setField("number3", 11);
			Print.println(df);
			Print.println("df.getField(\"d\"):" + df.getField("d"));
			Object field = df.setField("d",	null);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (DynamicFieldsException e) {
			e.printStackTrace();
		}
	}
}
class DynamicFieldsException extends Exception{}
