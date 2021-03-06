package commonUtils;

import org.apache.commons.beanutils.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONArray;
import org.json.JSONObject;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * @框架唯一的升级和技术支持地址：http://shop111863449.taobao.com
 */
public class BeanUtils {

	private static final Log log = LogFactory.getLog(BeanUtils.class);

	public static Map describeAvailableParameter(Object bean) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		if (bean == null) {
			return (new HashMap());
		}
		Map description = new HashMap();
		if (bean instanceof DynaBean) {
			DynaProperty[] descriptors = ((DynaBean) bean).getDynaClass().getDynaProperties();
			for (int i = 0; i < descriptors.length; i++) {
				String name = descriptors[i].getName();
				description.put(name, org.apache.commons.beanutils.BeanUtils.getProperty(bean, name));
			}
		} else {
			PropertyDescriptor[] descriptors = BeanUtilsBean.getInstance().getPropertyUtils().getPropertyDescriptors(bean);
			Class clazz = bean.getClass();
			for (int i = 0; i < descriptors.length; i++) {
				String name = descriptors[i].getName();
				if (name.startsWith("$")) {
					// System.out.println("clazz===" + clazz);
					// System.out.println("descriptors[i].getReadMethod()===" + descriptors[i].getReadMethod());
					if (MethodUtils.getAccessibleMethod(clazz, descriptors[i].getReadMethod()) != null) {
						description.put(name, PropertyUtils.getNestedProperty(bean, name));
					}
				}
			}
		}
		return (description);
	}

	// revise commonUtils.BeanUtils describe method do not copy data type
	public static Map describe(Object bean) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		if (bean == null) {
			return (new HashMap());
		}
		Map description = new HashMap();
		if (bean instanceof DynaBean) {
			DynaProperty[] descriptors = ((DynaBean) bean).getDynaClass().getDynaProperties();
			for (int i = 0; i < descriptors.length; i++) {
				String name = descriptors[i].getName();
				description.put(name, org.apache.commons.beanutils.BeanUtils.getProperty(bean, name));
			}
		} else {
			PropertyDescriptor[] descriptors = BeanUtilsBean.getInstance().getPropertyUtils().getPropertyDescriptors(bean);
			Class clazz = bean.getClass();
			for (int i = 0; i < descriptors.length; i++) {
				String name = descriptors[i].getName();
				if (MethodUtils.getAccessibleMethod(clazz, descriptors[i].getReadMethod()) != null) {
					description.put(name, PropertyUtils.getNestedProperty(bean, name));
				}
			}
		}
		return (description);
	}
	
	
	public static JSONArray describeToJson(List<?> list) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException 
	{
		JSONArray jarr = new JSONArray();
		if(list.size()==0) return new JSONArray();
		
		for(Object obj : list){
			jarr.put(describeToJson(obj));
		}
		return jarr;
	}
	
	public static JSONObject describeToJson(Object bean) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException 
	{
		JSONObject description = new JSONObject();
		if (bean == null) {
			return (description);
		}
		
		if (bean instanceof DynaBean) {
			DynaProperty[] descriptors = ((DynaBean) bean).getDynaClass().getDynaProperties();
			for (int i = 0; i < descriptors.length; i++) 
			{
				String name = descriptors[i].getName();
				Object prop = org.apache.commons.beanutils.BeanUtils.getProperty(bean, name);
				if(prop==null){}
				else if(prop.getClass().isArray()){
					Object[] c = (Object[]) prop;
					if(c.length==0) continue;
					JSONArray jarr = new JSONArray();
					for(Object obj : c){
						jarr.put(describeToJson(obj));
					}
					description.put(name,jarr);
				} else if(prop instanceof Collection<?> ){
					Collection<?> c = (Collection<?>) prop;
					if(c.size()==0) continue;
					JSONArray jarr = new JSONArray();
					for(Object obj : c){
						jarr.put(describeToJson(obj));
					}
					description.put(name,jarr);
				}else if(prop instanceof List<?> ){
					List<?>  c = (List<?> ) prop;
					if(c.size()==0) continue;
					JSONArray jarr = new JSONArray();
					for(Object obj : c){
						jarr.put(describeToJson(obj));
					}
					description.put(name,jarr);
				}else{
					description.put(name, prop);
				}
			}
		}else {
			PropertyDescriptor[] descriptors = BeanUtilsBean.getInstance().getPropertyUtils().getPropertyDescriptors(bean);
			
			for (int i = 0; i < descriptors.length; i++) {
				String name = descriptors[i].getName();
				if (MethodUtils.getAccessibleMethod(bean.getClass(), descriptors[i].getReadMethod()) != null) 
				{
					Object prop = PropertyUtils.getNestedProperty(bean, name);
					if(prop==null){}
					else if(prop.getClass().isArray()){
						Object[] c = (Object[]) prop;
						if(c.length==0) continue;
						JSONArray jarr = new JSONArray();
						for(Object obj : c){
							jarr.put(describeToJson(obj));
						}
						description.put(name,jarr);
					} else if(prop instanceof Collection<?> ){
						Collection<?> c = (Collection<?>) prop;
						if(c.size()==0) continue;
						JSONArray jarr = new JSONArray();
						for(Object obj : c){
							jarr.put(describeToJson(obj));
						}
						description.put(name,jarr);
					}else if(prop instanceof List<?> ){
						List<?>  c = (List<?> ) prop;
						if(c.size()==0) continue;
						JSONArray jarr = new JSONArray();
						for(Object obj : c){
							jarr.put(describeToJson(obj));
						}
						description.put(name,jarr);
					}else{
						description.put(name, prop);
					}
				}
			}
		}
		return (description);
	}

	private static Set<String> notCopyProperties = new HashSet<String>();

	static {
		notCopyProperties.add("class");
		notCopyProperties.add("propName");
		notCopyProperties.add("propValue");
		notCopyProperties.add("currentPage");
		notCopyProperties.add("maxResults");
		notCopyProperties.add("sortColumns");
		notCopyProperties.add("cmd");
	}

	public static void copyProperties(Object dest, Object orig) throws IllegalAccessException, InvocationTargetException {

		// Validate existence of the specified beans
		if (dest == null) {
			throw new IllegalArgumentException("No destination bean specified");
		}
		if (orig == null) {
			throw new IllegalArgumentException("No origin bean specified");
		}
		if (log.isDebugEnabled()) {
			log.debug("commonUtils.BeanUtils.copyProperties(" + dest + ", " + orig + ")");
		}

		// Copy the properties, converting as necessary
		BeanUtilsBean bub = BeanUtilsBean.getInstance();
		if (orig instanceof DynaBean) {
			DynaProperty[] origDescriptors = ((DynaBean) orig).getDynaClass().getDynaProperties();
			for (int i = 0; i < origDescriptors.length; i++) {
				String name = origDescriptors[i].getName();
				// Need to check isReadable() for WrapDynaBean
				// (see Jira issue# BEANUTILS-61)
				if (bub.getPropertyUtils().isReadable(orig, name) && bub.getPropertyUtils().isWriteable(dest, name)) {
					Object value = ((DynaBean) orig).get(name);
					bub.copyProperty(dest, name, value);
				}
			}
		} else if (orig instanceof Map) {
			Iterator entries = ((Map) orig).entrySet().iterator();
			while (entries.hasNext()) {
				Map.Entry entry = (Map.Entry) entries.next();
				String name = (String) entry.getKey();
				if (bub.getPropertyUtils().isWriteable(dest, name)) {
					bub.copyProperty(dest, name, entry.getValue());
				}
			}
		} else /* if (orig is a standard JavaBean) */{
			PropertyDescriptor[] origDescriptors = bub.getPropertyUtils().getPropertyDescriptors(orig);
			for (int i = 0; i < origDescriptors.length; i++) {
				String name = origDescriptors[i].getName();
				if (notCopyProperties.contains(name) || name.startsWith("$")) {
					continue; // No point in trying to set an object's class
				}
				if (bub.getPropertyUtils().isReadable(orig, name) && bub.getPropertyUtils().isWriteable(dest, name)) {
					try {
						Object value = bub.getPropertyUtils().getSimpleProperty(orig, name);
						bub.copyProperty(dest, name, value);
					} catch (NoSuchMethodException e) {
						// Should not happen
					}
				}
			}
		}
	}

	public static void copyPropertiesExceptNull(Object dest, Object orig) throws IllegalAccessException, InvocationTargetException {

		// Validate existence of the specified beans
		if (dest == null) {
			throw new IllegalArgumentException("No destination bean specified");
		}
		if (orig == null) {
			throw new IllegalArgumentException("No origin bean specified");
		}
		if (log.isDebugEnabled()) {
			log.debug("commonUtils.BeanUtils.copyProperties(" + dest + ", " + orig + ")");
		}

		// Copy the properties, converting as necessary
		BeanUtilsBean bub = BeanUtilsBean.getInstance();
		if (orig instanceof DynaBean) {
			DynaProperty[] origDescriptors = ((DynaBean) orig).getDynaClass().getDynaProperties();
			for (int i = 0; i < origDescriptors.length; i++) {
				String name = origDescriptors[i].getName();
				// Need to check isReadable() for WrapDynaBean
				// (see Jira issue# BEANUTILS-61)
				if (bub.getPropertyUtils().isReadable(orig, name) && bub.getPropertyUtils().isWriteable(dest, name)) {
					Object value = ((DynaBean) orig).get(name);
					bub.copyProperty(dest, name, value);
				}
			}
		} else if (orig instanceof Map) {
			Iterator entries = ((Map) orig).entrySet().iterator();
			while (entries.hasNext()) {
				Map.Entry entry = (Map.Entry) entries.next();
				String name = (String) entry.getKey();
				if (bub.getPropertyUtils().isWriteable(dest, name)) {
					bub.copyProperty(dest, name, entry.getValue());
				}
			}
		} else /* if (orig is a standard JavaBean) */{
			PropertyDescriptor[] origDescriptors = bub.getPropertyUtils().getPropertyDescriptors(orig);
			for (int i = 0; i < origDescriptors.length; i++) {
				String name = origDescriptors[i].getName();
				if ("class".equals(name) || "propName".equals(name) || "propValue".equals(name)) {
					continue; // No point in trying to set an object's class
				}
				if (bub.getPropertyUtils().isReadable(orig, name) && bub.getPropertyUtils().isWriteable(dest, name)) {
					try {
						Object value = bub.getPropertyUtils().getSimpleProperty(orig, name);
						if (value != null) {
							bub.copyProperty(dest, name, value);
						}
					} catch (NoSuchMethodException e) {
						// Should not happen
					}
				}
			}
		}
	}

	public static void copyProperties(Object dest, Object orig, List<String> excludedProp) throws IllegalAccessException, InvocationTargetException {

		// Validate existence of the specified beans
		if (dest == null) {
			throw new IllegalArgumentException("No destination bean specified");
		}
		if (orig == null) {
			throw new IllegalArgumentException("No origin bean specified");
		}
		if (log.isDebugEnabled()) {
			log.debug("commonUtils.BeanUtils.copyProperties(" + dest + ", " + orig + ")");
		}

		// Copy the properties, converting as necessary
		BeanUtilsBean bub = BeanUtilsBean.getInstance();
		if (orig instanceof DynaBean) {
			DynaProperty[] origDescriptors = ((DynaBean) orig).getDynaClass().getDynaProperties();
			for (int i = 0; i < origDescriptors.length; i++) {
				String name = origDescriptors[i].getName();
				// Need to check isReadable() for WrapDynaBean
				// (see Jira issue# BEANUTILS-61)
				if (bub.getPropertyUtils().isReadable(orig, name) && bub.getPropertyUtils().isWriteable(dest, name)) {
					Object value = ((DynaBean) orig).get(name);
					bub.copyProperty(dest, name, value);
				}
			}
		} else if (orig instanceof Map) {
			Iterator entries = ((Map) orig).entrySet().iterator();
			while (entries.hasNext()) {
				Map.Entry entry = (Map.Entry) entries.next();
				String name = (String) entry.getKey();
				if (bub.getPropertyUtils().isWriteable(dest, name)) {
					bub.copyProperty(dest, name, entry.getValue());
				}
			}
		} else /* if (orig is a standard JavaBean) */{
			PropertyDescriptor[] origDescriptors = bub.getPropertyUtils().getPropertyDescriptors(orig);
			for (int i = 0; i < origDescriptors.length; i++) {
				String name = origDescriptors[i].getName();
				if ("class".equals(name) || excludedProp.contains(name)) {
					continue; // No point in trying to set an object's class
				}
				if (bub.getPropertyUtils().isReadable(orig, name) && bub.getPropertyUtils().isWriteable(dest, name)) {
					try {
						Object value = bub.getPropertyUtils().getSimpleProperty(orig, name);
						bub.copyProperty(dest, name, value);
					} catch (NoSuchMethodException e) {
						// Should not happen
					}
				}
			}
		}
	}

}
