package biz.directnorth.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectLogger {

	private static final Log log = LogFactory.getLog(ObjectMapper.class);	
	private static final ObjectMapper mapper = new ObjectMapper();
	
	public Object toJson(Object payload) {
		try {
			log.info(mapper.writeValueAsString(payload));
		} catch (JsonProcessingException e) {
			log.error(e.getMessage(), e);
		}
		return payload;
	}
  
}
