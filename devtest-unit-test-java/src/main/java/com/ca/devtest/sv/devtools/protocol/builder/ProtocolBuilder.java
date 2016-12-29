/**
 * 
 */
package com.ca.devtest.sv.devtools.protocol.builder;

import java.util.HashMap;
import java.util.Map;

import com.ca.devtest.sv.devtools.protocol.BaseProtocol;

/**
 * @author gaspa03
 *
 */
public abstract class ProtocolBuilder<T extends BaseProtocol> {

	protected final String typebuilder ;
	protected Map<String, String> parameters= new HashMap<String, String>();
	
	public ProtocolBuilder( String type) {
		this.typebuilder=type;
	}

	
	

	
	/**
	 * @return
	 */
	public T  build(){
		
		T  baseProtocol = doBuild();
		baseProtocol.getParameters().putAll(parameters);
		return baseProtocol;
	}


	

	/**
	 * @return
	 */
	protected  abstract <T> T doBuild() ;

	
}
