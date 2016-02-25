package br.com.opining.library.client.model.room.polarized;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public enum Side {
	
	ACCEPTED (1, "Accepted"), 
	WRONG_ANSWER (2, "Wrong Answer");

	private final int typeValue;
	private final String typeName;  

	Side(int typeValue, String typeName) {
		this.typeValue = typeValue;
		this.typeName = typeName;
	}
	
	@XmlElement
	public int getTypeValue() {
		return this.typeValue;
	}
	
	@XmlElement
	public String getTypeName() {
		return this.typeName;
	}
	
	public static final Side getTypeSideById(int typeId)
			throws IllegalArgumentException {
		
		for (Side typeSide : Side.values()) {
			if (typeSide.typeValue == typeId)
				return typeSide;
		}
		
		throw new IllegalArgumentException(
				"There is no TypeSide for the specified typeCode.");
	}

	public static final  Side getTypeSideByTypeName(String typeName) 
			throws IllegalArgumentException {
		
		for (Side typeSide : Side.values()) {
			if (typeSide.typeName.equalsIgnoreCase(typeName))
				return typeSide;
		}
		
		throw new IllegalArgumentException(
				"There is no TypeSide for the specified typeName.");
	}
	
}
