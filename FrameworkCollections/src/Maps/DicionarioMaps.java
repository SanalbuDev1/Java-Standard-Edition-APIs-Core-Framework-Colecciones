package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DicionarioMaps {
	
	public static void main(String[] args) {
		
		Map<String,String> datos = new HashMap<>();
		datos.put("clave", "xsad2183721387123");
		datos.put("clave2", "xsad2183721387123");
		
		System.out.println(datos.get("clave"));
		System.out.println(datos.containsKey("clave2"));
		
		Set<String> claves = datos.keySet();
		
		for (String string : claves) {
			System.out.println(string);
		}
		
		//	Caso 2	
		Map<String,String> datos2 = new HashMap<>();
		datos2.put("clave", "xsad2183721387123");
		datos2.put("clave2", "xsad2183721387123");
		
		for (Map.Entry<String, String> entry : datos2.entrySet()) {
		    System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());
		}
		
		
        // Caso 3 con List
		
		List<Map<String,String>> data = new ArrayList<>();
		data.add(datos2);
		data.add(datos);
		
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}		
	
	}
	
}
